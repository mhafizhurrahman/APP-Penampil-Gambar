
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class penampilGambarFullscreen extends javax.swing.JFrame {

    /**
     * Creates new form penampilGambarFullscreen
     */
    public penampilGambarFullscreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btpanel = new javax.swing.JPanel();
        btemoji = new javax.swing.JButton();
        btfacebook = new javax.swing.JButton();
        btkomputer = new javax.swing.JButton();
        btexit = new javax.swing.JButton();
        imgpanel = new javax.swing.JPanel();
        emoji = new javax.swing.JLabel();
        facebook = new javax.swing.JLabel();
        komputer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btemoji.setText("Emoji");
        btemoji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btemojiActionPerformed(evt);
            }
        });

        btfacebook.setText("facebook");
        btfacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfacebookActionPerformed(evt);
            }
        });

        btkomputer.setText("Komputer");
        btkomputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkomputerActionPerformed(evt);
            }
        });

        btexit.setText("Exit");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btpanelLayout = new javax.swing.GroupLayout(btpanel);
        btpanel.setLayout(btpanelLayout);
        btpanelLayout.setHorizontalGroup(
            btpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btpanelLayout.createSequentialGroup()
                .addComponent(btemoji, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btkomputer, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btexit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btpanelLayout.setVerticalGroup(
            btpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btpanelLayout.createSequentialGroup()
                .addGroup(btpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btemoji)
                    .addComponent(btfacebook)
                    .addComponent(btkomputer)
                    .addComponent(btexit))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        imgpanel.setLayout(new java.awt.CardLayout());

        emoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/emoji.png"))); // NOI18N
        imgpanel.add(emoji, "0");

        facebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook.png"))); // NOI18N
        imgpanel.add(facebook, "1");

        komputer.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        komputer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/komputer.png"))); // NOI18N
        komputer.setMaximumSize(new java.awt.Dimension(412, 412));
        imgpanel.add(komputer, "2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(imgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 617, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(102, 102, 102)
                    .addComponent(imgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(103, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btemojiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btemojiActionPerformed
        CardLayout c1 = (CardLayout)(imgpanel.getLayout());
        c1.show(imgpanel,"0");
    }//GEN-LAST:event_btemojiActionPerformed

    private void btfacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfacebookActionPerformed
        CardLayout c1 = (CardLayout)(imgpanel.getLayout());
        c1.show(imgpanel,"1");         // TODO add your handling code here:
    }//GEN-LAST:event_btfacebookActionPerformed

    private void btkomputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkomputerActionPerformed
        CardLayout c1 = (CardLayout)(imgpanel.getLayout());
        c1.show(imgpanel,"2");
    }//GEN-LAST:event_btkomputerActionPerformed

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btexitActionPerformed

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
            java.util.logging.Logger.getLogger(penampilGambarFullscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penampilGambarFullscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penampilGambarFullscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penampilGambarFullscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                
                penmapilgambarButton fullFrame = new penmapilgambarButton();
              
                GraphicsDevice device = 
                         GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btemoji;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btfacebook;
    private javax.swing.JButton btkomputer;
    private javax.swing.JPanel btpanel;
    private javax.swing.JLabel emoji;
    private javax.swing.JLabel facebook;
    private javax.swing.JPanel imgpanel;
    private javax.swing.JLabel komputer;
    // End of variables declaration//GEN-END:variables
}
