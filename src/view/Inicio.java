package view;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Donator = new javax.swing.JPanel();
        lblDonator = new javax.swing.JLabel();
        lblImgDonator = new javax.swing.JLabel();
        Location = new javax.swing.JPanel();
        lblImgLocation = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Donator.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Donator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DonatorMouseClicked(evt);
            }
        });

        lblDonator.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDonator.setText("Sou doador");

        lblImgDonator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blood-donator.png"))); // NOI18N

        javax.swing.GroupLayout DonatorLayout = new javax.swing.GroupLayout(Donator);
        Donator.setLayout(DonatorLayout);
        DonatorLayout.setHorizontalGroup(
            DonatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DonatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDonator)
                    .addComponent(lblImgDonator))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DonatorLayout.setVerticalGroup(
            DonatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DonatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgDonator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDonator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblImgLocation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/location.png"))); // NOI18N

        lblLocation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLocation.setText("Preciso de doação");

        javax.swing.GroupLayout LocationLayout = new javax.swing.GroupLayout(Location);
        Location.setLayout(LocationLayout);
        LocationLayout.setHorizontalGroup(
            LocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLocation)
                    .addGroup(LocationLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblImgLocation)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LocationLayout.setVerticalGroup(
            LocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LocationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLocation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTitle.setText("Gerenciador de Doações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Donator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblTitle)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Donator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DonatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonatorMouseClicked
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DonatorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Donator;
    private javax.swing.JPanel Location;
    private javax.swing.JLabel lblDonator;
    private javax.swing.JLabel lblImgDonator;
    private javax.swing.JLabel lblImgLocation;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
