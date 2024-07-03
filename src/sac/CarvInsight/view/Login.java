/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sac.CarvInsight.view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import sac.CarvInsight.model.DAO.UserDAO;
import sac.CarvInsight.model.DAO.UserDAOImpl;
import sac.CarvInsight.util.Imgs;

/**
 *
 * @author adali
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
   
    Imgs llenar = new Imgs();
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private int validar(String user, String password){
        UserDAO usuDa = new UserDAOImpl();
        int n = usuDa.Validar(user, password);
        if(n==1){
            return 1;
        }else{
            return 0;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icon_output = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        iconLock = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        btnEye = new javax.swing.JToggleButton();
        txt_Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1400, 800));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDesktopPane1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 700, 810));

        jPanel1.setBackground(new java.awt.Color(200, 207, 216));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(29, 85, 121));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 85, 121));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 169, 80));
        jPanel1.add(icon_output, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 71, 49));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("User");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 121, -1));

        txt_User.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 340, 60));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Remember password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jButton1.setBackground(new java.awt.Color(29, 85, 121));
        jButton1.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 574, 247, 50));

        iconLock.setBackground(new java.awt.Color(255, 255, 0));
        iconLock.setForeground(new java.awt.Color(255, 255, 255));
        iconLock.setText("jLabel4");
        iconLock.setBorder(new MatteBorder(0, 0, 0, 2, new Color(	29, 85, 121)));
        jPanel1.add(iconLock, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 50, 40));

        iconUser.setBackground(new java.awt.Color(255, 255, 0));
        iconUser.setForeground(new java.awt.Color(255, 255, 255));
        iconUser.setText("jLabel4");
        iconUser.setBorder(new MatteBorder(0, 0, 0, 2, new Color(	29, 85, 121)));
        jPanel1.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 50, 40));

        btnEye.setBackground(new java.awt.Color(255, 255, 255));
        btnEye.setBorder(null);
        btnEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEyeActionPerformed(evt);
            }
        });
        jPanel1.add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 20, 20));
        btnEye.getAccessibleContext().setAccessibleParent(jDesktopPane1);

        txt_Pass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_Pass.setDragEnabled(true);
        txt_Pass.setPreferredSize(new java.awt.Dimension(68, 35));
        jPanel1.add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 330, 60));

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 0, 690, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEyeActionPerformed
        // TODO add your handling code here:
        //FUNCTION TO SHOW AND HID THE PASSWORD
        if(btnEye.isSelected()){
            txt_Pass.setEchoChar((char) 0); //show the password
            llenar.Img2TBtn(btnEye, "eye");
        }
        else{
            txt_Pass.setEchoChar('*');
            llenar.Img2TBtn(btnEye, "eyeHidden");
        }
    }//GEN-LAST:event_btnEyeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int n = validar(txt_User.getText(),String.valueOf( txt_Pass.getPassword()));
        if(n==1){
            JOptionPane.showMessageDialog(rootPane, "Inicio de sesion exitoso");
            if(txt_User.getText().equals("admin")){
                OEEGraphics oee = new OEEGraphics();
                oee.setVisible(true);
                this.dispose();
            }else{
                RegistroUso reg = new RegistroUso();
                reg.setVisible(true);
                this.dispose();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Acceso denegado");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void cargarIcon(){
        llenar.Img2Label(icon_output, "iconLogin");
        llenar.Img2Label(logo, "imageLogo");
        llenar.Img2Label(iconUser, "iconUser");
        llenar.Img2Label(iconLock, "iconLock");
        llenar.Img2TBtn(btnEye, "eyeHidden");
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEye;
    private javax.swing.JLabel iconLock;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel icon_output;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
