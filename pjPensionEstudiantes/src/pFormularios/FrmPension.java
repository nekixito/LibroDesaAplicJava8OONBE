/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pClases.Pension;

/**
 *
 * @author Multi
 */
public class FrmPension extends javax.swing.JFrame {
    DefaultListModel modResumen = new DefaultListModel();

    /**
     * Creates new form FrmPension
     */
    public FrmPension() {
        initComponents();
        llenaCategoria();
    }
    
    void llenaCategoria(){
        cboCategoria.addItem("A");
        cboCategoria.addItem("B");
        cboCategoria.addItem("C");
        cboCategoria.addItem("D");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitPens = new javax.swing.JLabel();
        txtEstudiante = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        txtPromedio = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstResumen = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de pensión");

        lblTitPens.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitPens.setText("CONTROL DE PENSIÓN DE ESTUDIANTES");

        txtEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE DEL ESTUDIANTE"));

        cboCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECCIONE CATEGORÍA"));
        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        txtPromedio.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESE PROMEDIO"));

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

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitPens)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEstudiante))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitPens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPromedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        Pension objPension = new Pension();
        
        objPension.setEstudiante(txtEstudiante.getText());
        objPension.setCategoria((String) cboCategoria.getSelectedItem());
        objPension.setPromedio(Double.parseDouble(txtPromedio.getText()));
        
        double pension = objPension.calculaPensionPorCategoria();
        double descuento = objPension.calculaDescuento();
        double totalPension = objPension.calculaMontoFinal();
        
        modResumen.clear();
        modResumen.addElement("** RESUMEN DE PAGO DE PENSIONES **");
        modResumen.addElement("ESTUDIANTE: " + objPension.getEstudiante());
        modResumen.addElement("CATEGORIA: " + objPension.getCategoria());
        modResumen.addElement("PROMEDIO: " + objPension.getPromedio());
        modResumen.addElement("--------------------------------------");
        modResumen.addElement("PENSIÓN: " + String.format("%.2f", pension));
        modResumen.addElement("DESCUENTO: " + String.format("%.2f",descuento));
        modResumen.addElement("NUEVA PENSIÓN: " + String.format("%.2f", totalPension));
        
        lstResumen.setModel(modResumen);
        
        
        
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtEstudiante.setText("");
        txtPromedio.setText("");
        cboCategoria.setSelectedIndex(0);
        modResumen.clear();
        
        txtEstudiante.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r = JOptionPane.showOptionDialog(this, "Estas seguro ... ?", "Monto pensión", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        if(r == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPension().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitPens;
    private javax.swing.JList<String> lstResumen;
    private javax.swing.JTextField txtEstudiante;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
