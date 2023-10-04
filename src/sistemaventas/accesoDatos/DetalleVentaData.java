
package sistemaventas.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemaventas.entidades.Cliente;
import sistemaventas.entidades.DetalleVenta;
import sistemaventas.entidades.Producto;
import sistemaventas.entidades.Venta;

public class DetalleVentaData {
    
    private Connection con = null;
    private Venta venta = new Venta();
    private Producto producto = new Producto();
    private Cliente cliente = new Cliente();
    private ProductoData prodData = new ProductoData();
    private VentaData ventaData = new VentaData();
    private ClienteData clienteData = new ClienteData();
    
    public List<DetalleVenta> detalleDeVentas(){
        
        String sql = "SELECT idDetalleVenta,idVenta,idProducto, nombreProducto, cantidad, precioVenta, fechaVenta"
                + " FROM producto p join detalleventa d ON(p.idProducto = d.idProducto) "
                + "JOIN venta v ON(d.idVenta = v.idVenta) "
                + "WHERE idDetalleVenta = ?";
        
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
    
    public void guardarDetalleVenta(DetalleVenta detaVenta){
        
        String sql = "INSERT idDetalleVenta, cantidad, idVenta, precioVenta, idProducto VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detaVenta.getIdDetalleVenta());
            ps.setInt(2, detaVenta.getCantidad());
            ps.setInt(3, detaVenta.getVenta().getIdVenta());
            ps.setDouble(4, detaVenta.getPrecioVenta());
            ps.setInt(5, detaVenta.getProducto().getIdProducto());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                
                detaVenta.setIdDetalleVenta(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Detalles de venta guardados");
            }
            
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
