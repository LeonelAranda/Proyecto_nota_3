/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Productos;
import java.sql.Connection;
/**
 *
 * @author leoaranda
 * @version 28-11-2021
 */
public class Registro {
    
    public boolean agregar(Productos productos){
        
        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            Productos prod = new Productos();
            date = prod.getAdd_date();
            
        } catch (Exception e) {
        }
    }
    
}
