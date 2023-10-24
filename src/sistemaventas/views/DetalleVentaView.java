package sistemaventas.views;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import sistemaventas.accesoDatos.ClienteData;
import sistemaventas.accesoDatos.DetalleVentaData;
import sistemaventas.accesoDatos.ProductoData;
import sistemaventas.entidades.Cliente;
import sistemaventas.entidades.DetalleVenta;
import sistemaventas.entidades.Producto;

public class DetalleVentaView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };

    private void tamañoColumna() {
        TableColumnModel columnModel = jtLista.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(22);
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setPreferredWidth(110);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setPreferredWidth(110);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(50);

    }

    private void armarCabecera() {
        modelo.addColumn("ID N°");
        modelo.addColumn("Fecha de venta");
        modelo.addColumn("Cliente");
        modelo.addColumn("Producto");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Cantidad");
        jtLista.setModel(modelo);
    }

    private void llenarProductos() {

        ProductoData prodData = new ProductoData();
        ArrayList<Producto> listProd = prodData.listarProducto();
        jcbProductos.removeAllItems();
        jcbProductos.addItem(null);

        for (Producto producto : listProd) {

            jcbProductos.addItem(new Producto(producto.getIdProducto(),
                    producto.getNombreProducto(), producto.getDescripcion(),
                    producto.getPrecioActual(), producto.getStock(), producto.isEstado()));
        }
    }

    private void llenarClientes() {

        ClienteData clienteData = new ClienteData();
        ArrayList<Cliente> listClien = clienteData.listarCliente();
        jcbClientes.removeAllItems();
        jcbClientes.addItem(null);

        for (Cliente cliente : listClien) {

            jcbClientes.addItem(new Cliente(cliente.getIdCliente(), cliente.getApellido(),
                    cliente.getNombre(), cliente.getDireccion(), cliente.getTelefono()));
        }
    }

    private void setearIcono(JLabel jLabelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        jLabelName.setIcon(icon);
        this.repaint();
    }

    public DetalleVentaView() {
        initComponents();
        armarCabecera();
        tamañoColumna();
        setearIcono(jIcono, "src/Imagenes/logo fravemax azul.png");
        llenarClientes();
        llenarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpCuerpo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jIcono = new javax.swing.JLabel();
        jcbProductos = new javax.swing.JComboBox<>();
        jcbClientes = new javax.swing.JComboBox<>();
        jdFecha = new com.toedter.calendar.JDateChooser();
        jlElegirProducto = new javax.swing.JLabel();
        jlElegirFecha = new javax.swing.JLabel();
        jlElegirCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jbLimpiarTodo = new javax.swing.JButton();
        jbLimpiarFecha = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(700, 600));

        jpCuerpo.setBackground(new java.awt.Color(255, 255, 255));
        jpCuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Detalles de ventas");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpCuerpo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 200, 50));

        jpBarraSuperior.setBackground(new java.awt.Color(0, 0, 153));
        jpBarraSuperior.setPreferredSize(new java.awt.Dimension(700, 100));
        jpBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSalir.setBackground(new java.awt.Color(0, 51, 153));

        jlSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlSalir.setForeground(new java.awt.Color(255, 255, 255));
        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setText("x");
        jlSalir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpSalirLayout = new javax.swing.GroupLayout(jpSalir);
        jpSalir.setLayout(jpSalirLayout);
        jpSalirLayout.setHorizontalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpSalirLayout.setVerticalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarraSuperior.add(jpSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jIcono.setToolTipText("");
        jIcono.setMinimumSize(new java.awt.Dimension(100, 100));
        jIcono.setPreferredSize(new java.awt.Dimension(100, 100));
        jpBarraSuperior.add(jIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 110, 100));

        jpCuerpo.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        jcbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductosActionPerformed(evt);
            }
        });
        jpCuerpo.add(jcbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 410, 30));

        jcbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClientesActionPerformed(evt);
            }
        });
        jpCuerpo.add(jcbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 410, 30));

        jdFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdFechaMouseClicked(evt);
            }
        });
        jdFecha.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jdFechaInputMethodTextChanged(evt);
            }
        });
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        jdFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdFechaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jdFechaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaKeyTyped(evt);
            }
        });
        jpCuerpo.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 30));

        jlElegirProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlElegirProducto.setText("Elegir producto:");
        jpCuerpo.add(jlElegirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));

        jlElegirFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlElegirFecha.setText("Elegir fecha:");
        jpCuerpo.add(jlElegirFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jlElegirCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlElegirCliente.setText("Elegir cliente:");
        jpCuerpo.add(jlElegirCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jPanel1.setMaximumSize(null);

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtLista.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtListaPropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jtLista);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );

        jpCuerpo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 695, 260));

        jbLimpiarTodo.setText("Limpiar Campos");
        jbLimpiarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbLimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarTodoActionPerformed(evt);
            }
        });
        jpCuerpo.add(jbLimpiarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 130, 20));

        jbLimpiarFecha.setText("Limpiar Fecha");
        jbLimpiarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarFechaActionPerformed(evt);
            }
        });
        jpCuerpo.add(jbLimpiarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void listarTodo(){
        
        DetalleVentaData dvd = new DetalleVentaData();
        
        for (DetalleVenta detaVenta : dvd.listarDetalleVentas()) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }
    
    public void listarPorClientesYProductos() {

        DetalleVentaData dvd = new DetalleVentaData();

        int idC = jcbClientes.getItemAt(jcbClientes.getSelectedIndex()).getIdCliente();
        int idP = jcbProductos.getItemAt(jcbProductos.getSelectedIndex()).getIdProducto();
        for (DetalleVenta detaVenta : dvd.listarDetaVentasPorClienteYProducto(idC, idP)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }

    public void listarPorProductos() {

        DetalleVentaData dvd = new DetalleVentaData();

        int id = jcbProductos.getItemAt(jcbProductos.getSelectedIndex()).getIdProducto();
        for (DetalleVenta detaVenta : dvd.listarDetalleVentasPorProducto(id)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }

    public void listarPorClientes() {

        DetalleVentaData dvd = new DetalleVentaData();

        int id = jcbClientes.getItemAt(jcbClientes.getSelectedIndex()).getIdCliente();
        for (DetalleVenta detaVenta : dvd.listarDetalleVentaPorIdCliente(id)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }

    public void listarPorFecha() {

        DetalleVentaData dvd = new DetalleVentaData();

        LocalDate fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        for (DetalleVenta detaVenta : dvd.listarDetalleVentaPorFecha(fecha)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }

    public void listarPorClienteProductoYFecha() {

        DetalleVentaData dvd = new DetalleVentaData();

        int idC = jcbClientes.getItemAt(jcbClientes.getSelectedIndex()).getIdCliente();
        int idP = jcbProductos.getItemAt(jcbProductos.getSelectedIndex()).getIdProducto();
        LocalDate fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        for (DetalleVenta detaVenta : dvd.listarDetalleVentaPorClienteProductoYFecha(idC, idP, fecha)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }

    public void listarPorClienteYFecha() {

        DetalleVentaData dvd = new DetalleVentaData();

        int idC = jcbClientes.getItemAt(jcbClientes.getSelectedIndex()).getIdCliente();
        LocalDate fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        for (DetalleVenta detaVenta : dvd.listarDetalleVentaPorClienteYFecha(idC, fecha)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }

    public void listarPorProductoYFecha() {

        DetalleVentaData dvd = new DetalleVentaData();

        int idP = jcbProductos.getItemAt(jcbProductos.getSelectedIndex()).getIdProducto();
        LocalDate fecha = jdFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        for (DetalleVenta detaVenta : dvd.listarDetalleVentaPorProductoYFecha(idP, fecha)) {

            modelo.addRow(new Object[]{
                detaVenta.getIdDetalleVenta(),
                detaVenta.getVenta().getFechaVenta(),
                detaVenta.getVenta().getCliente().getApellido() + ", " + detaVenta.getVenta().getCliente().getNombre(),
                detaVenta.getProducto().getNombreProducto(),
                detaVenta.getProducto().getDescripcion(),
                "$" + detaVenta.getPrecioVenta(),
                detaVenta.getCantidad()
            });
        }
    }
    
    public void borrarFilas(){
        
        for (int fila = jtLista.getRowCount() - 1; fila >= 0; fila--) {

            modelo.removeRow(fila);
        }
    }
    
    public void llamarMetodos(){
        
        try {
            if (jdFecha.getDate() != null && jcbClientes.getSelectedItem() == null
                    && jcbProductos.getSelectedItem() == null) {

                borrarFilas();
                listarPorFecha();

            } else if (jdFecha.getDate() == null && jcbClientes.getSelectedItem() == null
                    && jcbProductos.getSelectedItem() != null) {

                borrarFilas();
                listarPorProductos();

            } else if (jdFecha.getDate() == null && jcbClientes.getSelectedItem() != null
                    && jcbProductos.getSelectedItem() != null) {

                borrarFilas();
                listarPorClientesYProductos();

            } else if (jdFecha.getDate() != null && jcbClientes.getSelectedItem() != null
                    && jcbProductos.getSelectedItem() != null) {

                borrarFilas();
                listarPorClienteProductoYFecha();

            } else if (jdFecha.getDate() == null && jcbProductos.getSelectedItem() == null
                    && jcbClientes.getSelectedItem() != null) {

                borrarFilas();
                listarPorClientes();

            } else if (jdFecha.getDate() != null && jcbProductos.getSelectedItem() != null
                    && jcbClientes.getSelectedItem() == null) {

                borrarFilas();
                listarPorProductoYFecha();

            } else if (jdFecha.getDate() != null && jcbProductos.getSelectedItem() == null
                    && jcbClientes.getSelectedItem() != null) {

                borrarFilas();
                listarPorClienteYFecha();
                
            }else if (jdFecha.getDate() == null && jcbClientes.getSelectedItem() == null
                    && jcbProductos.getSelectedItem() == null) {

                borrarFilas();
                listarTodo();
                
            }

        } catch (NullPointerException ex) {

            JOptionPane.showMessageDialog(this, "Error " + ex);
        }
    }

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked

        Principal mainFrame = (Principal) SwingUtilities.getWindowAncestor(this);
        if (mainFrame != null) {
            // Llama al método en MainFrame
            mainFrame.mostrarMenu();
        }

        this.dispose();
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jcbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductosActionPerformed

        llamarMetodos();
    }//GEN-LAST:event_jcbProductosActionPerformed

    private void jlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseEntered

        jpSalir.setBackground(new Color(204, 0, 0));
        jlSalir.setForeground(new Color(204, 204, 204));
    }//GEN-LAST:event_jlSalirMouseEntered

    private void jlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseExited

        jpSalir.setBackground(new Color(0, 51, 153));
        jlSalir.setForeground(Color.white);

    }//GEN-LAST:event_jlSalirMouseExited

    private void jcbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClientesActionPerformed

        llamarMetodos();
    }//GEN-LAST:event_jcbClientesActionPerformed

    private void jlSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMousePressed
        jpSalir.setBackground(new Color(255, 51, 51));
        jlSalir.setForeground(Color.black);
    }//GEN-LAST:event_jlSalirMousePressed

    private void jdFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdFechaMouseClicked

    }//GEN-LAST:event_jdFechaMouseClicked

    private void jdFechaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jdFechaInputMethodTextChanged

    }//GEN-LAST:event_jdFechaInputMethodTextChanged

    private void jdFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            borrarFilas();
            llamarMetodos();
        }
    }//GEN-LAST:event_jdFechaKeyPressed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange

        borrarFilas();
        llamarMetodos();
    }//GEN-LAST:event_jdFechaPropertyChange

    private void jdFechaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaKeyReleased
        
    }//GEN-LAST:event_jdFechaKeyReleased

    private void jdFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaKeyTyped
        
    }//GEN-LAST:event_jdFechaKeyTyped

    private void jbLimpiarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarFechaActionPerformed
        
        jdFecha.setDate(null);
        llamarMetodos();
    }//GEN-LAST:event_jbLimpiarFechaActionPerformed

    private void jtListaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtListaPropertyChange
        
    }//GEN-LAST:event_jtListaPropertyChange

    private void jbLimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarTodoActionPerformed
        
        jcbClientes.setSelectedItem(null);
        jcbProductos.setSelectedItem(null);
        jdFecha.setDate(null);
        llamarMetodos();
    }//GEN-LAST:event_jbLimpiarTodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jIcono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbLimpiarFecha;
    private javax.swing.JButton jbLimpiarTodo;
    private javax.swing.JComboBox<Cliente> jcbClientes;
    private javax.swing.JComboBox<Producto> jcbProductos;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlElegirCliente;
    private javax.swing.JLabel jlElegirFecha;
    private javax.swing.JLabel jlElegirProducto;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpCuerpo;
    private javax.swing.JPanel jpSalir;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}
