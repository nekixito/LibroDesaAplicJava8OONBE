/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import java.awt.HeadlessException;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.ArregloFacturas;
import pClases.Factura;

/**
 *
 * @author Multi
 */
public class FrmVenta extends javax.swing.JFrame {
    ArregloFacturas arreFact = new ArregloFacturas();
    int num = 0;

    /**
     * Creates new form FrmVenta
     */
    public FrmVenta() {
        initComponents();
        definirAnchos();
        asignaFecha();
        habilitaCajas(false);
        btnGrabarIngreso.setVisible(false);
        btnGrabarModificado.setVisible(false);
    }

    void definirAnchos(){
        TableColumn columna;
        columna = tFacturas.getColumnModel().getColumn(0);
        columna.setPreferredWidth(30);
        columna = tFacturas.getColumnModel().getColumn(1);
        columna.setPreferredWidth(50);
        columna = tFacturas.getColumnModel().getColumn(2);
        columna.setPreferredWidth(150);
        columna = tFacturas.getColumnModel().getColumn(3);
        columna.setPreferredWidth(70);
        tFacturas.getTableHeader().setReorderingAllowed(false);
        tFacturas.getTableHeader().setResizingAllowed(false);
    }
    
    void habilitaCajas(boolean opcion){
        txtNFactura.setEditable(opcion);
        txtVendedor.setEditable(opcion);
        txtMonto.setEditable(opcion);
        txtFechaVenta.setEditable(opcion);
    }
    
    void limpiaCajas(){
        txtNFactura.setText("");
        txtVendedor.setText("");
        txtMonto.setText("");
        txtFechaVenta.setText("");
    }
    
    void limpiaMatriz(){
        for (int i = 0; i < 10; i++) {
            tFacturas.setValueAt("", i, 0);
            tFacturas.setValueAt("", i, 1);
            tFacturas.setValueAt("", i, 2);
            tFacturas.setValueAt("", i, 3);
        }
    }
    
    public int generaNumero(){
        num++;
        return num;
    }
    
    public int getNumFact(){
        return Integer.parseInt(txtNFactura.getText());
    }
    
    public String getFecha(){
        return txtFechaVenta.getText();
    }
    
    public String getVendedor(){
        return txtVendedor.getText();
    }
    
    public double getMonto(){
        return Double.parseDouble(txtMonto.getText());
    }
    
    void listar(){
        if(arreFact.getTamanio() >0){
            for (int i = 0; i < arreFact.getTamanio(); i++) {
                Factura fact = arreFact.obtener(i);
                tFacturas.setValueAt(fact.getnFactura(), i, 0);
                tFacturas.setValueAt(fact.getFecha(), i, 1);
                tFacturas.setValueAt(fact.getVendedor(), i, 2);
                tFacturas.setValueAt(fact.getMonto(), i, 3);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay facturas registradas", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            limpiaMatriz();
        }
        
    }
    
    
    
    void asignaFecha(){
        GregorianCalendar cal = new GregorianCalendar();
        txtFechaVenta.setText(cal.get(cal.DAY_OF_MONTH)+"/"+cal.MONTH+"/"+cal.get(cal.YEAR));
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
        txtNFactura = new javax.swing.JTextField();
        txtFechaVenta = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFacturas = new javax.swing.JTable();
        btnGrabarIngreso = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnGrabarModificado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("REGISTRO DE VENTAS (FACTURACIÓN)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(123, 11, 211, 14);

        txtNFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Factura"));
        getContentPane().add(txtNFactura);
        txtNFactura.setBounds(10, 36, 169, 61);

        txtFechaVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Actual"));
        getContentPane().add(txtFechaVenta);
        txtFechaVenta.setBounds(520, 40, 172, 61);

        txtVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Vendedor"));
        getContentPane().add(txtVendedor);
        txtVendedor.setBounds(10, 120, 410, 68);

        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto a Registrar"));
        getContentPane().add(txtMonto);
        txtMonto.setBounds(460, 120, 230, 68);

        tFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. Factura", "Fecha de Venta", "Vendedor", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tFacturas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 305, 680, 190);

        btnGrabarIngreso.setText("<html><center>Grabar Ingreso</center></html>");
        btnGrabarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarIngreso);
        btnGrabarIngreso.setBounds(610, 230, 80, 60);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(30, 230, 80, 60);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(120, 230, 90, 60);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(220, 230, 80, 60);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(310, 230, 80, 60);

        btnListado.setText("Listado");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListado);
        btnListado.setBounds(450, 230, 80, 60);

        btnGrabarModificado.setText("<html><center>Grabar Modificado</center></html>");
        btnGrabarModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarModificadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarModificado);
        btnGrabarModificado.setBounds(530, 230, 80, 60);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mantenimiento"));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 201, 690, 98);

