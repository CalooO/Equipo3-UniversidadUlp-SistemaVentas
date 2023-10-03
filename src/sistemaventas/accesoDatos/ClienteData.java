/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas.accesoDatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistemaventas.entidades.Cliente;

/**
 *
 * @author calo_
 */
public class ClienteData {
    private Connection con=null;

    public ClienteData() {
        con=conexion.getConexion();
    }
    
    public void guardarCliente(Cliente cliente){
        String sql="Insert into cliente (apellido, nombre, domicilio, telefono) "
                + "Values (?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTelefono());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"Cliente guardado.");
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de los clientes "+ex.getMessage());
        }
    }
    
    public void modificarCliente(Cliente cliente){
        String sql="Update cliente set apellido=?, nombre=?, domicilio=?, telefono=? "
                + "where idCliente=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,cliente.getApellido());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTelefono());
            
            int todoCorrecto = ps.executeUpdate();
            if(1==todoCorrecto){
                 JOptionPane.showMessageDialog(null,"Cliente actualizado.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de los clientes "+ex.getMessage());
        }
    }
    
    public void eliminarInfoCliente(Cliente cliente){
        String sql="delete from cliente "
                + "where idCliente=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, cliente.getIdCliente());

            
            int todoCorrecto = ps.executeUpdate();
            if(1==todoCorrecto){
                 JOptionPane.showMessageDialog(null,"El cliente fue eliminado exitosamente.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de los clientes "+ex.getMessage());
        }
    }
        
    public ArrayList<Cliente> listarCliente (){
        String sql="select * from cliente ";
        ArrayList<Cliente> listaCliente = new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                
                listaCliente.add(cliente);
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de clientes "+ex.getMessage());
        }
        return listaCliente;
    }
    
    public Cliente buscarClientePorId(int id){
        String sql="select idCliente, apellido, nombre, domicilio, telefono from cliente where idCliente=?";
        Cliente cliente = null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                cliente=new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe un cliente con ese id ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de clientes "+ex.getMessage());
        } catch(NullPointerException e){
        }
        return cliente;
    }
    
    public ArrayList<Cliente> clientesCompraron (){
        String sql="select * from cliente join detalleventa on idProducto = idProducto  "
                + "where idProducto=?";
        ArrayList<Cliente> listaClientes=new ArrayList<>();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
           while(rs.next()){
                Cliente cliente=new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDireccion("domicilio");
                cliente.setTelefono("telefono");
                listaClientes.add(cliente);
           }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla de clientes "+ex.getMessage());
        }
        return listaClientes;
    }
      
    
}
