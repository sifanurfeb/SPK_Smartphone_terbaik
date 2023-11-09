package Form;

import database.konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIFA
 */
public class FormSubKriteria extends javax.swing.JPanel {

    Connection conn = (Connection) konek.KoneksiDB();
    Statement st;
    ResultSet rs;
    DefaultTableModel tabel;
    String id, namaSub, namakri, dtkri, kodekri;

    public FormSubKriteria() {
        initComponents();
        mainSubKriteria();
        kodeAuto();
        tampilkri();
        focus();
        kosong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainSubKriteria = new javax.swing.JPanel();
        subKriteria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addSub = new javax.swing.JButton();
        editSub = new javax.swing.JButton();
        delSub = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sub = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id_sub = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_kri = new javax.swing.JComboBox<>();
        fkriteria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        namasub = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nilaisub = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        carisub = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(331, 402));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(0, 153, 153));
        mainPanel.setLayout(new java.awt.CardLayout());

        mainSubKriteria.setBackground(new java.awt.Color(255, 255, 255));
        mainSubKriteria.setLayout(new java.awt.CardLayout());

        subKriteria.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA SUB KRITERIA");

        addSub.setBackground(new java.awt.Color(125, 234, 224));
        addSub.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        addSub.setText("Tambah");
        addSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubActionPerformed(evt);
            }
        });

        editSub.setBackground(new java.awt.Color(125, 234, 224));
        editSub.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        editSub.setText("Update");
        editSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSubActionPerformed(evt);
            }
        });

        delSub.setBackground(new java.awt.Color(125, 234, 224));
        delSub.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        delSub.setText("Hapus");
        delSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSubActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tbl_sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_sub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Sub Kriteria", "Nama Kriteria", "Nama Sub Kriteria", "Bobot Sub Kriteria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sub.setGridColor(new java.awt.Color(0, 0, 0));
        tbl_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_subMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sub);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Kode Sub Kriteria");

        id_sub.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Nama Kriteria");

        cb_kri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih kriteria" }));
        cb_kri.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cb_kri.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_kriItemStateChanged(evt);
            }
        });

        fkriteria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Nama Sub Kriteria");

        namasub.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Nilai Sub Kriteria");

        nilaisub.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btn_cari.setBackground(new java.awt.Color(125, 234, 224));
        btn_cari.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(125, 234, 224));
        refresh.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subKriteriaLayout = new javax.swing.GroupLayout(subKriteria);
        subKriteria.setLayout(subKriteriaLayout);
        subKriteriaLayout.setHorizontalGroup(
            subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(subKriteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_sub)
                    .addComponent(cb_kri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fkriteria)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                    .addComponent(nilaisub)
                    .addComponent(namasub)
                    .addGroup(subKriteriaLayout.createSequentialGroup()
                        .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(subKriteriaLayout.createSequentialGroup()
                        .addComponent(addSub)
                        .addGap(18, 18, 18)
                        .addComponent(editSub)
                        .addGap(18, 18, 18)
                        .addComponent(delSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(carisub, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cari)))
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        subKriteriaLayout.setVerticalGroup(
            subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subKriteriaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addSub)
                        .addComponent(editSub)
                        .addComponent(delSub))
                    .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cari)
                        .addComponent(carisub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(cb_kri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fkriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namasub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nilaisub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        mainSubKriteria.add(subKriteria, "card2");

        mainPanel.add(mainSubKriteria, "card2");

        add(mainPanel, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void focus() {
        id_sub.requestFocus();
    }

    private void kosong() {
        cb_kri.setSelectedItem("");
        namasub.setText("");
        nilaisub.setText("");
        fkriteria.setText("");
        carisub.setText("");
    }
    private void addSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubActionPerformed
        // TODO add your handling code here:
        id = id_sub.getText();
        kodekri = (String) cb_kri.getSelectedItem();
        namaSub = namasub.getText();
        int bobot = Integer.parseInt(nilaisub.getText());

        if (id.equals("") || kodekri.equals("") || namaSub.equals("")) {
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong!", "informasi", JOptionPane.WARNING_MESSAGE);
        } else {
            int confir = JOptionPane.showConfirmDialog(null, "Simpan Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confir == 0) {
                try {
                    String sql = "INSERT INTO tbl_subkriteria VALUES('" + id + "','" + kodekri + "','" + namaSub + "'," + bobot +")";
                    Connection conn = (Connection) konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
                    mainSubKriteria();
                    kosong();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_addSubActionPerformed

    private void cari() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Sub Kriteria");
        tabel.addColumn("Nama Kriteria");
        tabel.addColumn("Nama Sub Kriteria");
        tabel.addColumn("Bobot Sub Kriteria");

        try {

            String sql
                    = "SELECT kode_sub, "
                    + "tbl_kriteria.nama_kriteria,"
                    + "tbl_subkriteria.nama_sub,"
                    + "tbl_subkriteria.nilai_sub "
                    + "FROM tbl_kriteria, tbl_subkriteria "
                    + "WHERE tbl_kriteria.id_kriteria = tbl_subkriteria.id_kriteria "
                    + "AND tbl_subkriteria.kode_sub LIKE '%" + carisub.getText() + "%'";

            Connection conn = (Connection) konek.KoneksiDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                });
                tbl_sub.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void mainSubKriteria() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Sub Kriteria");
        tabel.addColumn("Nama Kriteria");
        tabel.addColumn("Nama Sub Kriteria");
        tabel.addColumn("Bobot Sub Kriteria");

        try {
            String sql
                    = "SELECT "
                    + "kode_sub,"
                    + "tbl_kriteria.nama_kriteria,"
                    + "tbl_subkriteria.nama_sub,"
                    + "tbl_subkriteria.nilai_sub "
                    + "FROM tbl_kriteria, tbl_subkriteria "
                    + "WHERE tbl_kriteria.id_kriteria = tbl_subkriteria.id_kriteria";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                });
                tbl_sub.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void kodeAuto() {
        try {
            Statement stat = conn.createStatement();
            String sql = "Select max(right(kode_sub,3)) from tbl_subkriteria";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                if (rs.first() == false) {
                    id_sub.setText("S00");
                } else {
                    rs.last();
                    int set_id = rs.getInt(1) + 1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();

                    for (int a = 0; a < 1 - id_next; a++) {
                        no = "00" + no;
                    }
                    id_sub.setText("SB00" + no);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void tbl_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_subMouseClicked
        // TODO add your handling code here:
        int no = tbl_sub.rowAtPoint(evt.getPoint());

        String id = tbl_sub.getValueAt(no, 0).toString();
        id_sub.setText(id);

        String namakri = tbl_sub.getValueAt(no, 1).toString();
        fkriteria.setText(namakri);

        String namasub = tbl_sub.getValueAt(no, 2).toString();
        this.namasub.setText(namasub);

        String bobot = tbl_sub.getValueAt(no, 3).toString();
        nilaisub.setText(bobot);


    }//GEN-LAST:event_tbl_subMouseClicked

    private void cb_kriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_kriItemStateChanged
        // TODO add your handling code here:
        try {
            if (cb_kri.getSelectedIndex() == 0) {
                fkriteria.setText("");
            } else {
                Statement st = conn.createStatement();
                String sql = "SELECT nama_kriteria FROM tbl_kriteria WHERE id_kriteria='" + cb_kri.getSelectedItem() + "'";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    fkriteria.setText(rs.getString("nama_kriteria"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cb_kriItemStateChanged

    private void tampilkri() {
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT id_kriteria FROM tbl_kriteria order by id_kriteria ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cb_kri.addItem(rs.getString("id_kriteria"));

            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
        } catch (Exception e) {
        }
    }
    private void editSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubActionPerformed
        // TODO add your handling code here:
        id = id_sub.getText();
        namaSub = namasub.getText();
        namakri = (String) cb_kri.getSelectedItem();
        dtkri = fkriteria.getText();
        int bobot = Integer.parseInt(nilaisub.getText());

        if (id.equals("") || namaSub.equals("") || namakri.equals("") || dtkri.equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!", "informasi", JOptionPane.WARNING_MESSAGE);
        } else {
            int confir = JOptionPane.showConfirmDialog(null, "Ubah Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confir == 0) {
                try {
                    String sql = "UPDATE tbl_subkriteria SET nama_sub = '" + namaSub + "', "
                            + "nilai_sub = ' " + bobot + " ' WHERE tbl_subkriteria.kode_sub = '" + id + "'";
                    Connection conn = (Connection) konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
                    mainSubKriteria();
                    kosong();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_editSubActionPerformed

    private void delSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSubActionPerformed
        // TODO add your handling code here:
        id = id_sub.getText();
        namaSub = namasub.getText();
        namakri = (String) cb_kri.getSelectedItem();
        dtkri = fkriteria.getText();
        int bobot = Integer.parseInt(nilaisub.getText());

        if (id.equals("") || namaSub.equals("") || namakri.equals("") || dtkri.equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!", "informasi", JOptionPane.WARNING_MESSAGE);
        } else {
            int confir = JOptionPane.showConfirmDialog(null, "Hapus Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confir == 0) {
                try {
                    String sql = "DELETE FROM tbl_subkriteria WHERE kode_sub = '" + id + "'";
                    Connection conn = (Connection) konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                    mainSubKriteria();
                    kosong();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_delSubActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        // TODO add your handling code here:
        cari();
        kosong();
    }//GEN-LAST:event_btn_cariActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        mainSubKriteria();
        kosong();
    }//GEN-LAST:event_refreshActionPerformed
    public void tampil_kri() {
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT id_kriteria FROM tbl_kriteria ORDER BY id_kriteria ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cb_kri.addItem(rs.getString("id_kriteria"));
            }
            rs.last();
            int jml = rs.getRow();
            rs.first();
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSub;
    private javax.swing.JButton btn_cari;
    private javax.swing.JTextField carisub;
    private javax.swing.JComboBox<String> cb_kri;
    private javax.swing.JButton delSub;
    private javax.swing.JButton editSub;
    private javax.swing.JTextField fkriteria;
    private javax.swing.JTextField id_sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainSubKriteria;
    private javax.swing.JTextField namasub;
    private javax.swing.JTextField nilaisub;
    private javax.swing.JButton refresh;
    private javax.swing.JPanel subKriteria;
    private javax.swing.JTable tbl_sub;
    // End of variables declaration//GEN-END:variables
}
