/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heladeria;

import Entidades.Helado;
import Vista.frmPrincipal;
import dao.conexion;
import javax.swing.ImageIcon;

/**
 *
 * @author alumno
 */
public class Heladeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       frmPrincipal frm = new frmPrincipal();
        frm.setExtendedState(frm.MAXIMIZED_BOTH);
        frm.setVisible(true);



        
//        
//        Helado.guardarUnHelado(helado);
    }

}
