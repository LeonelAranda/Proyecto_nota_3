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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
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
            
            String query ="INSERT INTO productos(nombre,cantidad,tipo_producto,add_date)VALUES (?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,productos.getNombre());
            stmt.setInt(2, productos.getCantidad());
            stmt.setString(3,productos.getTipo_producto());
            stmt.setDate(4,new java.sql.Date(date.getTime()));
            
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar producto.");
            return false;
        }catch (Exception e){
            System.out.println("Error al agregar producto.");
            return false;
        }
    }
 
    
    public boolean actualizar (Productos productos){
        
        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            Productos prod = new Productos();
            date = prod.getAdd_date();
            
            String query ="UPDATE productos SET nombre=? cantidad=? tipo_producto=? add_date=? WHERE = id_producto";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,productos.getNombre());
            stmt.setInt(2, productos.getCantidad());
            stmt.setString(3,productos.getTipo_producto());
            stmt.setDate(4,new java.sql.Date(date.getTime()));
            stmt.setInt(5,productos.getId_producto());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar producto.");
            return false;
        }catch (Exception e){
            System.out.println("Error al actualizar producto.");
            return false;
        }
    }
            public boolean eliminar (int id_producto){
                
            
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                    
            
            String query ="DELETE FROM productos WHERE id_producto=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,id_producto);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar producto.");
            return false;
        }catch (Exception e){
            System.out.println("Error al eliminar producto.");
            return false;
        } 
                
    }
            public Productos buscarPorId( int id_producto){
                
                try {
                    Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                    
            
            String query ="SELECT * FROM productos WHERE id_producto=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,id_producto);
                    
            ResultSet rs = stmt.executeQuery();
                    
                    
                } catch (Exception e) {
                }
                
                
                
            }
           
}

