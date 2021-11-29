
package modelo;

import java.util.Date;

/**
 *
 * @author leoaranda
 * @version 28-11-2021
 */
public class Productos {
    
    private int id_producto;
    private String nombre;
    private int cantidad;
    private String tipo_producto;
    private Date add_date;

    public Productos() {
    }

    public Productos(int id_producto, String nombre, int cantidad, String tipo_producto, Date add_date) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipo_producto = tipo_producto;
        this.add_date = add_date;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }
    
    
    
    
}
