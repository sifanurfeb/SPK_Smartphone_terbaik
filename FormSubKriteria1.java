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
public class FormSubKriteria1 extends javax.swing.JPanel {

    Connection conn = (Connection) konek.KoneksiDB();
    Statement st;
    ResultSet rs;
    DefaultTableModel tabel;
    String id, namaSub, namakri, dtkri, kodekri;
    int Harga, Chipset, Ram, Rom, Kamera, Baterai, Layar;

    public FormSubKriteria1() {
        initComponents();
        mainSubKriteria1();
        kodeAuto();
        tampil_kri();
        focus();
        kosong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        rom1 = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        mainSubKriteria = new javax.swing.JPanel();
        subKriteria = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addSub = new javax.swing.JButton();
        editSub = new javax.swing.JButton();
        delSub = new javax.swing.JButton();
        tab_sub = new javax.swing.JScrollPane();
        tbl_sub = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        id_sub1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_kri = new javax.swing.JComboBox<>();
        fkriteria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        chipset = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        carisub = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ram = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kamera = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        baterai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        layar = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel4.setText("ROM Alternatif");

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

        tab_sub.setBackground(new java.awt.Color(255, 255, 255));

        tbl_sub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_sub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Sub Kriteria", "Nama Alternatif", "Harga Alternatif", "Chipset Alternatif", "RAM Alternatif", "ROM Alternatif", "Kamera Alternatif", "Baterai Alternatif", "Layar Alternatif"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true, true, true, true
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
        tab_sub.setViewportView(tbl_sub);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Kode Sub Kriteria");

        id_sub1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Nama Alternatif");

        cb_kri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Alternatif" }));
        cb_kri.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cb_kri.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_kriItemStateChanged(evt);
            }
        });

        fkriteria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Harga Alternatif");

        harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Chipset Alternatif");

        chipset.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

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

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setText("RAM Alternatif");

        ram.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setText("ROM Alternatif");

        rom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel6.setText("Kamera Alternatif");

        kamera.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel9.setText("Baterai Alternatif");

        baterai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel11.setText("Layar Alternatif");

        layar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout subKriteriaLayout = new javax.swing.GroupLayout(subKriteria);
        subKriteria.setLayout(subKriteriaLayout);
        subKriteriaLayout.setHorizontalGroup(
            subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(subKriteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(btn_cari))
                    .addGroup(subKriteriaLayout.createSequentialGroup()
                        .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fkriteria, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_kri, javax.swing.GroupLayout.Alignment.LEADING, 0, 125, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_sub1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(20, 20, 20)
                        .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(subKriteriaLayout.createSequentialGroup()
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rom, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(harga, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(subKriteriaLayout.createSequentialGroup()
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(kamera, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(baterai, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chipset))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tab_sub, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subKriteriaLayout.createSequentialGroup()
                        .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subKriteriaLayout.createSequentialGroup()
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(id_sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(subKriteriaLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(subKriteriaLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(subKriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chipset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(subKriteriaLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(baterai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(subKriteriaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addComponent(cb_kri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(subKriteriaLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kamera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fkriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subKriteriaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(tab_sub, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
        );

        mainSubKriteria.add(subKriteria, "card2");

        mainPanel.add(mainSubKriteria, "card2");

        add(mainPanel, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void focus() {
        id_sub1.requestFocus();
    }

    private void kosong() {
        cb_kri.setSelectedItem("");
        fkriteria.setText("");
        carisub.setText("");
        harga.setText("");
        chipset.setText("");
        ram.setText("");
        rom.setText("");
        kamera.setText("");
        baterai.setText("");
        layar.setText("");
    }
    private void addSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubActionPerformed
        // TODO add your handling code here:
        id = id_sub1.getText();
        kodekri = (String) cb_kri.getSelectedItem();
         Harga = Integer.parseInt(harga.getText());
         Chipset = Integer.parseInt(chipset.getText());
         Ram = Integer.parseInt(ram.getText());
         Rom = Integer.parseInt(rom.getText());
         Kamera = Integer.parseInt(kamera.getText());
         Baterai = Integer.parseInt(baterai.getText());
         Layar = Integer.parseInt(layar.getText());

        if (id.equals("") || kodekri.equals("") ){
            JOptionPane.showMessageDialog(null, "Form tidak boleh kosong!", "informasi", JOptionPane.WARNING_MESSAGE);
        } else {
            int confir = JOptionPane.showConfirmDialog(null, "Simpan Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confir == 0) {
                try {
                    String sql = "INSERT INTO tbl_subkriteria VALUES"
                            + "('" + id + "','" + kodekri + "','"+Harga+"' , '"+Chipset+"' , '"+Ram+"' , "
                            +"'"+Rom+"',"
                            +"'"+Kamera+"' , '"+Baterai+"' , '"+Layar+"')";
                    Connection conn = (Connection) konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
                    mainSubKriteria1();
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
        tabel.addColumn("Nama Alternatif");
        tabel.addColumn("Harga Alternatif");
        tabel.addColumn("Chipset Alternatif");
        tabel.addColumn("RAM Alternatif");
        tabel.addColumn("ROM Alternatif");
        tabel.addColumn("Kamera Alternatif");
        tabel.addColumn("Baterai Alternatif");
        tabel.addColumn("Layar Alternatif");

        try {

            String sql
                    = "SELECT kode_sub, "
                    + "tbl_alter.nama_alter,"
                    + "tbl_subkriteria.harga,"
                    + "tbl_subkriteria.chipset,"
                    + "tbl_subkriteria.ram,"
                    + "tbl_subkriteria.rom,"
                    + "tbl_subkriteria.kamera,"
                    + "tbl_subkriteria.baterai,"
                    + "tbl_subkriteria.layar "
                    + "FROM tbl_alter, tbl_subkriteria "
                    + "WHERE tbl_alter.id_alter = tbl_subkriteria.id_alter "
                    + "AND tbl_subkriteria.kode_sub LIKE '%" + carisub.getText() + "%'";

            Connection conn = (Connection) konek.KoneksiDB();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
                });
                tbl_sub.setModel(tabel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void mainSubKriteria1() {
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("Kode Sub");
        tabel.addColumn("Nama Alternatif");
        tabel.addColumn("Harga Alternatif");
        tabel.addColumn("Chipset Alternatif");
        tabel.addColumn("RAM Alternatif");
        tabel.addColumn("ROM Alternatif");
        tabel.addColumn("Kamera Alternatif");
        tabel.addColumn("Baterai Alternatif");
        tabel.addColumn("Layar Alternatif");
        try {
            String sql
                    = "SELECT "
                    + "kode_sub,"
                    + "tbl_alter.nama_alter,"
                    + "tbl_subkriteria.harga,"
                    + "tbl_subkriteria.chipset,"
                    + "tbl_subkriteria.ram,"
                    + "tbl_subkriteria.rom,"
                    + "tbl_subkriteria.kamera,"
                    + "tbl_subkriteria.baterai,"
                    + "tbl_subkriteria.layar  "
                    + "FROM tbl_alter, tbl_subkriteria "
                    + "WHERE tbl_alter.id_alter = tbl_subkriteria.id_alter";

            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
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
                    id_sub1.setText("S00");
                } else {
                    rs.last();
                    int set_id = rs.getInt(1) + 1;
                    String no = String.valueOf(set_id);
                    int id_next = no.length();

                    for (int a = 0; a < 1 - id_next; a++) {
                        no = "00" + no;
                    }
                    id_sub1.setText("SB00" + no);
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
        id_sub1.setText(id);

        String namakri = tbl_sub.getValueAt(no, 1).toString();
        fkriteria.setText(namakri);

        String harga = tbl_sub.getValueAt(no, 2).toString();
        this.harga.setText(harga);

        String Ram = tbl_sub.getValueAt(no, 3).toString();
        ram.setText(Ram);
        
        String Chipset = tbl_sub.getValueAt(no, 4).toString();
        chipset.setText(Chipset);
        
        String Rom = tbl_sub.getValueAt(no, 5).toString();
        rom.setText(Rom);
        
        String Kamera = tbl_sub.getValueAt(no, 6).toString();
        kamera.setText(Kamera);
        
        String Baterai = tbl_sub.getValueAt(no, 7).toString();
        baterai.setText(Baterai);
        
        String Layar = tbl_sub.getValueAt(no, 8).toString();
        layar.setText(Layar);


    }//GEN-LAST:event_tbl_subMouseClicked

    private void cb_kriItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_kriItemStateChanged
        // TODO add your handling code here:
        try {
            if (cb_kri.getSelectedIndex() == 0) {
                fkriteria.setText("");
            } else {
                Statement st = conn.createStatement();
                String sql = "SELECT nama_alter FROM tbl_alter WHERE id_alter = '"+cb_kri.getSelectedItem()+"'";
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    fkriteria.setText(rs.getString("nama_alter"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cb_kriItemStateChanged

    private void editSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSubActionPerformed
        // TODO add your handling code here:
        id = id_sub1.getText();
        kodekri = (String) cb_kri.getSelectedItem();
         Harga = Integer.parseInt(harga.getText());
         Chipset = Integer.parseInt(chipset.getText());
         Ram = Integer.parseInt(ram.getText());
         Rom = Integer.parseInt(rom.getText());
         Kamera = Integer.parseInt(kamera.getText());
         Baterai = Integer.parseInt(baterai.getText());
         Layar = Integer.parseInt(layar.getText());

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!", "informasi", JOptionPane.WARNING_MESSAGE);
        } else {
            int confir = JOptionPane.showConfirmDialog(null, "Ubah Data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (confir == 0) {
                try {
                    String sql = "UPDATE tbl_subkriteria SET harga = '"+Harga+"',"
                            + "chipset = '"+Chipset+"',"
                            + "ram = '"+Ram+"',"
                            + "rom = '"+Rom+"',"
                            + "kamera = '"+Kamera+"',"
                            + "baterai = '"+Baterai+"',"
                            + "layar  = '"+Layar+"'"
                            + "WHERE tbl_subkriteria.kode_sub = '"+id+"'";
                    Connection conn = (Connection) konek.KoneksiDB();
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.execute();

                    JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
                    mainSubKriteria1();
                    kosong();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_editSubActionPerformed

    private void delSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSubActionPerformed
        // TODO add your handling code here:
        id = id_sub1.getText();
        namaSub = harga.getText();
        namakri = (String) cb_kri.getSelectedItem();
        dtkri = fkriteria.getText();
        int bobot = Integer.parseInt(chipset.getText());

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
                    mainSubKriteria1();
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
        mainSubKriteria1();
        kosong();
    }//GEN-LAST:event_refreshActionPerformed
    public void tampil_kri() {
        try {
            Statement st = conn.createStatement();
            String sql = "SELECT id_alter FROM tbl_alter ORDER BY id_alter ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cb_kri.addItem(rs.getString("id_alter"));
            }
            rs.last();
            int jml = rs.getRow();
            rs.first();
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSub;
    private javax.swing.JTextField baterai;
    private javax.swing.JButton btn_cari;
    private javax.swing.JTextField carisub;
    private javax.swing.JComboBox<String> cb_kri;
    private javax.swing.JTextField chipset;
    private javax.swing.JButton delSub;
    private javax.swing.JButton editSub;
    private javax.swing.JTextField fkriteria;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id_sub1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField kamera;
    private javax.swing.JTextField layar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel mainSubKriteria;
    private javax.swing.JTextField ram;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField rom;
    private javax.swing.JTextField rom1;
    private javax.swing.JPanel subKriteria;
    private javax.swing.JScrollPane tab_sub;
    private javax.swing.JTable tbl_sub;
    // End of variables declaration//GEN-END:variables
}
