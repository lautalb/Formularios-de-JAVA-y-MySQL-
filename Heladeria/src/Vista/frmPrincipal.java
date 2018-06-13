/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /* para hacer formulario unico
    public void controlarInstancia(JInternalFrame inter){
        boolean mostrar=true;
        
        for (int i = 0; i < PanelPrincipal.getComponentCount(); i++) {
            if(inter.getClass().isInstance(PanelPrincipal.getComponent(i))){
                mostrar=false;
            }
        }
        
        if(mostrar){
            inter.setClosable(true);
            inter.setMaximizable(true);
            PanelPrincipal.add(inter);
            inter.setVisible(true);
        }
    }
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHelado = new javax.swing.JMenu();
        btnNuevoHelado = new javax.swing.JMenuItem();
        btnListarHelados = new javax.swing.JMenuItem();
        miVender = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        mHelado.setText("Helado");

        btnNuevoHelado.setText("Nuevo helado");
        btnNuevoHelado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoHelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoHeladoActionPerformed(evt);
            }
        });
        mHelado.add(btnNuevoHelado);

        btnListarHelados.setText("Listar helados");
        btnListarHelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarHeladosActionPerformed(evt);
            }
        });
        mHelado.add(btnListarHelados);

        miVender.setText("Vender");
        miVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVenderActionPerformed(evt);
            }
        });
        mHelado.add(miVender);

        jMenuBar1.add(mHelado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarHeladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarHeladosActionPerformed
        //frmListadoHelados formulario = new frmListadoHelados();
        //this.controlarInstancia(formulario);
        try {
            //if (frmListadoHelados.PuedoCrearOtra()) 
            {
                frmListadoHelados formulario = new frmListadoHelados();
                PanelPrincipal.add(formulario);
                formulario.setVisible(true);
                formulario.setClosable(true);
                formulario.setMaximizable(true);

            }
        } catch (Exception e) {
            System.out.println("error "+e.toString());
            JOptionPane.showMessageDialog(null, "Ya tiene la ventana abierta!");
        }

    }//GEN-LAST:event_btnListarHeladosActionPerformed

    private void btnNuevoHeladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoHeladoActionPerformed
        //frmHelado formulario = new frmHelado();
        //this.controlarInstancia(formulario);

//        try {
//            if (frmHelado.PuedoCrearOtra()) {
//                frmHelado formulario = new frmHelado();
//                PanelPrincipal.add(formulario);
//                formulario.setVisible(true);
//                formulario.setClosable(true);
//                formulario.setMaximizable(true);
//            }
//        } catch (Exception e) {
//        }

        try {
            frmHeladoConFoto frm = new frmHeladoConFoto();
            PanelPrincipal.add(frm);
            frm.setMaximizable(true);
            frm.setClosable(true);
            frm.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya tiene la ventana abierta!");
        }
            

    }//GEN-LAST:event_btnNuevoHeladoActionPerformed

    private void miVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVenderActionPerformed
        try {
            frmVenta frm = new frmVenta();
            PanelPrincipal.add(frm);
            frm.setMaximizable(true);
            frm.setClosable(true);
            frm.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya tiene la ventana abierta!");
        }
    }//GEN-LAST:event_miVenderActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane PanelPrincipal;
    private javax.swing.JMenuItem btnListarHelados;
    private javax.swing.JMenuItem btnNuevoHelado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mHelado;
    private javax.swing.JMenuItem miVender;
    // End of variables declaration//GEN-END:variables
}
