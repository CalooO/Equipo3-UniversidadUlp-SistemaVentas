
package sistemaventas.accesoDatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaventas.entidades.Producto;

public class ProductoData {
    private Connection cx = null;

    public ProductoData() {
        cx = conexion.getConexion();
    }
    
    public void guardarProducto(Producto prod){
        String sql="Insert into producto (idProducto, nombreProducto, descripcion, precioActual, stock, estado) "
                + "Values (?,?,?,?,?,?)";
        try {
            PreparedStatement ps=cx.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, prod.getIdProducto());
            ps.setString(2,prod.getNombreProducto());
            ps.setString(3, prod.getDescripcion());
            ps.setDouble(4, prod.getPrecioActual());
            ps.setInt(5, prod.getStock());
            ps.setBoolean(6, prod.isEstado());
            int exito=ps.executeUpdate();
            if(1==exito){
                 JOptionPane.showMessageDialog(null,"Producto agregado.");
            }
            /*ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                prod.setIdProducto(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"Producto agregado.");
            }*/
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
                 JOptionPane.showMessageDialog(null,"Producto dado de baja.","",JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
    }
    
    public Producto obtenerProductoPorid(int id){
        String sql="select idProducto, nombreProducto, descripcion, precioActual, stock, estado from producto where idProducto=?";
        Producto prod= new Producto();
        try {
            PreparedStatement ps=cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                prod.setIdProducto(id);
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "No se encuentran productos asociados al codigo: " + id, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(NullPointerException e){
        }
        return prod;
    }
    
    public void obtenerProductoPorNombre(String nombre){
        // que busque letra por letra
    }
    
    public ArrayList<Producto> listarProducto (){
        String sql="select * from producto";
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
                prod.setEstado(rs.getBoolean("estado"));
                listaProducto.add(prod);
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
        return listaProducto;
    }
    
    public Producto obtenerProducto(int id){
        String sql="select idProducto, nombreProducto, descripcion, precioActual, stock, estado from producto where idProducto=?";
        Producto prod = null;
        try {
            PreparedStatement ps=cx.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                prod= new Producto();
                prod.setIdProducto(id);
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch(NullPointerException e){
        }
        return prod;
    }
    
    public ArrayList<Producto> listarProductoPorNombreDescYId (String id, String n, String d){
        PreparedStatement ps=null;
        String sql=null;
        ArrayList<Producto> listaProducto=new ArrayList<>();
        int opc =0;
        
        if(!id.isEmpty() && !n.isEmpty() && !d.isEmpty()){
            opc=7;                                                                                                          // 7 id - nombre - desc
        }else if(!n.isEmpty() && !d.isEmpty()){
            opc=6;                                                                                                          // 6 nombre - desc
        }else if(!id.isEmpty() && !d.isEmpty()){
            opc=5;                                                                                                          // 5 id - desc
        }else if(!id.isEmpty() && !n.isEmpty()){
            opc=4;                                                                                                          // 4 id - nombre
        }else if(!d.isEmpty()){
            opc=3;                                                                                                          // 3 desc
        }else if(!n.isEmpty()){
            opc=2;                                                                                                          // 2 nombre
        }else if(!id.isEmpty()){
            opc=1;                                                                                                          // 1 id
        }
        try {
        switch(opc){
            case 1:
                sql="select * from producto where idProducto LIKE ?";
                id=id+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, id);break;
            case 2:
                sql="select * from producto where nombreProducto LIKE ?";
                n=n+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, n);break;
            case 3:
                sql="select * from producto where descripcion LIKE ?";
                d=d+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, d);break;
            case 4:
                sql="select * from producto where idProducto LIKE ? AND nombreProducto LIKE ?";
                id=id+"%";
                n=n+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, n);break;
            case 5:
                sql="select * from producto where idProducto LIKE ? AND descripcion LIKE ?";
                id=id+"%";
                d=d+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, d);break;
            case 6:
                sql="select * from producto where nombreProducto LIKE ? AND descripcion LIKE ?";
                n=n+"%";
                d=d+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, n);
                ps.setString(2, d);break;
            case 7:
                sql="select * from producto where idProducto LIKE ? AND nombreProducto LIKE ? AND descripcion LIKE ?";
                id=id+"%";
                n=n+"%";
                d=d+"%";
                ps=cx.prepareStatement(sql);
                ps.setString(1, id);
                ps.setString(2, n);
                ps.setString(3, d);break;
        }
        
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
               Producto prod=new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                listaProducto.add(prod);
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla producto "+ex.getMessage());
        }
        return listaProducto;
    }
}
