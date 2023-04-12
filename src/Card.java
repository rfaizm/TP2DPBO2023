/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package app;

import javax.swing.JOptionPane;

/**
 *
 * @author Gumilang
 */
public class Card extends javax.swing.JPanel {
    private dbConnection db;
    private int id;
    private String judul;
    private String name;
    private String studio;
    private String genre;
    private JPanelCard coba;
    /**
     * Creates new form Card
     */
    public Card(int id, String judul, String name, String studio, String genre, JPanelCard coba) {
        this.judul = judul;
        this.name = name;
        this.studio = studio;
        this.genre = genre;
        this.coba = coba;
        this.id = id;
        db = new dbConnection();
        initComponents();
        String sId = String.valueOf(id);
        labelJudul.setText(judul);
        labelSutradara.setText(name);
        labelProduksi.setText(studio);
        labelGenre.setText(genre);
        labelId.setText(sId);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MainCard = new javax.swing.JPanel();
        FotoCard1 = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        labelSutradara = new javax.swing.JLabel();
        labelProduksi = new javax.swing.JLabel();
        labelGenre = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MainCard.setBackground(new java.awt.Color(153, 153, 153));

        FotoCard1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout FotoCard1Layout = new javax.swing.GroupLayout(FotoCard1);
        FotoCard1.setLayout(FotoCard1Layout);
        FotoCard1Layout.setHorizontalGroup(
            FotoCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        FotoCard1Layout.setVerticalGroup(
            FotoCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        labelJudul.setBackground(new java.awt.Color(0, 0, 0));
        labelJudul.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(255, 255, 255));
        labelJudul.setText("Nama Group");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sutradara :");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Produksi :");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jenis Film :");

        btnEdit.setBackground(new java.awt.Color(0, 153, 255));
        btnEdit.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        labelSutradara.setForeground(new java.awt.Color(255, 255, 255));
        labelSutradara.setText("jLabel5");

        labelProduksi.setForeground(new java.awt.Color(255, 255, 255));
        labelProduksi.setText("jLabel5");

        labelGenre.setForeground(new java.awt.Color(255, 255, 255));
        labelGenre.setText("jLabel5");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelId.setText("jLabel5");

        javax.swing.GroupLayout MainCardLayout = new javax.swing.GroupLayout(MainCard);
        MainCard.setLayout(MainCardLayout);
        MainCardLayout.setHorizontalGroup(
            MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainCardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(FotoCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainCardLayout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainCardLayout.createSequentialGroup()
                        .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelJudul)
                            .addGroup(MainCardLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(labelGenre))
                            .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainCardLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelProduksi))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainCardLayout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelSutradara))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(MainCardLayout.createSequentialGroup()
                .addComponent(labelId)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MainCardLayout.setVerticalGroup(
            MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainCardLayout.createSequentialGroup()
                .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainCardLayout.createSequentialGroup()
                        .addComponent(labelId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FotoCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainCardLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelJudul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelSutradara))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelProduksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelGenre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MainCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(MainCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        Update updt = new Update(this.coba, this.id, this.judul, this.name, this.studio, this.genre);
        updt.setVisible(true);
        updt.setDefaultCloseOperation(JPanelCard.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int yes = JOptionPane.showConfirmDialog(null, "Apakah anda yakin hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        if(JOptionPane.YES_OPTION == yes){
            String sql = "DELETE FROM desc_film WHERE id = '"+id+"'";
            db.updateQuery(sql);
            
            coba.setPanel();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FotoCard1;
    private javax.swing.JPanel MainCard;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelGenre;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelProduksi;
    private javax.swing.JLabel labelSutradara;
    // End of variables declaration//GEN-END:variables
}
