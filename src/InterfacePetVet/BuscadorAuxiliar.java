/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePetVet;

import javax.swing.JOptionPane;

/**
 *
 * @author cp
 */
public class BuscadorAuxiliar extends javax.swing.JFrame {

    /**
     * Creates new form Buscador
     */
    public BuscadorAuxiliar() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Buscador = new javax.swing.JLabel();
        jPanel_Volver = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel_Volver1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Cliente = new javax.swing.JLabel();
        jLabel_Empleado = new javax.swing.JLabel();
        jLabel_Medicamento = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 56, 77));

        jPanel2.setBackground(new java.awt.Color(38, 40, 55));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Buscador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Buscador.setForeground(new java.awt.Color(240, 240, 240));
        jLabel_Buscador.setText("Buscador :");
        jPanel2.add(jLabel_Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel_Volver.setBackground(new java.awt.Color(153, 51, 255));
        jPanel_Volver.setForeground(new java.awt.Color(240, 240, 240));
        jPanel_Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_VolverMouseClicked(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Volver");
        jPanel_Volver.add(jLabel8);

        jPanel2.add(jPanel_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        jPanel_Volver1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel_Volver1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel_Volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_Volver1MouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Ayuda");
        jPanel_Volver1.add(jLabel9);

        jPanel2.add(jPanel_Volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, -1));

        jLabel_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_account_white_18dp.png"))); // NOI18N
        jLabel_Cliente.setText("Clientes");
        jLabel_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ClienteMouseClicked(evt);
            }
        });

        jLabel_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_worker_white_18dp.png"))); // NOI18N
        jLabel_Empleado.setText("Empleados");
        jLabel_Empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmpleadoMouseClicked(evt);
            }
        });

        jLabel_Medicamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Medicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_medical_bag_white_18dp.png"))); // NOI18N
        jLabel_Medicamento.setText("Medicamentos");
        jLabel_Medicamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MedicamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Empleado)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Cliente)
                            .addComponent(jLabel_Medicamento))
                        .addGap(40, 49, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Empleado)
                .addGap(4, 4, 4)
                .addComponent(jLabel_Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Medicamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_VolverMouseClicked
        Loggin vLoggin = new Loggin();
        vLoggin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel_VolverMouseClicked

    private void jPanel_Volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_Volver1MouseClicked
        JOptionPane.showMessageDialog(this,"Clickar una de las opciones mostradas");
    }//GEN-LAST:event_jPanel_Volver1MouseClicked

    private void jLabel_EmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmpleadoMouseClicked
        Empleado vEmpleado = new Empleado();
        vEmpleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel_EmpleadoMouseClicked

    private void jLabel_ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClienteMouseClicked
        Cliente vCliente = new Cliente();
        vCliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel_ClienteMouseClicked

    private void jLabel_MedicamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MedicamentoMouseClicked
        Medicina vMedicina = new Medicina();
        vMedicina.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel_MedicamentoMouseClicked

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
            java.util.logging.Logger.getLogger(BuscadorAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscadorAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscadorAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscadorAuxiliar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscadorAuxiliar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Buscador;
    private javax.swing.JLabel jLabel_Cliente;
    private javax.swing.JLabel jLabel_Empleado;
    private javax.swing.JLabel jLabel_Medicamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Volver;
    private javax.swing.JPanel jPanel_Volver1;
    // End of variables declaration//GEN-END:variables
}