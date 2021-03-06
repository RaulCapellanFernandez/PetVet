/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePetVet;


import Code.EmpleadoDAO;
import Code.Medicamento;
import Code.MedicamentoDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CP
 */
public class Medicina extends javax.swing.JFrame {

    /**
     * Creates new form Medicina
     */
    public Medicina() throws Exception {
        initComponents();
        rellenarComboBox();
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_Volver = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 56, 77));

        jPanel2.setBackground(new java.awt.Color(38, 40, 55));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ic_medical_bag_white_24dp.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Medicina");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 102));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Cargar");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, 30));

        jComboBox1.setBackground(new java.awt.Color(153, 0, 51));
        jComboBox1.setEditable(true);
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setForeground(new java.awt.Color(240, 240, 240));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Ayuda");
        jPanel4.add(jLabel6);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 80, 30));

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

        jPanel2.add(jPanel_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 30));

        jTextField9.setBackground(jPanel1.getBackground());
        jTextField9.setForeground(new java.awt.Color(240, 240, 240));
        jTextField9.setText("Nombre Medicamento");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(jPanel1.getBackground());
        jTextField8.setForeground(new java.awt.Color(240, 240, 240));
        jTextField8.setText("Código Medicamento");
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField12.setBackground(jPanel1.getBackground());
        jTextField12.setForeground(new java.awt.Color(240, 240, 240));
        jTextField12.setText("Principios Activos (separados por ,)");
        jTextField12.setBorder(null);
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField10.setBackground(jPanel1.getBackground());
        jTextField10.setForeground(new java.awt.Color(240, 240, 240));
        jTextField10.setText("Cantidad Medicamento");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Registro:");

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));
        jPanel5.setForeground(new java.awt.Color(240, 240, 240));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Guardar");
        jPanel5.add(jLabel7);

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setForeground(new java.awt.Color(240, 240, 240));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Modificar");
        jPanel6.add(jLabel9);

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));
        jPanel7.setForeground(new java.awt.Color(240, 240, 240));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Borrar");
        jPanel7.add(jLabel10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        JOptionPane.showMessageDialog(this,"Buscar un medicamento y lo carga\n "
                + "Introducir un nuevo medicamneto y registrarlo");
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel_VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_VolverMouseClicked
        Buscador vBuscador = new Buscador();
        vBuscador.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel_VolverMouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    //CARGAR med
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
       jPanel6.setVisible(true);
       jPanel7.setVisible(true);
       jPanel5.setVisible(false);
        try {
            List<Medicamento> listaMedicamentos;
            Medicamento medicamentoSeleccionado=new Medicamento();
            medicamentoSeleccionado.setNombreTecnico("Ninguno");
            MedicamentoDAO objetoMedicamentoDAO=new MedicamentoDAO();
            listaMedicamentos=objetoMedicamentoDAO.listaMedicamentos;
            String nombreMedicamentoSeleccionado=String.valueOf(jComboBox1.getSelectedItem());;
            for(Code.Medicamento medicamentoAux : listaMedicamentos){
                if(medicamentoAux.getNombreTecnico().equals(nombreMedicamentoSeleccionado)){
                        medicamentoSeleccionado=medicamentoAux;
                }
                else{
                    //System.out.println("No es "+empleadoAux.getName());
                }
            }
            if(medicamentoSeleccionado.getNombreTecnico().equals("Ninguno")){
                //System.out.println("Ese usuario, "+nombreEmpleadoSeleccionado+" no existe!");
                return;
            }
            else{
                //System.out.println("Has seleccionado al empleado"+empleadoSeleccionado.getName());
                jTextField8.setText(String.valueOf(medicamentoSeleccionado.getCodigoMedicamento()));
                jTextField9.setText(String.valueOf(medicamentoSeleccionado.getNombreTecnico()));
                jTextField10.setText(String.valueOf(medicamentoSeleccionado.getCantidadMedicamento()));
                ArrayList<String> listPrin=medicamentoSeleccionado.getPrincipiosActivos();
                String strListPrin="";
                for(String aux : listPrin){
                    strListPrin=strListPrin+aux+",";
                }
                jTextField12.setText(strListPrin);
               
            }
        } catch (Exception ex) {
            System.out.println("Wops");
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel3MouseClicked
    //MODIFICAR
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        try{
            
            String nombreViejo=String.valueOf(jComboBox1.getSelectedItem());
            int codViejo=9999;
            String codigoNuevo=jTextField8.getText();
            MedicamentoDAO objetoMedicamentoDAO=new MedicamentoDAO();
            
            List<Code.Medicamento> listaMeds=objetoMedicamentoDAO.listaMedicamentos;
            for(Code.Medicamento aux : listaMeds){
                if(aux.getNombreTecnico().equals(nombreViejo)){
                    codViejo=aux.getCodigoMedicamento();
                }
            }
            if(codViejo==9999){
                System.err.println("El medicamento no existe");
                return;
            }
            
            
            Medicamento lista = new Medicamento();
            
            ArrayList<String> listaMedicamentos = new ArrayList<String>();
            listaMedicamentos.add(jTextField12.getText());
            System.out.println(jTextField12.getText());
            
            int codigo = Integer.parseInt(jTextField8.getText());
            int cantidad = Integer.parseInt(jTextField10.getText());
            
            Medicamento medicamentoModificar= new Medicamento();
            medicamentoModificar.setCodigoMedicamento(codigo);
            medicamentoModificar.setNombreTecnico(jTextField9.getText());
            medicamentoModificar.setCantidadMedicamento(cantidad);
            medicamentoModificar.setPrincipiosActivos(listaMedicamentos);
            
            System.out.println("Vamos a Modificar el objeto");
            objetoMedicamentoDAO.modificar(medicamentoModificar,codViejo);
           
        } catch (Exception ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel6MouseClicked
    //BORRAR
    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        try{
            String codigoNuevo=jTextField8.getText();
            MedicamentoDAO objetoMediacmentoDAO=new MedicamentoDAO();
            int codigo = Integer.parseInt(jTextField8.getText());
            Medicamento medicamentoBorrar= new Medicamento();
            medicamentoBorrar.setCodigoMedicamento(codigo);
            
            System.out.println("Vamos a Borrar el objeto");
            objetoMediacmentoDAO.eliminar(medicamentoBorrar);
            dispose();
            Medicina jVentana= new Medicina();
            jVentana.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jPanel7MouseClicked
    //Nueva med
    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        try {
            //System.out.println("Quieres guardar un objeto!");
            String nombreNuevo=jTextField9.getText();
            MedicamentoDAO objetoMedicamentoDAO=new MedicamentoDAO();
            //System.out.println("Hay "+objetoEmpleadoDAO.listaEmpleados.size()+" empleados");
            List<Code.Medicamento> listMeds = objetoMedicamentoDAO.listaMedicamentos;
            for(Code.Medicamento aux : listMeds){
                if(aux.getNombreTecnico().equals(nombreNuevo)){
                    System.err.println("Ese medicamento ya existe");
                    JOptionPane.showMessageDialog(this,"Ese ya existe");
                    return;
                }
            }
            
            Medicamento medicamentoNuevo= new Medicamento();
            medicamentoNuevo.setCodigoMedicamento(Integer.valueOf(jTextField8.getText()));
            medicamentoNuevo.setNombreTecnico(jTextField9.getText());
            medicamentoNuevo.setCantidadMedicamento(Integer.valueOf(jTextField10.getText()));
            
            ArrayList<String> listaMedicamentos = new ArrayList<String>();
            listaMedicamentos.add(jTextField12.getText());
            
            medicamentoNuevo.setPrincipiosActivos(listaMedicamentos);
            
            
            System.out.println("Vamos a registrar el objeto");
            objetoMedicamentoDAO.registrar(medicamentoNuevo);
            jComboBox1.insertItemAt(medicamentoNuevo.getNombreTecnico(), jComboBox1.getItemCount());
        } catch (Exception ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return;
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Medicina().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Medicina.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel_Volver;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void rellenarComboBox() throws Exception {
       List<Medicamento> listaMedicamentos;
       MedicamentoDAO lista = new MedicamentoDAO();
       listaMedicamentos = lista.listar();
       
       for(int i = 0; i< listaMedicamentos.size()/2; i++){
           jComboBox1.addItem(String.valueOf(listaMedicamentos.get(i).getNombreTecnico()));
       }
       
    }
}
