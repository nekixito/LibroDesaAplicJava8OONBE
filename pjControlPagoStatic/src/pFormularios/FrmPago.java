/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pClases.Pago;

/**
 *
 * @author Multi
 */
public class FrmPago extends javax.swing.JFrame {
    //Definición de modelos
    DefaultListModel modEmpleado = new DefaultListModel();
    DefaultListModel modPagoHora = new DefaultListModel();
    DefaultListModel modBonificacion = new DefaultListModel();
    DefaultListModel modSueldo = new DefaultListModel();
    DefaultListModel modEstadistica = new DefaultListModel();
    
    Pago objPago;

    /**
     * Creates new form FrmPago
     */
    public FrmPago() {
        initComponents();
        llenaCargo();
        llenaModalidad();
    }
    
    void llenaCargo(){
        cboCargo.addItem("Gerente");
        cboCargo.addItem("Administrativo");
        cboCargo.addItem("Jefe");
        cboCargo.addItem("Operario");
    }
    
    void llenaModalidad(){
        cboModalidad.addItem("Tiempo completo");
        cboModalidad.addItem("Tiempo parcial");
    }

    //Metodos para capturar los valores del formulario
    String getEmpleado(){
        return txtEmpleado.getText();
    }
    
    int getHoras(){
        return Integer.parseInt(txtHoras.getText());
    }
    
    String getCargo(){
        return String.valueOf(cboCargo.getSelectedItem());
    }
    
    String getModalidad(){
        return String.valueOf(cboModalidad.getSelectedItem());
    }
    
    //Validacion de controles
    String valida(){
        if(txtEmpleado.getText().equals("")){
            return "Nombre del empleado";
        }else if(txtHoras.getText().equals("") || Integer.parseInt(txtHoras.getText()) < 0){
            return "Horas trabajadas";
        }else if (cboCargo.getSelectedIndex() == -1){
            return "Cargo del empleado";
        }else if (cboModalidad.getSelectedIndex() == -1){
            return "Cargo del empleado";
        }else {
            return "";
        }
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
        lblTitPag = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        cboCargo = new javax.swing.JComboBox<>();
        cboModalidad = new javax.swing.JComboBox<>();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmpleado = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPagoxHora = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstBonificacion = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstSueldo = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstEstadisticas = new javax.swing.JList<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitPag.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitPag.setText("PAGO DE EMPLEADOS");

        txtEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE DEL EMPEADO"));

        txtHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("HORAS TRABAJADAS"));

        cboCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCIONE CARGO"));

        cboModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCIONE MODALIDAD"));

        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        lstEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("EMPLEADOS"));
        jScrollPane1.setViewportView(lstEmpleado);

        lstPagoxHora.setBorder(javax.swing.BorderFactory.createTitledBorder("PxH"));
        jScrollPane2.setViewportView(lstPagoxHora);

        lstBonificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("BONIFICA"));
        jScrollPane3.setViewportView(lstBonificacion);

        lstSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("SUELDO NETO"));
        jScrollPane4.setViewportView(lstSueldo);

        lstEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder("ESTADÍSTICAS"));
        jScrollPane5.setViewportView(lstEstadisticas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(lblTitPag)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cboCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, 332, Short.MAX_VALUE)
                                .addComponent(txtEmpleado, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboModalidad, 0, 245, Short.MAX_VALUE)
                                .addComponent(txtHoras))
                            .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitPag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoras)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboModalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(cboCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        if(valida().equals("")){
            objPago = new Pago(getEmpleado(),getCargo(),getModalidad(),getHoras());
            
           
            modEmpleado.addElement(getEmpleado());
            modPagoHora.addElement(String.format("%.2f", objPago.asignaPagoxHora()));
            double bruto = objPago.calculaBruto();
            modBonificacion.addElement(String.format("%.2f",objPago.asignaBonificacion(bruto)));
            modSueldo.addElement(String.format("%.2f",objPago.calculaSueldo()));
            
            lstEmpleado.setModel(modEmpleado);
            lstPagoxHora.setModel(modPagoHora);
            lstBonificacion.setModel(modBonificacion);
            lstSueldo.setModel(modSueldo);
        }else{
            JOptionPane.showMessageDialog(null, "El error esta en: \n" + valida());
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        modEstadistica.clear();
        modEstadistica.addElement("El total de empleados es: " + Pago.getTotal());
        modEstadistica.addElement("------------------------------");
        modEstadistica.addElement("El total de Gerentes es: " + Pago.gettGerente());
        modEstadistica.addElement("El total de Administrativos es: " + Pago.gettAdministrativo());
        modEstadistica.addElement("El total de Jefes es: " + Pago.gettJefe());
        modEstadistica.addElement("El total de Operarios es: " + Pago.gettOperario());
        modEstadistica.addElement("------------------------------");
        modEstadistica.addElement("Cantidad de empleados que ganan menos de $1200: " + Pago.getcMenos1200());
        modEstadistica.addElement("Cantidad de empleados que ganan entre $1200 y $2500: " + Pago.getcEntre1200y2500());
        modEstadistica.addElement("Cantidad de empleados que ganan más de $2500: " + Pago.getcMas2500()); 
        
        lstEstadisticas.setModel(modEstadistica);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        modEmpleado.removeAllElements();
        modPagoHora.removeAllElements();
        modBonificacion.removeAllElements();
        modSueldo.removeAllElements();
        
        modEstadistica.removeAllElements();
        
        cboCargo.setSelectedIndex(0);
        cboModalidad.setSelectedIndex(0);
        
        Pago.reiniciarEstaticas();
        
        txtEmpleado.setText("");
        txtHoras.setText("");
        txtEmpleado.requestFocus();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JComboBox<String> cboModalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitPag;
    private javax.swing.JList<String> lstBonificacion;
    private javax.swing.JList<String> lstEmpleado;
    private javax.swing.JList<String> lstEstadisticas;
    private javax.swing.JList<String> lstPagoxHora;
    private javax.swing.JList<String> lstSueldo;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
