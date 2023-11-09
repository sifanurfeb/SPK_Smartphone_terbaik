package Perhitungan;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;
import java.awt.*;
import java.sql.*;

public class Rank {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/spk";
        String username = "root";
        String password = "";

        try {
            CachedRowSet normalizationResult = new CachedRowSetImpl();
            normalizationResult.setUrl(url);
            normalizationResult.setUsername(username);
            normalizationResult.setPassword(password);
            normalizationResult.setCommand("SELECT harga, chipset, ram, rom, kamera, baterai, layar FROM normalisasi");
            normalizationResult.execute();

            DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"Data ID", "Total Score"}, 0);

            
            double[] nilaiNormal1 = new double[7];
            double[] nilaiNormal2 = new double[7];
            double[] nilaiNormal3 = new double[7];
            double[] nilaiNormal4 = new double[7];
            double[] nilaiNormal5 = new double[7];
            double[] nilaiNormal6 = new double[7];
            double[] nilaiNormal7 = new double[7];
            double[] bobot = new double[7];

            try (Connection conn = DriverManager.getConnection(url, username, password);
                 Statement stmt = conn.createStatement();
                 ResultSet criteriaResult = stmt.executeQuery("SELECT K1, K2, K3, K4, K5, K6, K7 FROM tbl_kriteria")) {

                if (criteriaResult.next()) {
                    bobot[0] = criteriaResult.getDouble("K1");
                    bobot[1] = criteriaResult.getDouble("K2");
                    bobot[2] = criteriaResult.getDouble("K3");
                    bobot[3] = criteriaResult.getDouble("K4");
                    bobot[4] = criteriaResult.getDouble("K5");
                    bobot[5] = criteriaResult.getDouble("K6");
                    bobot[6] = criteriaResult.getDouble("K7");
                }

                // Mengumpulkan data normalisasi
                int i = 0;
                while (normalizationResult.next()) {
                    nilaiNormal1[i] = normalizationResult.getDouble("harga");
                    nilaiNormal2[i] = normalizationResult.getDouble("chipset");
                    nilaiNormal3[i] = normalizationResult.getDouble("ram");
                    nilaiNormal4[i] = normalizationResult.getDouble("rom");
                    nilaiNormal5[i] = normalizationResult.getDouble("kamera");
                    nilaiNormal6[i] = normalizationResult.getDouble("baterai");
                    nilaiNormal7[i] = normalizationResult.getDouble("layar");
                    i++;
                }

                // Hitung dan simpan hasil ranking
                for (int j = 0; j < i; j++) {
                    double totalBobot = 0.0;

                    for (int k = 0; k < 7; k++) {
                        double weightedScore = bobot[k] * nilaiNormal1[j];
                        totalBobot += weightedScore;
                    }

                    int id = j + 1;
                    String insertQuery = "INSERT INTO tbl_ranking (id, nilai) VALUES (?, ?)";
                    PreparedStatement tbhRank = conn.prepareStatement(insertQuery);
                    tbhRank.setInt(1, id);
                    tbhRank.setDouble(2, totalBobot);
                    tbhRank.executeUpdate();

                    
                    tableModel.addRow(new Object[]{id, totalBobot});

                    
                    tbhRank.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Tampilkan tampilan tabel menggunakan Java Swing
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("SAW Ranking");
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

