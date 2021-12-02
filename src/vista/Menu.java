package vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leoar
 */
import modelo.Productos;
import controlador.Registro;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    public Menu() {
        initComponents();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblListar = new javax.swing.JTable();
        jbtnListar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_añadir = new javax.swing.JMenuItem();
        jmi_salir = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenu();
        jmiCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de opciones");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 204));
        jLabel2.setText("Buscar por código:");
        jLabel2.setName(""); // NOI18N

        jtxtBuscar.setBackground(new java.awt.Color(18, 33, 48));
        jtxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarActionPerformed(evt);
            }
        });

        jbtnBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jbtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnBuscar)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, 50));

        jtblListar.setBackground(new java.awt.Color(18, 38, 51));
        jtblListar.setForeground(new java.awt.Color(255, 255, 255));
        jtblListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Tipo", "fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtblListar);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 420, 220));

        jbtnListar.setText("Listar");
        jbtnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnListarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondofoodaseo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 360));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dieta.png"))); // NOI18N
        jMenu1.setText("Productos");

        jmi_añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        jmi_añadir.setText("añadir");
        jmi_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_añadirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_añadir);

        jmi_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);
        jMenu1.getAccessibleContext().setAccessibleName("añadir");

        jMenuBar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        jMenuBar2.setText("Cerrar Sesión");
        jMenuBar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBar2ActionPerformed(evt);
            }
        });

        jmiCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar-sesion.png"))); // NOI18N
        jmiCerrarSesion.setText("Cerrar Sesión");
        jmiCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCerrarSesionActionPerformed(evt);
            }
        });
        jMenuBar2.add(jmiCerrarSesion);

        jMenuBar1.add(jMenuBar2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_añadirActionPerformed
        new Añadir().setVisible(true);

    }//GEN-LAST:event_jmi_añadirActionPerformed

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jtxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarActionPerformed

    private void jMenuBar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBar2ActionPerformed
        
    }//GEN-LAST:event_jMenuBar2ActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        
        int id_producto, cantidad;
        String nombre, tipo_producto;
        Date add_date;
        
        Registro reg=new Registro();
        DefaultTableModel modelo = (DefaultTableModel) this.jtblListar.getModel();
        
        try {
            id_producto= Integer.parseInt(this.jtxtBuscar.getText());
        } catch (Exception e) {
            id_producto=0;
        }
        modelo.setRowCount(0);
        
        if (id_producto==0) {
            List<Productos> lista = reg.listarProd();
            
            for (Productos prod :lista) {
                id_producto=prod.getId_producto();
                nombre=prod.getNombre();
                cantidad=prod.getCantidad();
                tipo_producto=prod.getTipo_producto();
                add_date=prod.getAdd_date();
                
                modelo.addRow(new Object[]{id_producto, nombre, cantidad, tipo_producto, add_date});
            }
            
        }else{
            Productos prod = reg.buscarPorId(id_producto);
            nombre=prod.getNombre();
            cantidad=prod.getCantidad();
            tipo_producto=prod.getTipo_producto();
            add_date=prod.getAdd_date();
            
            modelo.addRow(new Object[]{id_producto, nombre, cantidad, tipo_producto, add_date});
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jmiCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCerrarSesionActionPerformed
        new IniciarSesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiCerrarSesionActionPerformed

    private void jbtnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnListarActionPerformed
        int id_producto, cantidad;
        String nombre, tipo_producto;
        Date add_date;
        
        Registro reg=new Registro();
        DefaultTableModel modelo = (DefaultTableModel) this.jtblListar.getModel();
        
        modelo.setRowCount(0);
        
        Añadir add=new Añadir();
        List<Productos> lista = reg.listarProd();
            
            for (Productos prod :lista) {
                id_producto=prod.getId_producto();
                nombre=prod.getNombre();
                cantidad=prod.getCantidad();
                tipo_producto=prod.getTipo_producto();
                add_date=prod.getAdd_date();

                modelo.addRow(new Object[]{id_producto, nombre, cantidad, tipo_producto, add_date});
            }
    }//GEN-LAST:event_jbtnListarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new Menu().setVisible(true);
//        });
//    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnListar;
    private javax.swing.JMenuItem jmiCerrarSesion;
    private javax.swing.JMenuItem jmi_añadir;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JTable jtblListar;
    private javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}
