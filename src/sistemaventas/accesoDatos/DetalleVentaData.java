
package sistemaventas.accesoDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sistemaventas.entidades.*;

public class DetalleVentaData {
    
    private Connection con = null;
    private Venta venta = new Venta();
    private Producto producto = new Producto();
    private Cliente cliente = new Cliente();
    private ProductoData prodData = new ProductoData();
    private VentaData ventaData = new VentaData();
    private ClienteData clienteData = new ClienteData();

    public DetalleVentaData() {
         con = conexion.getConexion();
    }
    
    public List<DetalleVenta> listarDetalleVentas(){
        
        String sql = "SELECT idDetalleVenta, cantidad, idVenta, "
                + "precioVenta, idProducto FROM detalleventa";
        
        ArrayList<DetalleVenta> listaDetalleVenta = new ArrayList<>();
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                DetalleVenta detalleVenta = new DetalleVenta();
                
                detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detalleVenta.setCantidad(rs.getInt("cantidad"));
                detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));
                for(Producto producto:prodData.listarProducto()){
                    
                    if(rs.getInt("idProducto") == producto.getIdProducto())
                        detalleVenta.setProducto(producto);
                }
                for(Venta venta:ventaData.listarVentas()){
                    
                    if(rs.getInt("idVenta") == venta.getIdVenta())
                        detalleVenta.setVenta(venta);
                }
                
                listaDetalleVenta.add(detalleVenta);
            }
            ps.close();
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la "
                    + "tabla de detalles de venta " + ex.getMessage());
        }
        
        return listaDetalleVenta;
    }
    //listarDetalleVentaPorIDVenta
    //listarDetalleVentaPorIDVentaPorProducto
    //ventaDatas porCliente/porFecha/porClienteporFecha
    public List<DetalleVenta> listarDetalleVentasPorProducto(int id){
        
        String sql = "SELECT idDetalleVenta, cantidad, idVenta, "
                + "precioVenta, idProducto FROM detalleventa where idProducto = ?";
        
        ArrayList<DetalleVenta> listaDetalleVenta = new ArrayList<>();
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                DetalleVenta detalleVenta = new DetalleVenta();
                
                detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detalleVenta.setCantidad(rs.getInt("cantidad"));
                detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));
                for(Producto producto:prodData.listarProducto()){
                    
                    if(rs.getInt("idProducto") == producto.getIdProducto())
                        detalleVenta.setProducto(producto);
                }
                for(Venta venta:ventaData.listarVentas()){
                    
                    if(rs.getInt("idVenta") == venta.getIdVenta())
                        detalleVenta.setVenta(venta);
                }
                
                listaDetalleVenta.add(detalleVenta);
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la "
                    + "tabla de detalles de venta " + ex.getMessage());
        }
        
        return listaDetalleVenta;
    }
    
    public void guardarDetalleVenta(DetalleVenta detaVenta){
        
        String sql = "INSERT into detalleventa (cantidad, idVenta, precioVenta, idProducto) VALUES (?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, detaVenta.getCantidad());
            ps.setInt(2, detaVenta.getVenta().getIdVenta());
            ps.setDouble(3, detaVenta.getPrecioVenta());
            ps.setInt(4, detaVenta.getProducto().getIdProducto());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                
                detaVenta.setIdDetalleVenta(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Detalles de venta guardados");
            }
            ps.close();
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la "
                    + "tabla de detalles de venta " + ex.getMessage());
        }
    }
    
    public void modificarDetalleVenta(DetalleVenta detaVenta){
            
        String sql = "UPDATE detalleventa SET cantidad = ?, precioVenta = ? WHERE idDetalleVenta = ?";
            
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detaVenta.getCantidad());
            ps.setDouble(2, detaVenta.getPrecioVenta());
            
            int exito=ps.executeUpdate();
            if(1==exito){
                
                 JOptionPane.showMessageDialog(null,"Detalles de venta modificados");
            }
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la "
                    + "tabla de detalles de venta " + ex.getMessage());
        }
    }
}
