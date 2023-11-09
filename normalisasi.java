package Perhitungan;

import database.konek;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class normalisasi {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Normalisasi Alternatif");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        String jdbcUrl = "jdbc:mysql://localhost:3306/spk";
        String username = "root";
        String password = "";

        LinkedList<DataItem> dataItems = new LinkedList<>();

        try {
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            
            String selectQuery = "SELECT harga, chipset, ram, rom, kamera, baterai, layar FROM tbl_subkriteria";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            
            while (resultSet.next()) {               
                double harga = resultSet.getDouble("harga");
                double chipset = resultSet.getDouble("chipset");
                double ram = resultSet.getDouble("ram");
                double rom = resultSet.getDouble("rom");
                double kamera = resultSet.getDouble("kamera");
                double baterai = resultSet.getDouble("baterai");
                double layar = resultSet.getDouble("layar");
                dataItems.add(new DataItem(harga, chipset, ram, rom, kamera, baterai, layar));
            }

            
            double maxNilai = getMax(dataItems);

            
            String[] columnNames = {"ID","harga", "chipset", "ram", "rom", "kamera" ," baterai", "layar"};
            tableModel.setColumnIdentifiers(columnNames);

            for (DataItem item : dataItems) {
                double harga = item.harga / maxNilai;
                double Chipset = item.chipset / maxNilai;
                double Ram = item.ram / maxNilai;
                double Rom = item.rom / maxNilai;
                double Kamera = item.kamera / maxNilai;
                double Baterai = item.baterai / maxNilai;
                double Layar = item.layar / maxNilai;
                tableModel.addRow(new Object[]{item.id, harga, Chipset, Ram, Rom, Kamera, Baterai, Layar});

                
                String insertQuery = "INSERT INTO normalisasi (id, harga, chipset, ram, rom, kamera, baterai, layar) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
                
                
                insertStatement.setString(1, item.id);
                insertStatement.setDouble(2, harga);
                insertStatement.setDouble(3, Chipset);
                insertStatement.setDouble(4, Ram);
                insertStatement.setDouble(5, Rom);
                insertStatement.setDouble(6, Kamera);
                insertStatement.setDouble(7, Baterai);
                insertStatement.setDouble(8, Layar);
                
                insertStatement.executeUpdate();
            }

            
            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        frame.pack();
        frame.setVisible(true);
    }

    private static double getMax(LinkedList<DataItem> dataItems) {
        double maxNilai = Double.MIN_VALUE;
        for (DataItem item : dataItems) {
            maxNilai = Math.max(maxNilai, Math.max(item.kamera, item.harga));
        }
        return maxNilai;
    }

    static class DataItem {
        String id;
        double harga;
        double chipset;
        double ram;
        double rom;
        double kamera;
        double baterai;
        double layar;

    

        private DataItem(double harga, double chipset, double ram, double rom, double kamera, double baterai, double layar) {
            this.harga = harga;
            this.chipset = chipset;
            this.ram = ram;
            this.rom = rom;
            this.kamera = kamera;
            this.baterai = baterai;
            this.layar = layar;
            this.id = id;

            
        }
    }
}