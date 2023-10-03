

package sistemaventas.accesoDatos;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaventas.entidades.*;

/**
 *
 * @sergiokaz
 */
public class ventaData {
    private Connection con = null;
    private ClienteData clienteData=new ClienteData();

    public ventaData() {
        con = conexion.getConexion();
    }
    
    public void guardarVenta(Venta venta){
        String sql = "Insert into venta ( idCliente, fechaVenta) Values (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Inscripcion guardada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta " + ex.getMessage());
        }
    }
    
    public Venta obtenerVenta (int idVenta){
        String sql = "Select idCliente, fechaVenta from venta where idVenta=?";
        Venta venta = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idVenta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                for (Cliente cliente : clienteData.listarCliente()) {
                    if (rs.getInt("idCliente") == cliente.getIdCliente()) {
                        venta.setCliente(cliente);
                    }
                }

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de venta " + ex.getMessage());
        }
        return venta;
    }
    
    public ArrayList<Venta> listarVentas (){
        String sql = "Select idVenta, idCliente, fechaVenta from venta";
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                for (Cliente cliente : clienteData.listarCliente()) {
                    if (rs.getInt("idCliente") == cliente.getIdCliente()) {
                        venta.setCliente(cliente);
                    }
                }

                listaVentas.add(venta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de venta " + ex.getMessage());
        }
        return listaVentas;
    }
    
    public ArrayList<Venta> listarVentasCliente (int idCliente){
        String sql = "Select idVenta, fechaVenta from venta where idCliente=?";
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                for (Cliente cliente : clienteData.listarCliente()) {
                    if (rs.getInt("idCliente") == cliente.getIdCliente()) {
                        venta.setCliente(cliente);
                    }
                }

                listaVentas.add(venta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de venta " + ex.getMessage());
        }
        return listaVentas;
    }
    
    public ArrayList<Venta> listarVentasClientePorFecha (int idCliente, LocalDate fechaVenta){
        String sql = "Select idVenta from venta where idCliente=? and fechaVenta=?";
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.setDate(2, Date.valueOf(fechaVenta));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                for (Cliente cliente : clienteData.listarCliente()) {
                    if (rs.getInt("idCliente") == cliente.getIdCliente()) {
                        venta.setCliente(cliente);
                    }
                }

                listaVentas.add(venta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de venta " + ex.getMessage());
        }
        return listaVentas;
    }
    
    public ArrayList<Venta> listarVentasPorFecha ( LocalDate fechaVenta){
        String sql = "Select idVenta, idCliente from venta where fechaVenta=?";
        ArrayList<Venta> listaVentas = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaVenta));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setIdVenta(rs.getInt("idVenta"));
                venta.setFechaVenta(rs.getDate("fechaVenta").toLocalDate());
                for (Cliente cliente : clienteData.listarCliente()) {
                    if (rs.getInt("idCliente") == cliente.getIdCliente()) {
                        venta.setCliente(cliente);
                    }
                }

                listaVentas.add(venta);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de venta " + ex.getMessage());
        }
        return listaVentas;
    }
    
     public void modificarVenta(Venta venta){
        String sql="Update venta set idCliente=?, fechaVenta=? where idVenta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,venta.getCliente().getIdCliente());
            ps.setDate(2, Date.valueOf(venta.getFechaVenta()));
           
            int exito=ps.executeUpdate();
            if(1==exito){
                
                 JOptionPane.showMessageDialog(null,"Venta modificada.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla venta "+ex.getMessage());
        }
        
    }
}
