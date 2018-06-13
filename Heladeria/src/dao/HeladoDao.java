/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entidades.Helado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class HeladoDao {

    public void guardarHelado(Helado helado) {

        try {
            conexion con = new conexion();
            Connection conn = con.RetornarConeccion();

            PreparedStatement ps = conn.prepareStatement("INSERT INTO HELADO (SABOR, RUTA) VALUES (?,?)");
            ps.setString(1, helado.getSabor());
            ps.setString(2, helado.getRuta());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Los datos fueron cargados correctamente!");
            ps.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            
        }

    }

    public ArrayList<Helado> listarHelados() {

        ArrayList<Helado> lista = new ArrayList<Helado>();
        Helado helado;

        try {
            conexion con = new conexion();
            Connection conn = con.RetornarConeccion();

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM HELADO");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                helado = new Helado();
                helado.setId(Integer.parseInt(rs.getString("idHelado")));
                helado.setSabor(rs.getString("sabor"));
                helado.setRuta(rs.getString("ruta"));

                lista.add(helado);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return lista;
    }
}
