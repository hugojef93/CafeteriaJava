/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;


import java.awt.FlowLayout;
import java.sql.*;
import java.text.DecimalFormat;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/**
 *
 * @author Hugo J Esparza F
 */
public class Productos extends javax.swing.JPanel {
    Bebidas bebidas_panel = new Bebidas();
    Comidas comidas_panel = new Comidas();
    Postres postres_panel = new Postres();
    
    static DefaultTableModel model;
    static float total_ticket;
    static float total_seleccionado;
    static String ultimo_ticket;
    static float total_mesa;
    static DecimalFormat formatofloat = new DecimalFormat("#.00");
    
    
    public Productos() {
        initComponents();
        contenedor_productos_panel.add(bebidas_panel);
        contenedor_productos_panel.add(comidas_panel);
        contenedor_productos_panel.add(postres_panel);
        
        
        model = new DefaultTableModel(
                new Object[][]{
             
                },
                new String[]{
                    "Producto", "Cant.", "Precio U.", "Precio T.", "Pago"
                }
        ) {
            Class[] types = new Class[]{
                Object.class, Integer.class, Float.class, Float.class, Boolean.class
            };
            boolean[] canEdit = new boolean[]{
                false,false,false,false,true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        cuenta_mesajtable.setColumnSelectionAllowed(false);
        cuenta_mesajtable.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_productos_panel = new javax.swing.JPanel();
        bebidas_boton = new javax.swing.JButton();
        comidas_boton = new javax.swing.JButton();
        postres_boton = new javax.swing.JButton();
        facturado_panel = new javax.swing.JPanel();
        facturado_scrollpanel = new javax.swing.JScrollPane();
        cuenta_mesajtable = new javax.swing.JTable();
        total_label = new javax.swing.JLabel();
        total_textfield = new javax.swing.JTextField();
        generarticket_buttonm = new javax.swing.JButton();
        controlcantidad_label = new javax.swing.JLabel();
        sumar_button = new javax.swing.JButton();
        restar_button = new javax.swing.JButton();
        quitarselec_label = new javax.swing.JLabel();
        selectodo_label = new javax.swing.JLabel();
        check_button = new javax.swing.JButton();
        quitarselect_button = new javax.swing.JButton();
        selectodo_label1 = new javax.swing.JLabel();
        quitarselect_button1 = new javax.swing.JButton();
        cerrar_mesa_button = new javax.swing.JButton();

        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1440, 620));

        contenedor_productos_panel.setBackground(new java.awt.Color(255, 255, 255));
        contenedor_productos_panel.setPreferredSize(new java.awt.Dimension(630, 460));
        contenedor_productos_panel.setLayout(new java.awt.CardLayout());

        bebidas_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/bebidas_boton.png"))); // NOI18N
        bebidas_boton.setBorder(null);
        bebidas_boton.setContentAreaFilled(false);
        bebidas_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bebidas_botonActionPerformed(evt);
            }
        });

        comidas_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/comidas_boton.png"))); // NOI18N
        comidas_boton.setBorder(null);
        comidas_boton.setContentAreaFilled(false);
        comidas_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comidas_botonActionPerformed(evt);
            }
        });

        postres_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/postres_boton.png"))); // NOI18N
        postres_boton.setBorder(null);
        postres_boton.setContentAreaFilled(false);
        postres_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postres_botonActionPerformed(evt);
            }
        });

        facturado_panel.setBackground(new java.awt.Color(255, 255, 255));
        facturado_panel.setForeground(new java.awt.Color(0, 0, 0));
        facturado_panel.setPreferredSize(new java.awt.Dimension(710, 560));

        facturado_scrollpanel.setBackground(new java.awt.Color(255, 255, 255));
        facturado_scrollpanel.setForeground(new java.awt.Color(255, 255, 255));
        facturado_scrollpanel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        facturado_scrollpanel.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        facturado_scrollpanel.setPreferredSize(new java.awt.Dimension(710, 560));

        cuenta_mesajtable.setBackground(new java.awt.Color(255, 255, 255));
        cuenta_mesajtable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cuenta_mesajtable.setForeground(new java.awt.Color(93, 125, 144));
        cuenta_mesajtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,  new Boolean(true)}
            },
            new String [] {
                "Producto", "Cant.", "Precio U.", "Precio T.", "Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cuenta_mesajtable.setGridColor(new java.awt.Color(93, 125, 144));
        cuenta_mesajtable.setSelectionBackground(new java.awt.Color(93, 125, 144));
        facturado_scrollpanel.setViewportView(cuenta_mesajtable);
        cuenta_mesajtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (cuenta_mesajtable.getColumnModel().getColumnCount() > 0) {
            cuenta_mesajtable.getColumnModel().getColumn(0).setResizable(false);
            cuenta_mesajtable.getColumnModel().getColumn(0).setPreferredWidth(300);
            cuenta_mesajtable.getColumnModel().getColumn(1).setResizable(false);
            cuenta_mesajtable.getColumnModel().getColumn(1).setPreferredWidth(60);
            cuenta_mesajtable.getColumnModel().getColumn(2).setResizable(false);
            cuenta_mesajtable.getColumnModel().getColumn(2).setPreferredWidth(100);
            cuenta_mesajtable.getColumnModel().getColumn(3).setResizable(false);
            cuenta_mesajtable.getColumnModel().getColumn(3).setPreferredWidth(100);
            cuenta_mesajtable.getColumnModel().getColumn(4).setResizable(false);
            cuenta_mesajtable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        total_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        total_label.setForeground(new java.awt.Color(0, 0, 0));
        total_label.setText("Total:");

        total_textfield.setBackground(new java.awt.Color(255, 255, 255));
        total_textfield.setForeground(new java.awt.Color(93, 125, 144));
        total_textfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(93, 125, 144), 2));
        total_textfield.setPreferredSize(new java.awt.Dimension(220, 30));
        total_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_textfieldActionPerformed(evt);
            }
        });
        total_textfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_textfieldKeyTyped(evt);
            }
        });

        generarticket_buttonm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/generarticket.png"))); // NOI18N
        generarticket_buttonm.setBorder(null);
        generarticket_buttonm.setContentAreaFilled(false);
        generarticket_buttonm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarticket_buttonmActionPerformed(evt);
            }
        });

        controlcantidad_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        controlcantidad_label.setForeground(new java.awt.Color(0, 0, 0));
        controlcantidad_label.setText("Control de cantidad ");

        sumar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/sumar.png"))); // NOI18N
        sumar_button.setBorder(null);
        sumar_button.setContentAreaFilled(false);
        sumar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumar_buttonActionPerformed(evt);
            }
        });

        restar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/restar.png"))); // NOI18N
        restar_button.setBorder(null);
        restar_button.setContentAreaFilled(false);
        restar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restar_buttonActionPerformed(evt);
            }
        });

        quitarselec_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        quitarselec_label.setForeground(new java.awt.Color(0, 0, 0));
        quitarselec_label.setText("Quitar selecciones");

        selectodo_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        selectodo_label.setForeground(new java.awt.Color(0, 0, 0));
        selectodo_label.setText("Seleccionar todos");

        check_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/check.png"))); // NOI18N
        check_button.setBorder(null);
        check_button.setContentAreaFilled(false);
        check_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_buttonActionPerformed(evt);
            }
        });

        quitarselect_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/x.png"))); // NOI18N
        quitarselect_button.setBorder(null);
        quitarselect_button.setContentAreaFilled(false);
        quitarselect_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarselect_buttonActionPerformed(evt);
            }
        });

        selectodo_label1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        selectodo_label1.setForeground(new java.awt.Color(0, 0, 0));
        selectodo_label1.setText("Borrar selección");

        quitarselect_button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/eliminar.png"))); // NOI18N
        quitarselect_button1.setBorder(null);
        quitarselect_button1.setContentAreaFilled(false);
        quitarselect_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarselect_button1ActionPerformed(evt);
            }
        });

        cerrar_mesa_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/imagenes/cerrar_mesa.png"))); // NOI18N
        cerrar_mesa_button.setBorder(null);
        cerrar_mesa_button.setContentAreaFilled(false);
        cerrar_mesa_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_mesa_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout facturado_panelLayout = new javax.swing.GroupLayout(facturado_panel);
        facturado_panel.setLayout(facturado_panelLayout);
        facturado_panelLayout.setHorizontalGroup(
            facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturado_panelLayout.createSequentialGroup()
                .addComponent(facturado_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturado_panelLayout.createSequentialGroup()
                .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(facturado_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(total_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(facturado_panelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cerrar_mesa_button)
                            .addComponent(generarticket_buttonm))))
                .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturado_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(controlcantidad_label)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturado_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturado_panelLayout.createSequentialGroup()
                                .addComponent(sumar_button)
                                .addGap(18, 18, 18)
                                .addComponent(restar_button)
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturado_panelLayout.createSequentialGroup()
                                .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, facturado_panelLayout.createSequentialGroup()
                                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(selectodo_label)
                                            .addComponent(quitarselec_label)
                                            .addComponent(selectodo_label1))
                                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(facturado_panelLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(quitarselect_button))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, facturado_panelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(check_button))))
                                    .addComponent(quitarselect_button1))
                                .addGap(24, 24, 24))))))
        );
        facturado_panelLayout.setVerticalGroup(
            facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturado_panelLayout.createSequentialGroup()
                .addComponent(facturado_scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(facturado_panelLayout.createSequentialGroup()
                        .addComponent(controlcantidad_label)
                        .addGap(23, 23, 23)
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sumar_button)
                            .addComponent(restar_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quitarselect_button1)
                            .addComponent(selectodo_label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectodo_label)
                            .addComponent(check_button))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quitarselec_label)
                            .addComponent(quitarselect_button)))
                    .addGroup(facturado_panelLayout.createSequentialGroup()
                        .addGroup(facturado_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_label)
                            .addComponent(total_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generarticket_buttonm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cerrar_mesa_button)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedor_productos_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(bebidas_boton)
                        .addGap(18, 18, 18)
                        .addComponent(comidas_boton)
                        .addGap(18, 18, 18)
                        .addComponent(postres_boton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facturado_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(facturado_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contenedor_productos_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bebidas_boton)
                            .addComponent(comidas_boton)
                            .addComponent(postres_boton))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void generarticket_buttonmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarticket_buttonmActionPerformed
        // TODO add your handling code here:

        MainFrame.login_panel.setVisible(false);
        MainFrame.mesas_panel.setVisible(false);
        MainFrame.productos_panel.setVisible(false);
        MainFrame.caja_panel.setVisible(true);
        System.out.println(total_seleccionado);
        System.out.println(total_mesa);

        for (int i = 0; i < cuenta_mesajtable.getRowCount(); i++) {
            int num = 0;
            if (!Objects.isNull(cuenta_mesajtable.getValueAt(i, 4))) {
                if((int)cuenta_mesajtable.getValueAt(i, 1)>1){
                    num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa cuantas "+cuenta_mesajtable.getValueAt(i, 0)+"("+cuenta_mesajtable.getValueAt(i, 1)+") quieres facturar"));
                    while(num>(int)cuenta_mesajtable.getValueAt(i, 1)){
                        num = Integer.parseInt(JOptionPane.showInputDialog(null,"No puedes ingresar mas "+cuenta_mesajtable.getValueAt(i, 0)+"s de las consumidas("+cuenta_mesajtable.getValueAt(i, 1)+") ingresa nuevamente la cantidad"));
                    }
                }else{
                    num=1;
                }
      
                float precio = (Float.valueOf(String.valueOf(cuenta_mesajtable.getValueAt(i, 2))));
                total_seleccionado = total_seleccionado + ((float) num * precio) + ((float) num * precio * 0.10f);
                

                Caja.model_caja.addRow(new Object[]{
                    cuenta_mesajtable.getValueAt(i, 0),
                    num,
                    cuenta_mesajtable.getValueAt(i, 2),
                    (float) num * precio,
                    (float) num * precio * 0.10,
                    ((float) num * precio) + ((float) num * precio * 0.10f)
                    
                });
                
                Caja.model_ticket.addRow(new Object[]{
                    cuenta_mesajtable.getValueAt(i, 0),
                    num,
                    cuenta_mesajtable.getValueAt(i, 2),
                    (float) num * precio,
                    (float) num * precio * 0.10,
                    ((float) num * precio) + ((float) num * precio * 0.10f)
                        
                    
                });
            }
        }
        
        try {
            GenerarTicketBD(total_seleccionado);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
      

        try {
            ResultSet rs = null;
            Statement stmt = MainFrame.con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            String sql = "select * from detalle_ticket ";
            rs = stmt.executeQuery(sql);
            if (rs.last()) {
                ultimo_ticket = rs.getString(1);
                Caja.numerofs_textfield.setText(rs.getString(1));
                Caja.camarero_textfield.setText(Login.camarero_login);
                Caja.num_mesa_textfield.setText(rs.getString(3));
                Caja.fechahora_textfield.setText(rs.getString(4));
                Caja.totalticket_textfield.setText(String.valueOf(total_seleccionado));
                Caja.baseticket_textfield.setText((String.valueOf(total_seleccionado / 1.10) + "€"));
                Caja.ivaticket_textfield.setText((String.valueOf((total_seleccionado / 1.10) * 0.10) + "€"));

            } else {
                System.out.println("Registro no encontrado");
            }
        } catch (SQLException sqe) {
            System.out.println("Error en la consulta " + sqe);
        }
          try {
            GenerarDetalleProductosTicketBD();
        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
        totalMesa();
        total_textfield.setText(total_mesa + "€");
        Caja.total_caja_textfield.setText(String.valueOf(total_seleccionado)+"€");
        Caja.base_textfield.setText((String.valueOf(total_seleccionado/1.10)+"€"));
        Caja.iva_textfield.setText((String.valueOf((total_seleccionado/1.10)*0.10)+"€"));
        
        
        MainFrame.login_panel.setVisible(false);
        MainFrame.mesas_panel.setVisible(false);
        MainFrame.productos_panel.setVisible(false);
        MainFrame.caja_panel.setVisible(true);
        
        System.out.println(total_seleccionado);
        System.out.println(total_mesa);
        
        


    }//GEN-LAST:event_generarticket_buttonmActionPerformed

    private void sumar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumar_buttonActionPerformed
        // TODO add your handling code here:
        cuenta_mesajtable.setValueAt((int) cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 1) + 1, cuenta_mesajtable.getSelectedRow(), 1);
        cuenta_mesajtable.setValueAt((float)cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 3)+(float)cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 2), cuenta_mesajtable.getSelectedRow(), 3);
        totalMesa();
    }//GEN-LAST:event_sumar_buttonActionPerformed

    private void restar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restar_buttonActionPerformed
        // TODO add your handling code here:
        if ((int) cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 1) > 1) {
            cuenta_mesajtable.setValueAt((int) cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 1) - 1, cuenta_mesajtable.getSelectedRow(), 1);
             cuenta_mesajtable.setValueAt((float)cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 3)-(float)cuenta_mesajtable.getValueAt(cuenta_mesajtable.getSelectedRow(), 2), cuenta_mesajtable.getSelectedRow(), 3);
        } else {
            model.removeRow(cuenta_mesajtable.getSelectedRow());
        }
        totalMesa();
       
    }//GEN-LAST:event_restar_buttonActionPerformed

    private void check_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_buttonActionPerformed
        // TODO add your handling code here:
        seleccionarTodosLosProductos();
     
    }//GEN-LAST:event_check_buttonActionPerformed

    private void quitarselect_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarselect_buttonActionPerformed
        // TODO add your handling code here:
        quitarSeleccionProductos();
        
    }//GEN-LAST:event_quitarselect_buttonActionPerformed

    private void total_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_textfieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_total_textfieldActionPerformed

    private void comidas_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comidas_botonActionPerformed
        // TODO add your handling code here:
        
        bebidas_panel.setVisible(false);
        postres_panel.setVisible(false);
        comidas_panel.setVisible(true);

    }//GEN-LAST:event_comidas_botonActionPerformed

    private void bebidas_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bebidas_botonActionPerformed
        // TODO add your handling code here:
        
        comidas_panel.setVisible(false);
        postres_panel.setVisible(false);
        bebidas_panel.setVisible(true);
    }//GEN-LAST:event_bebidas_botonActionPerformed

    private void postres_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postres_botonActionPerformed
        // TODO add your handling code here:
        
      
        bebidas_panel.setVisible(false);
        comidas_panel.setVisible(false);
          postres_panel.setVisible(true);

    }//GEN-LAST:event_postres_botonActionPerformed

    private void quitarselect_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarselect_button1ActionPerformed
        // TODO add your handling code here:
         model.removeRow(cuenta_mesajtable.getSelectedRow());
         totalMesa();
    }//GEN-LAST:event_quitarselect_button1ActionPerformed

    private void total_textfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_textfieldKeyTyped
        // TODO add your handling code here:
        System.out.println(total_textfield.isFocusOwner());
    }//GEN-LAST:event_total_textfieldKeyTyped

    private void cerrar_mesa_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_mesa_buttonActionPerformed
        // TODO add your handling code here:
        MainFrame.login_panel.setVisible(false);
        MainFrame.mesas_panel.setVisible(false);
        MainFrame.productos_panel.setVisible(false);
        MainFrame.caja_panel.setVisible(true);

        for (int i = 0; i < cuenta_mesajtable.getRowCount(); i++) {
            int num = (int)cuenta_mesajtable.getValueAt(i, 1);

            float precio = (Float.valueOf(String.valueOf(cuenta_mesajtable.getValueAt(i, 2))));
            total_seleccionado = total_seleccionado + ((float) num * precio) + ((float) num * precio * 0.10f);

            Caja.model_caja.addRow(new Object[]{
                cuenta_mesajtable.getValueAt(i, 0),
                num,
                cuenta_mesajtable.getValueAt(i, 2),
                (float) num * precio,
                (float) num * precio * 0.10,
                ((float) num * precio) + ((float) num * precio * 0.10f)

            });

            Caja.model_ticket.addRow(new Object[]{
                cuenta_mesajtable.getValueAt(i, 0),
                num,
                cuenta_mesajtable.getValueAt(i, 2),
                (float) num * precio,
                (float) num * precio * 0.10,
                ((float) num * precio) + ((float) num * precio * 0.10f)

            });

        }
        
           
        try {
            GenerarTicketBD(total_seleccionado);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            ResultSet rs = null;
            Statement stmt = MainFrame.con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            String sql = "select * from detalle_ticket ";
            rs = stmt.executeQuery(sql);
            if (rs.last()) {
                ultimo_ticket = rs.getString(1);
                Caja.numerofs_textfield.setText(rs.getString(1));
                Caja.camarero_textfield.setText(Login.camarero_login);
                Caja.num_mesa_textfield.setText(rs.getString(3));
                Caja.fechahora_textfield.setText(rs.getString(4));
                Caja.totalticket_textfield.setText(String.valueOf(total_seleccionado));
                Caja.baseticket_textfield.setText((String.valueOf(total_seleccionado / 1.10) + "€"));
                Caja.ivaticket_textfield.setText((String.valueOf((total_seleccionado / 1.10) * 0.10) + "€"));

            } else {
                System.out.println("Registro no encontrado");
            }
        } catch (SQLException sqe) {
            System.out.println("Error en la consulta " + sqe);
        }
          try {
            GenerarDetalleProductosTicketBD();
        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
        total_textfield.setText(String.valueOf(total_seleccionado) + "€");
        Caja.total_caja_textfield.setText(String.valueOf(total_seleccionado)+"€");
        Caja.base_textfield.setText((String.valueOf(total_seleccionado/1.10)+"€"));
        Caja.iva_textfield.setText((String.valueOf((total_seleccionado/1.10)*0.10)+"€"));
        
        
        MainFrame.login_panel.setVisible(false);
        MainFrame.mesas_panel.setVisible(false);
        MainFrame.productos_panel.setVisible(false);
        MainFrame.caja_panel.setVisible(true);
        
        


    }//GEN-LAST:event_cerrar_mesa_buttonActionPerformed

    static protected void agregarProducto(String nombre) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;

        pst = MainFrame.con.prepareStatement("select * from productos where Nombre_Producto = ?");
        pst.setString(1, nombre);
        rs = pst.executeQuery();
        if (rs.next()) {
            boolean exist=false;
            for (int i = 0; i < cuenta_mesajtable.getRowCount(); i++) {
//                System.out.println(String.valueOf(cuenta_mesajtable.getValueAt(i, 0)));
//                System.out.println(rs.getString(1));

                if ((String.valueOf(cuenta_mesajtable.getValueAt(i, 0)).equals(rs.getString(2)))) {
                    cuenta_mesajtable.setValueAt(1 + (int) cuenta_mesajtable.getValueAt(i, 1), i, 1);
                    cuenta_mesajtable.setValueAt(rs.getFloat(4) + (float) cuenta_mesajtable.getValueAt(i, 3), i, 3);
                    exist = true;
                }

            }
            if (!exist) {
                model.addRow(new Object[]{rs.getString(2), 1, rs.getFloat(4),rs.getFloat(4)});
            }

        } else {
            System.out.println("Registro no encontrado");
        }
        Productos.totalMesa();

    }

    public void GenerarTicketBD(float total_ticket) throws SQLException {
        PreparedStatement pst = null;
        pst = MainFrame.con.prepareStatement("insert into detalle_ticket values(null,?,?,null,?,1)");
        //darle valor a las ?
        pst.setString(1, Login.camarero_id);
        pst.setString(2, Mesas.numero_mesa);
        pst.setString(3, "" + total_ticket + "");
        //ejecutar la sentencia
        pst.executeUpdate();

    }

    public void GenerarDetalleProductosTicketBD() throws SQLException {
        PreparedStatement pst = null;
        pst = MainFrame.con.prepareStatement("insert into detalle_productos_ticket values(?,?,?)");
        for (int i = 0; i < Caja.caja_table.getRowCount(); i++) {
            //darle valor a las ?
            pst.setString(1, Productos.ultimo_ticket);
            pst.setString(2, String.valueOf(Caja.caja_table.getValueAt(i, 0)));
            pst.setString(3, String.valueOf(Caja.caja_table.getValueAt(i, 1)));
            //ejecutar la sentencia
            pst.executeUpdate();
        }


    }
    
    public static void totalMesa(){
        Productos.total_mesa=0;
        for (int i = 0; i < Productos.cuenta_mesajtable.getRowCount(); i++) {
            Productos.total_mesa=Productos.total_mesa+(float)Productos.cuenta_mesajtable.getValueAt(i,3);
            Productos.total_textfield.setText((String.valueOf(total_mesa))+"€");
        }
    }
    
    public static void quitarSeleccionProductos(){
        //Quitar seleccion productos
        for (int i = 0; i < Productos.cuenta_mesajtable.getRowCount(); i++) {
            Productos.model.setValueAt(null, i, 4);
        }

    }
    
    public static void seleccionarTodosLosProductos(){
        //Quitar seleccion productos
        for (int i = 0; i < Productos.cuenta_mesajtable.getRowCount(); i++) {
            Productos.model.setValueAt(true, i, 4);
        }

    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bebidas_boton;
    private javax.swing.JButton cerrar_mesa_button;
    private javax.swing.JButton check_button;
    private javax.swing.JButton comidas_boton;
    private javax.swing.JPanel contenedor_productos_panel;
    private javax.swing.JLabel controlcantidad_label;
    protected static javax.swing.JTable cuenta_mesajtable;
    private javax.swing.JPanel facturado_panel;
    private javax.swing.JScrollPane facturado_scrollpanel;
    private javax.swing.JButton generarticket_buttonm;
    private javax.swing.JButton postres_boton;
    private javax.swing.JLabel quitarselec_label;
    private javax.swing.JButton quitarselect_button;
    private javax.swing.JButton quitarselect_button1;
    private javax.swing.JButton restar_button;
    private javax.swing.JLabel selectodo_label;
    private javax.swing.JLabel selectodo_label1;
    private javax.swing.JButton sumar_button;
    private javax.swing.JLabel total_label;
    protected static javax.swing.JTextField total_textfield;
    // End of variables declaration//GEN-END:variables
}
