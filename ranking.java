package perhitungan;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class ranking {
    public static void main(String[] args) {
        // Informasi database
        String url = "jdbc:mysql://localhost:3306/spk";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Statement stmt = conn.createStatement();

            // Ambil data normalisasi dari database
            ResultSet normalizationResult = stmt.executeQuery("SELECT id, harga, chipset, ram, rom, kamera, baterai, layar FROM normalisasi");

            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Data ID", "Total Score"}, 0);

            // Perhitungan ranking dan penyimpanan ke dalam tabel
            while (normalizationResult.next()) {
                int id = normalizationResult.getInt("id");
                double[] normalizedValues = new double[7];
                normalizedValues[0] = normalizationResult.getDouble("harga");
                normalizedValues[1] = normalizationResult.getDouble("chipset");
                normalizedValues[2] = normalizationResult.getDouble("ram");
                normalizedValues[3] = normalizationResult.getDouble("rom");
                normalizedValues[4] = normalizationResult.getDouble("kamera");
                normalizedValues[5] = normalizationResult.getDouble("baterai");
                normalizedValues[6] = normalizationResult.getDouble("layar");

                double totalWeightedScore = 0.0;

                try (ResultSet criteriaResult = stmt.executeQuery("SELECT K1, K2, K3, K4, K5, K6, K7 FROM tbl_kriteria")) {
                    if (criteriaResult.next()) {
                        double[] weights = new double[7];
                        weights[0] = criteriaResult.getDouble("K1");
                        weights[1] = criteriaResult.getDouble("K2");
                        weights[2] = criteriaResult.getDouble("K3");
                        weights[3] = criteriaResult.getDouble("K4");
                        weights[4] = criteriaResult.getDouble("K5");
                        weights[5] = criteriaResult.getDouble("K6");
                        weights[6] = criteriaResult.getDouble("K7");

                        for (int i = 0; i < 7; i++) {
                            double normalizedValue = normalizedValues[i];
                            double weight = weights[i];

                            double weightedScore = weight*normalizedValue;
                            totalWeightedScore += weightedScore;
                        }
                    }
                }

                // Simpan hasil ranking ke dalam tabel "ranking"
                String insertQuery = "INSERT INTO tbl_ranking (id, nilai) VALUES (?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery);
                insertStmt.setInt(1, id);
                insertStmt.setDouble(2, totalWeightedScore);
                insertStmt.executeUpdate();

                // Tambahkan data ke dalam tampilan tabel
                tableModel.addRow(new Object[]{id, totalWeightedScore});
            }

            stmt.close();

            // Tampilkan tampilan tabel menggunakan Java Swing
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("SAW Ranking Results");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JTable table = new JTable(tableModel);
                JScrollPane scrollPane = new JScrollPane(table);
                frame.getContentPane().add(scrollPane);
                frame.pack();
                frame.setVisible(true);
            });

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



