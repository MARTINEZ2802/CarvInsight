/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sac.CarvInsight.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sac.CarvInsight.model.Asig_Maquinaria;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAO;
import sac.CarvInsight.model.DAO.Asig_MaquinariaDAOImpl;

/**
 *
 * @author adali
 */
public class Assignment extends javax.swing.JInternalFrame {
        int id_asignment=0 ;
    
    
    public Assignment() {
        initComponents();
        llenarTabla();
    }

    void llenarTabla(){
        List<Asig_Maquinaria> lista;
        Asig_MaquinariaDAO dao = new Asig_MaquinariaDAOImpl();
        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
        lista = dao.findAllIncompleted();
        for(Asig_Maquinaria asig : lista){
            modelo.addRow(asig.getDatosForTable());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Assignment = new javax.swing.JButton();

        jScrollPane1.setBackground(new java.awt.Color(6, 42, 64));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(0, 0, 0));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Assignment", "Id_Machine", "Id_Prod", "Description"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(30);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(80);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(80);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(80);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(400);
        }

        btn_Assignment.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btn_Assignment.setText("Select Assignment");
        btn_Assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssignmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Assignment))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_Assignment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssignmentActionPerformed
        // TODO add your handling code here:
        RegistroUso principal = new RegistroUso();
        //principal.setId_Asig(id_asignment);
        this.dispose();
        System.out.println("Id: "+id_asignment);
        principal.dispose();
        principal.setVisible(false);
        principal.setId_Asig(id_asignment);
        principal.setVisible(true);
    }//GEN-LAST:event_btn_AssignmentActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        id_asignment = (int) table.getValueAt(table.getSelectedRow(), 0);
        
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Assignment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
