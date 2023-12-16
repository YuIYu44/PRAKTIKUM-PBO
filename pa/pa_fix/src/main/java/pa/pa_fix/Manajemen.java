/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pa.pa_fix;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Manajemen extends javax.swing.JFrame implements clearandclean {
    protected int row;
    public Manajemen() { 
        initComponents();
         minum.doClick();
         this.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    public int error(String message,String title){
        if(nama.getText().equals("") || harga.getText().equals("") || harga.getText().equals(0) || jeniscb.getSelectedIndex() == -1 ){
            JOptionPane.showMessageDialog(new JFrame(), message, title, JOptionPane.WARNING_MESSAGE);
            return 0;
        }
        try {
            int a = Integer.parseInt(harga.getText());
            if (Integer.parseInt(harga.getText())<=4000){
                       throw new NumberFormatException();}
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(new JFrame(), "Isi Data Dengan Benar", "ERROR INPUT", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
        
    return 1;}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Barang = new javax.swing.JPanel();
        manajemenbarang = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menu = new javax.swing.JTable();
        makan = new javax.swing.JButton();
        minum = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jeniscb = new javax.swing.JComboBox<>();
        hapus = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablepesanan = new javax.swing.JTable();
        hapus1 = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jLabel3.setText("jLabel1");

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Barang.setBackground(new java.awt.Color(224, 181, 116));

        manajemenbarang.setBackground(new java.awt.Color(183, 122, 58));
        manajemenbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manajemenbarangMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(224, 181, 116));

        menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama", "Harga", "Jenis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menu);
        if (menu.getColumnModel().getColumnCount() > 0) {
            menu.getColumnModel().getColumn(1).setResizable(false);
            menu.getColumnModel().getColumn(2).setResizable(false);
        }

        makan.setBackground(new java.awt.Color(207, 178, 139));
        makan.setText("Makanan");
        makan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makanActionPerformed(evt);
            }
        });

        minum.setBackground(new java.awt.Color(207, 178, 139));
        minum.setText("Minuman");
        minum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Harga");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Jenis");

        hapus.setBackground(new java.awt.Color(207, 178, 139));
        hapus.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(207, 178, 139));
        edit.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaction(evt);
            }
        });

        btntambah.setBackground(new java.awt.Color(207, 178, 139));
        btntambah.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(207, 178, 139));
        btnback.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(minum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(makan)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btntambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(edit)
                                                .addGap(18, 18, 18)
                                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(harga, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jeniscb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(74, 74, 74))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addGap(0, 437, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minum)
                    .addComponent(makan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jeniscb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah)
                    .addComponent(hapus)
                    .addComponent(edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnback))
        );

        manajemenbarang.addTab("Manajemen Menu", jPanel1);

        jPanel3.setBackground(new java.awt.Color(224, 181, 116));

        tablepesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_pesanan", "Nama", "Harga", "Jenis", "Pemesan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablepesanan);

        hapus1.setBackground(new java.awt.Color(207, 178, 139));
        hapus1.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        hapus1.setText("Hapus");
        hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addComponent(hapus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapus1)
                .addGap(23, 23, 23))
        );

        manajemenbarang.addTab("Manajemen Pesanan", jPanel3);

        javax.swing.GroupLayout BarangLayout = new javax.swing.GroupLayout(Barang);
        Barang.setLayout(BarangLayout);
        BarangLayout.setHorizontalGroup(
            BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarangLayout.createSequentialGroup()
                .addComponent(manajemenbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BarangLayout.setVerticalGroup(
            BarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manajemenbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clear(){
        nama.setText("");
        harga.setText("");
    }
        
    private void manajemenbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manajemenbarangMouseClicked
        row=(-1);
        Integer Tab=manajemenbarang.getSelectedIndex();
        if (Tab ==1) {
        clear();
        new show(tablepesanan,"pesanan");}
        else if (Tab ==0) {
         minum.doClick();
        clear();}
    }//GEN-LAST:event_manajemenbarangMouseClicked

    private void hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus1ActionPerformed
        if (tablepesanan.getSelectedRow()>=0){
        new acces_pesanan().hapus_pesanan(tablepesanan.getValueAt(tablepesanan.getSelectedRow(), 0).toString());
        new show(tablepesanan,"pesanan");}
    }//GEN-LAST:event_hapus1ActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new logins().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
         try{
               int a = Integer.parseInt(nama.getText());
               clear();
               error("INPUT NAMA ANDA DENGAN BENAR","SALAH INPUT");
            }catch(NumberFormatException nfe){
        if (error("Lengkapi  Data Terlebih Dahulu", "Warning!")==1){
            String[] array={nama.getText().toUpperCase(),harga.getText(),jeniscb.getSelectedItem().toString().toUpperCase()};
            acces_menu akses=new acces_menu();
            akses.tambah_menu(array);
            clear();
            new show(menu,akses.getKind());
        }}
    }//GEN-LAST:event_btntambahActionPerformed

    private void editaction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaction
        if(error("Pilih/Lengkapi  Data Yang Ingin DiEdit Terlebih Dahulu", "Warning!")==1){
            String[] array={nama.getText().toUpperCase(),harga.getText(),jeniscb.getSelectedItem().toString().toUpperCase()};
                 acces_menu akses=new acces_menu();
            akses.edit_menu(array);
            clear();
            new show(menu,akses.getKind());
        }
    }//GEN-LAST:event_editaction

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        if(error("Pilih/Lengkapi Data Yang Ingin Dihapus Terlebih Dahulu", "Warning!")==1){
            String[] array={nama.getText().toUpperCase(),jeniscb.getSelectedItem().toString().toUpperCase()};
            acces_menu akses=new acces_menu();
            akses.hapus_menu(array);
            clear();
            new show(menu,akses.getKind());
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void minumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minumActionPerformed
        jeniscb.removeAllItems();
        new show(menu,"minuman");
                                                jeniscb.addItem("ES");
                                                     jeniscb.addItem("PANAS");
    }//GEN-LAST:event_minumActionPerformed

    private void makanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makanActionPerformed
               jeniscb.removeAllItems();
        new show(menu,"makanan");
            jeniscb.addItem("BERAT");
                           jeniscb.addItem("RINGAN");
        
    }//GEN-LAST:event_makanActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
       row=(-1);
        if(menu.getSelectedRow()>=0){
           row=menu.getSelectedRow();
           nama.setText(menu.getValueAt(row, 0).toString());
           harga.setText(menu.getValueAt(row, 1).toString());
           jeniscb.setSelectedItem(menu.getValueAt(row, 2).toString());
       }
       else{
       clear();}
    }//GEN-LAST:event_menuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barang;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btntambah;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton hapus1;
    private javax.swing.JTextField harga;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> jeniscb;
    private javax.swing.JButton makan;
    private javax.swing.JTabbedPane manajemenbarang;
    private javax.swing.JTable menu;
    private javax.swing.JButton minum;
    private javax.swing.JTextField nama;
    private javax.swing.JTable tablepesanan;
    // End of variables declaration//GEN-END:variables
}
