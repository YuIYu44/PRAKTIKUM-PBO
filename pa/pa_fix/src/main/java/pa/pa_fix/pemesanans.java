/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pa.pa_fix;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public final class pemesanans extends javax.swing.JFrame implements clearandclean{
    private DefaultTableModel dtm ;
    private String namas;
             ArrayList<pesanan_sementara> sementara=new ArrayList<pesanan_sementara>();
    public pemesanans(String kursis, String namas) {
        initComponents();   
        this.namas=namas;
        kursi.setText(kursis);
        new show(pemesanantable,sementara);
        new show(makanantable, "makanan");
        new show(minumantable, "minuman");
        total.setEnabled(false);
        this.setResizable(false);
    }
    public void total(){
        int total_=0;
             for (int rows = 0; rows < sementara.size();rows++){
                  total_=total_ + Integer.parseInt(sementara.get(rows).getHarga().toString());
             }
               total.setText(Integer.toString(total_));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        pemesanantable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        total = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        makanantable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        pesan = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        btnmakan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        minumantable = new javax.swing.JTable();
        btnminum = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        kursi = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(224, 181, 116));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        pemesanantable.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        pemesanantable.setModel(new javax.swing.table.DefaultTableModel(
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
        pemesanantable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pemesanantableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(pemesanantable);

        total.setFont(new java.awt.Font("Swis721 BT", 0, 18)); // NOI18N
        jScrollPane6.setViewportView(total);

        makanantable.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        makanantable.setModel(new javax.swing.table.DefaultTableModel(
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
        makanantable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makanantableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(makanantable);

        jLabel5.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        jLabel5.setText("Total");

        pesan.setBackground(new java.awt.Color(207, 178, 139));
        pesan.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(207, 178, 139));
        hapus.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        btnmakan.setBackground(new java.awt.Color(207, 178, 139));
        btnmakan.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        btnmakan.setText("Tambah");
        btnmakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmakanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 0, 24)); // NOI18N
        jLabel1.setText("Makanan");

        jLabel4.setFont(new java.awt.Font("Swis721 BT", 0, 24)); // NOI18N
        jLabel4.setText("Minuman");

        minumantable.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        minumantable.setModel(new javax.swing.table.DefaultTableModel(
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
        minumantable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minumantableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(minumantable);

        btnminum.setBackground(new java.awt.Color(207, 178, 139));
        btnminum.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        btnminum.setText("Tambah");
        btnminum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminumActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(183, 122, 58));

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel2.setText("MENU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(298, 298, 298))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(183, 122, 58));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        kursi.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        kursi.setText("9");

        back.setBackground(new java.awt.Color(207, 178, 139));
        back.setFont(new java.awt.Font("Swis721 BT", 0, 16)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText(" No Meja :");

        jLabel6.setFont(new java.awt.Font("Swis721 BT", 0, 24)); // NOI18N
        jLabel6.setText("Pesanan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(166, 166, 166))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesan, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kursi))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnmakan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                    .addComponent(btnminum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kursi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmakan)
                    .addComponent(btnminum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pesan)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new logins().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void btnminumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminumActionPerformed
        if(minumantable.getSelectedRow()>=0){
            int rows=minumantable.getSelectedRow();
            pesanan_sementara inputs = new pesanan_sementara(minumantable.getValueAt(rows, 0).toString(),minumantable.getValueAt(rows, 1).toString(),minumantable.getValueAt(rows, 2).toString());
            sementara.add(inputs);
            total();
            new show(pemesanantable,sementara);}

    }//GEN-LAST:event_btnminumActionPerformed

    private void minumantableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minumantableMouseClicked
        clear(minumantable);
    }//GEN-LAST:event_minumantableMouseClicked

    private void btnmakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakanActionPerformed
        if(makanantable.getSelectedRow()>=0){
            int rows=makanantable.getSelectedRow();
            pesanan_sementara inputs = new pesanan_sementara(makanantable.getValueAt(rows, 0).toString(),makanantable.getValueAt(rows, 1).toString(),makanantable.getValueAt(rows, 2).toString());
            sementara.add(inputs);
            total();
            new show(pemesanantable,sementara);}
    }//GEN-LAST:event_btnmakanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        if(pemesanantable.getSelectedRow()>=0){
            sementara.remove(pemesanantable.getSelectedRow());
            new show(pemesanantable,sementara);}
        total();
    }//GEN-LAST:event_hapusActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        if (error("Lengkapi Pesanan/No Kursi Anda", "PESANAN INPUT")==1){
            if(JOptionPane.showConfirmDialog(null, "Pesanan Tidak Dapat Diubah\n Lanjutkan?", "Apakah Anda Yakin?", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                for (int rows = 0; rows < pemesanantable.getRowCount();rows++){
                    String[] stuff={sementara.get(rows).getNama(),sementara.get(rows).getHarga(),sementara.get(rows).getJenis(),kursi.getText().toString()};
                    new acces_pesanan().tambah_pesanan(stuff,namas);
                }
                sementara.clear();
                new loginpelanggan().setVisible(true);
                this.dispose();
            }}
    }//GEN-LAST:event_pesanActionPerformed

    private void makanantableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makanantableMouseClicked
        clear(makanantable);
    }//GEN-LAST:event_makanantableMouseClicked

    private void pemesanantableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pemesanantableMouseClicked
        clear(pemesanantable);
    }//GEN-LAST:event_pemesanantableMouseClicked
    public void clear(){}
    public void clear(JTable b){
        JTable[] table={makanantable,minumantable,pemesanantable};
        for(int x=0;x<3;x++){
            if (table[x]!=b){
               table[x].clearSelection();}}};
    
    public int error(String message,String title){
        if (total.getText().equals("") || total.getText().equals("0")){
             JOptionPane.showMessageDialog(new JFrame(), message, title,  JOptionPane.WARNING_MESSAGE);
        return 0;}
        return 1;}
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnmakan;
    private javax.swing.JButton btnminum;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel kursi;
    private javax.swing.JTable makanantable;
    private javax.swing.JTable minumantable;
    private javax.swing.JTable pemesanantable;
    private javax.swing.JButton pesan;
    private javax.swing.JTextPane total;
    // End of variables declaration//GEN-END:variables
}
