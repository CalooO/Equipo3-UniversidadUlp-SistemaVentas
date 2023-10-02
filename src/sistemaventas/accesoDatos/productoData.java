
package sistemaventas.accesoDatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaventas.entidades.Producto;

public class productoData {
    private Connection cx = null;

    public productoData() {
        cx = conexion.getConexion();
    }
    
    public void guardarProducto(Producto prod){
        String sql="Insert into producto (nombreProducto, descripcion, precioActual, stock, estado) "
                + "Values (?,?,?,?,?)";
        try {
            PreparedStatement ps=cx.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,prod.getNombreProducto());
            ps.setString(2, prod.getDescripcion());
            ps.setDouble(3, prod.getPrecioActual());
            ps.setInt(4, prod.getStock());
            ps.setBoolean(5, prod.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                prod.setIdProducto(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"Producto agregado.");
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
    }
    
    public void modificarProducto(Producto prod){
        String sql="Update producto set nombreProducto=?, descripcion=?, precioActual=?, stock=?, estado=? "
                + "where idProducto=?";
        try {
            PreparedStatement ps=cx.prepareStatement(sql);
            ps.setString(1, prod.getNombreProducto());
            ps.setString(2, prod.getDescripcion());
            ps.setDouble(3, prod.getPrecioActual());
            ps.setInt(4, prod.getStock());
            ps.setBoolean(5, prod.isEstado());
            ps.setInt(6, prod.getIdProducto());
            
            int exito=ps.executeUpdate();
            if(1==exito){
                 JOptionPane.showMessageDialog(null,"Producto modificado.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
    }
    
    public void borrarProducto(int id){
         String sql="Update producto set estado=0 where idProducto=?";
        try {
            PreparedStatement ps=cx.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(1==exito){
                 JOptionPane.showMessageDialog(null,"Producto dado de baja.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
    }
    
    public Producto obtenerProductoPodid(int id){
        String sql="select idProducto, nombreProducto, descripcion, precioActual, stock, estado from producto where idProducto=?";
        Producto prod=null;
        try {
            PreparedStatement ps=cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                prod = new Producto();
                prod.setIdProducto(id);
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null,"No existe el producto con id= "+id);         
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        } catch(NullPointerException e){
        }
        return prod;
    }
    
    public void obtenerProductoPorNombre(String nombre){
        // que busque letra por letra
    }
    
    public ArrayList<Producto> listarProducto (){
        String sql="select idProducto, nombreProducto, descripcion, precioActual, stock from alumno where estado=1";
        ArrayList<Producto> listaProducto=new ArrayList<>();
        try {
            PreparedStatement ps=cx.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
                Producto prod=new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(true);
                listaProducto.add(prod);
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla alumno "+ex.getMessage());
        }
        return listaProducto;
    }
}
