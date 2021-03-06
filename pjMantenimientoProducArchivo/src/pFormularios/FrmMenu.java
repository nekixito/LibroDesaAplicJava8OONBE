/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Multi
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        dpMenu = new javax.swing.JDesktopPane();
        jMenuBarra = new javax.swing.JMenuBar();
        jMenuListado = new javax.swing.JMenu();
        jMenuItemListar = new javax.swing.JMenuItem();
        jMenuItemBuscar = new javax.swing.JMenuItem();
        jMenuManten = new javax.swing.JMenu();
        jMenuItemAgre = new javax.swing.JMenuItem();
        jMenuItemMod = new javax.swing.JMenuItem();
        jMenuItemElim = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpMenuLayout = new javax.swing.GroupLayout(dpMenu);
        dpMenu.setLayout(dpMenuLayout);
        dpMenuLayout.setHorizontalGroup(
            dpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        dpMenuLayout.setVerticalGroup(
            dpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        jMenuListado.setText("LISTADO");

        jMenuItemListar.setText("LISTAR TODOS");
        jMenuItemListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarActionPerformed(evt);
            }
        });
        jMenuListado.add(jMenuItemListar);

        jMenuItemBuscar.setText("BUSCAR");
        jMenuItemBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBuscarActionPerformed(evt);
            }
        });
        jMenuListado.add(jMenuItemBuscar);

        jMenuBarra.add(jMenuListado);

        jMenuManten.setText("MANTENIMIENTO");

        jMenuItemAgre.setText("AGREGAR");
        jMenuItemAgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgreActionPerformed(evt);
            }
        });
        jMenuManten.add(jMenuItemAgre);

        jMenuItemMod.setText("MODIFICAR");
        jMenuItemMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModActionPerformed(evt);
            }
        });
        jMenuManten.add(jMenuItemMod);

        jMenuItemElim.setText("ELIMINAR");
        jMenuItemElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemElimActionPerformed(evt);
            }
        });
        jMenuManten.add(jMenuItemElim);

        jMenuBarra.add(jMenuManten);

        jMenuSalir.setText("SALIR");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuBarra.add(jMenuSalir);

        setJMenuBar(jMenuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarActionPerformed
        FrmListadoProductos objListado = new FrmListadoProductos();
        dpMenu.add(objListado);
        objListado.show();
    }//GEN-LAST:event_jMenuItemListarActionPerformed

    private void jMenuItemAgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgreActionPerformed
        FrmNuevoProducto objNuevo = new FrmNuevoProducto();
        dpMenu.add(objNuevo);
        objNuevo.show();
    }//GEN-LAST:event_jMenuItemAgreActionPerformed

    private void jMenuItemElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemElimActionPerformed
        FrmEliminaProducto objEliminar = new FrmEliminaProducto();
        dpMenu.add(objEliminar);
        objEliminar.show();
    }//GEN-LAST:event_jMenuItemElimActionPerformed

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        int s = JOptionPane.showOptionDialog(this, "Estas seguro de salir?", "Productos", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null,null);
        
        if(s == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuItemBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBuscarActionPerformed
        FrmBuscaProducto objBuscar = new FrmBuscaProducto();
        dpMenu.add(objBuscar);
        objBuscar.show();
    }//GEN-LAST:event_jMenuItemBuscarActionPerformed

    private void jMenuItemModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModActionPerformed
        FrmActualizaProducto objActualiza = new FrmActualizaProducto();
        dpMenu.add(objActualiza);
        objActualiza.show();
    }//GEN-LAST:event_jMenuItemModActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpMenu;
    private javax.swing.JMenuBar jMenuBarra;
    private javax.swing.JMenuItem jMenuItemAgre;
    private javax.swing.JMenuItem jMenuItemBuscar;
    private javax.swing.JMenuItem jMenuItemElim;
    private javax.swing.JMenuItem jMenuItemListar;
    private javax.swing.JMenuItem jMenuItemMod;
    private javax.swing.JMenu jMenuListado;
    private javax.swing.JMenu jMenuManten;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
