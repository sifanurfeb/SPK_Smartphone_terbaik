package Form;

import database.konek;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class FormAlter extends javax.swing.JPanel {

    public PreparedStatement st;
    public ResultSet rs;
    public String id, nama, merk, spek, foto;
    public Connection conn = new konek().KoneksiDB();
    public DefaultTableModel tabel;
    private String id_alter;
    
    public FormAlter() {
        initComponents();
        fokus();
        kosong();
        mainAlter();
    }
    private void fokus(){
        kd_alter.requestFocus();
    }
    private void kosong(){
        kd_alter.setText("");
        nama_alter.setText("");
        cb_merk.setSelectedItem("");
        spek_alter.setText("");
        carialter.setText("");
        
    }

    //cari data
    private void cari(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Smartphone");
        tabel.addColumn("Nama Smartphone");
        tabel.addColumn("Merk Smartphone");
        tabel.addColumn("Spesifikasi Smartphone");
        
        
         try {
             String sql = "SELECT * FROM tbl_alter WHERE nama_alter  LIKE '%"+carialter.getText()+ "%'";
             Connection conn = (Connection)konek.KoneksiDB();
             Statement s = conn.createStatement();
             ResultSet rs =s.executeQuery(sql);
             while(rs.next()){
                 tabel.addRow(new Object[]{
                     rs.getString(1),
                     rs.getString(2),
                     rs.getString(3),
                     rs.getString(4)
                 });
             }
             tbl_alter.setModel(tabel);
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
    }
    //class tambah alternatif smartphone
     private void mainAlter(){
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Smartphone");
        tabel.addColumn("Nama Smartphone");
        tabel.addColumn("Merk Smartphone");
        tabel.addColumn("Spesifikasi Smartphone");
        
        
         try {
             String sql = "SELECT * FROM tbl_alter";
             Statement s = conn.createStatement();
             ResultSet rs =s.executeQuery(sql);
             while(rs.next()){
                 tabel.addRow(new Object[]{
                     rs.getString(1),
                     rs.getString(2),
                     rs.getString(3),
                     rs.getString(4)
                 });
             }
             tbl_alter.setModel(tabel);
             
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanelAlter = new javax.swing.JPanel();
        mainAlter = new javax.swing.JPanel();
        alter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alter = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        add_alter = new javax.swing.JButton();
        edit_alter = new javax.swing.JButton();
        del_alter = new javax.swing.JButton();
        carialter = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        kd_alter = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nama_alter = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cb_merk = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        spek_alter = new javax.swing.JTextArea();
        refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(331, 402));
        setLayout(new java.awt.CardLayout());

        mainPanelAlter.setLayout(new java.awt.CardLayout());

        mainAlter.setBackground(new java.awt.Color(255, 255, 255));
        mainAlter.setLayout(new java.awt.CardLayout());

        alter.setBackground(new java.awt.Color(255, 255, 255));

        tbl_alter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Smartphone", "Nama Smartphone", "Merk Smartphone", "Spesifikasi Smartphone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_alter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_alter);

        jLabel1.setBackground(new java.awt.Color(198, 221, 218));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SMARTPHONE");

        add_alter.setBackground(new java.awt.Color(125, 234, 224));
        add_alter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add_alter.setText("Tambah");
        add_alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_alterActionPerformed(evt);
            }
        });

        edit_alter.setBackground(new java.awt.Color(125, 234, 224));
        edit_alter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        edit_alter.setText("Update");
        edit_alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_alterActionPerformed(evt);
            }
        });

        del_alter.setBackground(new java.awt.Color(125, 234, 224));
        del_alter.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        del_alter.setText("Hapus");
        del_alter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_alterActionPerformed(evt);
            }
        });

        btncari.setBackground(new java.awt.Color(123, 234, 224));
        btncari.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Kode Smartphone : ");

        kd_alter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        kd_alter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel11.setText("Nama Smartphone : ");

        nama_alter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Merk Smartphone : ");

        cb_merk.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cb_merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Merk Smartphone --", "Samsung", "Xiaomi", "Vivo", "Oppo", "Infinix", "Realme", "Tecno", "iPhone" }));
        cb_merk.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cb_merk.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_merkItemStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel13.setText("Spesifikasi Smartphone : ");

        spek_alter.setColumns(20);
        spek_alter.setRows(5);
        spek_alter.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        jScrollPane4.setViewportView(spek_alter);

        refresh.setBackground(new java.awt.Color(125, 234, 224));
        refresh.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alterLayout = new javax.swing.GroupLayout(alter);
        alter.setLayout(alterLayout);
        alterLayout.setHorizontalGroup(
            alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(alterLayout.createSequentialGroup()
                .addGroup(alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(alterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alterLayout.createSequentialGroup()
                                .addComponent(add_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(edit_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(del_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carialter, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncari)
                                .addGap(16, 16, 16))
                            .addComponent(nama_alter)
                            .addComponent(kd_alter)
                            .addGroup(alterLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(alterLayout.createSequentialGroup()
                                .addGroup(alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 782, Short.MAX_VALUE))
                            .addComponent(cb_merk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        alterLayout.setVerticalGroup(
            alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, alterLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(alterLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addGroup(alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(del_alter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_alter, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(edit_alter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(alterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(carialter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncari))))
                .addGap(47, 47, 47)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kd_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(nama_alter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        mainAlter.add(alter, "card2");

        mainPanelAlter.add(mainAlter, "card2");

        add(mainPanelAlter, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void add_alterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_alterActionPerformed
        id = kd_alter.getText();
        nama = nama_alter.getText();
        merk = (String)cb_merk.getSelectedItem();
        spek = spek_alter.getText();
        if(id.equals("") || nama.equals("") || merk.equals("") || spek.equals("")){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong!","informasi",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int confir = JOptionPane.showConfirmDialog(null, "Simpan Data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(confir == 0){
                try {
                    String sql = "INSERT INTO tbl_alter VALUES ('"+id+"','"+nama+"','"+merk+"','"+spek+"')";
                    Connection conn = (Connection)konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
                    mainAlter();
                    kosong();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_add_alterActionPerformed

    private void edit_alterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_alterActionPerformed
        id = kd_alter.getText();
        nama = nama_alter.getText();
        merk = (String)cb_merk.getSelectedItem();
        spek = spek_alter.getText();
        if(id.equals("") || nama.equals("") || merk.equals("") || spek.equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!","informasi",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int confir = JOptionPane.showConfirmDialog(null, "Ubah Data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(confir == 0){
                try {
                    String sql = "UPDATE tbl_alter SET nama_alter = '"+nama+"', merk_alter = '"+merk+"', spek_alter = '"+spek+" ' WHERE tbl_alter.id_alter = '"+id+"'";
                    Connection conn = (Connection)konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
                    mainAlter();
                    kosong();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_edit_alterActionPerformed
 
    private void del_alterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_alterActionPerformed
        // TODO add your handling code here:
        id = kd_alter.getText();
        nama = nama_alter.getText();
        merk = (String)cb_merk.getSelectedItem();
        spek = spek_alter.getText();
        if(id.equals("") || nama.equals("") || merk.equals("") || spek.equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!","informasi",JOptionPane.WARNING_MESSAGE);
        }
        else{
            int confir = JOptionPane.showConfirmDialog(null, "Hapus Data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(confir == 0){
                try {
                    String sql = "DELETE FROM tbl_alter WHERE id_alter = '"+id+"'";
                    Connection conn = (Connection)konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();
                    
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                    mainAlter();
                    kosong();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
        
    }//GEN-LAST:event_del_alterActionPerformed

    private void tbl_alterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alterMouseClicked
        // TODO add your handling code here:
        int no = tbl_alter.rowAtPoint(evt.getPoint());
        
        String id = tbl_alter.getValueAt(no, 0).toString();
        kd_alter.setText(id);
        
        String namaalter = tbl_alter.getValueAt(no, 1).toString();
        nama_alter.setText(namaalter);
        
        String merk = tbl_alter.getValueAt(no, 2).toString();
        cb_merk.setSelectedItem(merk);
        
        String spek = tbl_alter.getValueAt(no, 3).toString();
        spek_alter.setText(spek);
    }//GEN-LAST:event_tbl_alterMouseClicked

    private void cb_merkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_merkItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_merkItemStateChanged

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        cari();
        kosong();
        
    }//GEN-LAST:event_btncariActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        mainAlter();
    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_alter;
    private javax.swing.JPanel alter;
    private javax.swing.JButton btncari;
    private javax.swing.JTextField carialter;
    private javax.swing.JComboBox<String> cb_merk;
    private javax.swing.JButton del_alter;
    private javax.swing.JButton edit_alter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField kd_alter;
    private javax.swing.JPanel mainAlter;
    private javax.swing.JPanel mainPanelAlter;
    private javax.swing.JTextField nama_alter;
    private javax.swing.JButton refresh;
    private javax.swing.JTextArea spek_alter;
    private javax.swing.JTable tbl_alter;
    // End of variables declaration//GEN-END:variables
}