        setBounds(0, 0, 720, 553);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        txtNFactura.setText(""+generaNumero());
        asignaFecha();
        txtVendedor.requestFocus();
        
        habilitaCajas(true);
        txtVendedor.setEditable(true);
        txtMonto.setEditable(true);
        
        txtVendedor.setText("");
        txtMonto.setText("");
        
        btnRegistrar.setVisible(false);
        btnGrabarIngreso.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGrabarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIngresoActionPerformed
        try{
            habilitaCajas(false);
            btnRegistrar.setVisible(true);
            btnGrabarIngreso.setVisible(false);
            Factura fact = new Factura(getNumFact(), getFecha(), getVendedor(), getMonto());
        
            arreFact.agregar(fact);
            listar();
            JOptionPane.showMessageDialog(null, "Factura ingresada correctamente", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al querer grabar", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        }
        
        btnGrabarModificado.setVisible(false);
        btnModificar.setVisible(true);
    }//GEN-LAST:event_btnGrabarIngresoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            limpiaCajas();
            limpiaMatriz();
            
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un número de factura"));
            Factura fact = arreFact.buscar(buscoFactura);
            if(fact != null){
                tFacturas.setValueAt(fact.getnFactura(), 0, 0);
                tFacturas.setValueAt(fact.getFecha(), 0, 1);
                tFacturas.setValueAt(fact.getVendedor(), 0, 2);
                tFacturas.setValueAt(fact.getMonto(), 0, 3);
            }else{
                JOptionPane.showMessageDialog(null, "Factura No encontrada", "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de entrada de datos", "Confirmación", JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        limpiaCajas();
        limpiaMatriz();
        listar();
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            limpiaCajas();
            limpiaMatriz();
        
            btnModificar.setVisible(false);
            btnGrabarModificado.setVisible(true);
        
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese un número de factura"));
            Factura fact = arreFact.buscar(buscoFactura);
            
            if(fact != null){
                tFacturas.setValueAt(fact.getnFactura(), 0, 0);
                tFacturas.setValueAt(fact.getFecha(), 0, 1);
                tFacturas.setValueAt(fact.getVendedor(), 0, 2);
                tFacturas.setValueAt(fact.getMonto(), 0, 3);
                
                txtNFactura.setText(""+fact.getnFactura());
                txtFechaVenta.setText(fact.getFecha());
                txtVendedor.setText(fact.getVendedor());
                txtMonto.setText(""+fact.getMonto());
                
                habilitaCajas(true);
                txtNFactura.setEditable(false);
                txtFechaVenta.setEditable(false);
                
            }else{
                JOptionPane.showMessageDialog(null, "Factura No encontrada", "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error de entrada de datos", "Confirmación", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGrabarModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarModificadoActionPerformed
        try{    
            Factura fact = arreFact.buscar(getNumFact());
            fact.setVendedor(getVendedor());
            fact.setMonto(getMonto());
            JOptionPane.showMessageDialog(null, "Factura modificada correctamente", 
                                                "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            listar();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar grabar.", "Confirmación", JOptionPane.ERROR_MESSAGE);
        }
        
        btnGrabarModificado.setVisible(false);
        btnModificar.setVisible(true);
        
    }//GEN-LAST:event_btnGrabarModificadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{   
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese un número de factura a eliminar"));
            Factura fact = arreFact.buscar(buscoFactura);
            
            if(fact != null){
                arreFact.eliminar(fact);
                JOptionPane.showMessageDialog(null, "Factura eliminada", 
                                                "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                listar();
            }else{
                JOptionPane.showMessageDialog(null, "NO existe el número de factura ingresada", "Confirmación", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar eliminar.", "Confirmación", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabarIngreso;
    private javax.swing.JButton btnGrabarModificado;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFacturas;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNFactura;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
