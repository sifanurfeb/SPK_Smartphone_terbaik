/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import database.konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIFA
 */
public class hitung extends javax.swing.JPanel {
    DefaultTableModel tabNormal;
    
    public hitung() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitungNormalisasi = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab_normal = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_alter = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_nilai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnhitung = new javax.swing.JButton();

        hitungNormalisasi.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATA PERHITUNGAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab_normal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tab_normal);

        jLabel3.setText("Tabel Normalisasi");

        tab_alter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tab_alter);

        jLabel4.setText("Tabel Alternatif");

        tab_nilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tab_nilai);

        jLabel1.setText("Tabel Ranking");

        btnhitung.setText("hitung");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hitungNormalisasiLayout = new javax.swing.GroupLayout(hitungNormalisasi);
        hitungNormalisasi.setLayout(hitungNormalisasiLayout);
        hitungNormalisasiLayout.setHorizontalGroup(
            hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                        .addGroup(hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                .addGroup(hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnhitung)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        hitungNormalisasiLayout.setVerticalGroup(
            hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(hitungNormalisasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnhitung)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(hitungNormalisasiLayout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(hitungNormalisasi, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(hitungNormalisasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        // TODO add your handling code here:
        normal();
    }//GEN-LAST:event_btnhitungActionPerformed
public void normal(){
        LinkedList<DataItem> dataItems = new LinkedList<>();

        try {
            Connection conn = (Connection)konek.KoneksiDB();

            // Ambil data dari database
            String selectQuery = "SELECT harga, chipset, ram, rom, kamera, baterai, layar FROM tbl_subkriteria";
            PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            // Tambahkan data ke LinkedList
            while (resultSet.next()) {
//                String id = resultSet.getString("id");
                double harga = resultSet.getDouble("harga");
                double chipset = resultSet.getDouble("chipset");
                double ram = resultSet.getDouble("ram");
                double rom = resultSet.getDouble("rom");
                double kamera = resultSet.getDouble("kamera");
                double baterai = resultSet.getDouble("baterai");
                double layar = resultSet.getDouble("layar");
                dataItems.add(new DataItem( harga, chipset, ram, rom, kamera, baterai, layar));
            }

            // Hitung nilai maksimum dari semua data
            double maxAttributeValue = getMaxAttributeValue(dataItems);

            // Tampilkan hasil normalisasi dalam JTable
            String[] columnNames = {"ID","harga", "chipset", "ram", "rom", "kamera" ," baterai", "layar"};
            tabNormal.setColumnIdentifiers(columnNames);
            tab_normal.setModel(tabNormal);

            for (DataItem item : dataItems) {
                double harga = item.harga / maxAttributeValue;
                double Chipset = item.chipset / maxAttributeValue;
                double Ram = item.ram / maxAttributeValue;
                double Rom = item.rom / maxAttributeValue;
                double Kamera = item.kamera / maxAttributeValue;
                double Baterai = item.baterai / maxAttributeValue;
                double Layar = item.layar / maxAttributeValue;
                tabNormal.addRow(new Object[]{item.id, harga, Chipset, Ram, Rom, Kamera, Baterai, Layar});
                tab_normal.setModel(tabNormal);
                
                // Simpan hasil normalisasi ke dalam tabel normalisasi (misalnya: normalisasi_table)
                String insertQuery = "INSERT INTO normalisasi (id, harga, chipset, ram, rom, kamera, baterai, layar) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                
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

            // Tutup sumber daya
            resultSet.close();
            selectStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static double getMaxAttributeValue(LinkedList<DataItem> dataItems) {
        double maxAttributeValue = Double.MIN_VALUE;
        for (DataItem item : dataItems) {
            maxAttributeValue = Math.max(maxAttributeValue, Math.max(item.harga, item.harga));
        }
        return maxAttributeValue;
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
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JPanel hitungNormalisasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tab_alter;
    private javax.swing.JTable tab_nilai;
    private javax.swing.JTable tab_normal;
    // End of variables declaration//GEN-END:variables
}
