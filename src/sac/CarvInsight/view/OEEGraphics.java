package sac.CarvInsight.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

public class OEEGraphics extends javax.swing.JFrame {

    public OEEGraphics() {
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        initComponents();
        this.setTitle("CARVINSIGHT");
        //this.setExtendedState(MAXIMIZED_BOTH);
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        setIconImage(ico);
        ancho.setText(screenWidth+"");
        altura.setText(screenHeight+"");
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_LogOut = new javax.swing.JButton();
        NavPanel = new javax.swing.JPanel();
        NavPanel1 = new javax.swing.JPanel();
        altura = new javax.swing.JTextField();
        ancho = new javax.swing.JTextField();
        btn_1w = new javax.swing.JButton();
        btn_1w1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 207, 216));
        setResizable(false);
        setSize(new java.awt.Dimension(100, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setBackground(new java.awt.Color(6, 42, 64));
        HeadPanel.setForeground(new java.awt.Color(6, 42, 64));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/header.png"))); // NOI18N

        btn_LogOut.setBackground(new java.awt.Color(29, 85, 121));
        btn_LogOut.setForeground(new java.awt.Color(255, 255, 255));
        btn_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLogOut.png"))); // NOI18N
        btn_LogOut.setBorder(null);
        btn_LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LogOutMouseExited(evt);
            }
        });
        btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 682, Short.MAX_VALUE)
                .addComponent(btn_LogOut)
                .addGap(93, 93, 93))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(btn_LogOut)
                .addGap(26, 26, 26))
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2207, -1));

        NavPanel.setBackground(new java.awt.Color(29, 85, 121));
        NavPanel.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout NavPanelLayout = new javax.swing.GroupLayout(NavPanel);
        NavPanel.setLayout(NavPanelLayout);
        NavPanelLayout.setHorizontalGroup(
            NavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        NavPanelLayout.setVerticalGroup(
            NavPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );

        getContentPane().add(NavPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 1030));

        NavPanel1.setBackground(new java.awt.Color(204, 0, 51));
        NavPanel1.setForeground(new java.awt.Color(0, 0, 255));

        altura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        ancho.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout NavPanel1Layout = new javax.swing.GroupLayout(NavPanel1);
        NavPanel1.setLayout(NavPanel1Layout);
        NavPanel1Layout.setHorizontalGroup(
            NavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1257, Short.MAX_VALUE))
            .addGroup(NavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NavPanel1Layout.createSequentialGroup()
                    .addGap(185, 185, 185)
                    .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1256, Short.MAX_VALUE)))
        );
        NavPanel1Layout.setVerticalGroup(
            NavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(659, Short.MAX_VALUE))
            .addGroup(NavPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(NavPanel1Layout.createSequentialGroup()
                    .addGap(82, 82, 82)
                    .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(759, Short.MAX_VALUE)))
        );

        getContentPane().add(NavPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 250, 1760, 920));

        btn_1w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1w.png"))); // NOI18N
        btn_1w.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1wMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1wMouseExited(evt);
            }
        });
        btn_1w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1wActionPerformed(evt);
            }
        });
        btn_1w.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_1wKeyPressed(evt);
            }
        });
        getContentPane().add(btn_1w, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 164, 71, 71));

        btn_1w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1D.png"))); // NOI18N
        btn_1w1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1w1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1w1MouseExited(evt);
            }
        });
        btn_1w1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1w1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_1w1, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 164, 71, 71));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LogOutActionPerformed

    private void btn_LogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutMouseEntered
        btn_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLogOutHover.png")));
    }//GEN-LAST:event_btn_LogOutMouseEntered

    private void btn_LogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LogOutMouseExited
    btn_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLogOut.png")));
    }//GEN-LAST:event_btn_LogOutMouseExited

    private void btn_1wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1wActionPerformed

    private void btn_1w1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1w1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1w1ActionPerformed

    private void btn_1wKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_1wKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1wKeyPressed

    private void btn_1wMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1wMouseEntered
        btn_1w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1wHover.png")));
    }//GEN-LAST:event_btn_1wMouseEntered

    private void btn_1wMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1wMouseExited
        btn_1w.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1w.png")));
    }//GEN-LAST:event_btn_1wMouseExited

    private void btn_1w1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1w1MouseEntered
        btn_1w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1DHover.png")));
    }//GEN-LAST:event_btn_1w1MouseEntered

    private void btn_1w1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1w1MouseExited
        btn_1w1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1D.png")));
    }//GEN-LAST:event_btn_1w1MouseExited

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
            java.util.logging.Logger.getLogger(OEEGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OEEGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OEEGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OEEGraphics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OEEGraphics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JPanel NavPanel;
    private javax.swing.JPanel NavPanel1;
    private javax.swing.JTextField altura;
    private javax.swing.JTextField ancho;
    private javax.swing.JButton btn_1w;
    private javax.swing.JButton btn_1w1;
    private javax.swing.JButton btn_LogOut;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
