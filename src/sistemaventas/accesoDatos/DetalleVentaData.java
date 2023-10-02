
package sistemaventas.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import sistemaventas.entidades.DetalleVenta;
import sistemaventas.entidades.Producto;
import sistemaventas.entidades.Venta;

public class DetalleVentaData {
    
    private Connection con = null;
    private Venta venta = new Venta();
    private Producto producto = new Producto();
    
    public List<DetalleVenta> detalleDeVentas(){
        
        String sql = "select idDetalleVenta, cantidad, idVenta, precioVenta, idProducto from detalleventa";
        
        ArrayList<DetalleVenta> listaDetalleVenta = new ArrayList<>();
        
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                DetalleVenta detalleVenta = new DetalleVenta();
                
                detalleVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detalleVenta.setCantidad(rs.getInt("cantidad"));
                detalleVenta.setPrecioVenta(rs.getDouble("precioVenta"));
            }
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de detalles de venta " + ex.getMessage());
        }
        
        return listaDetalleVenta;
    }
}
