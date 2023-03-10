/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conectar;


/**
 *
 * @author leo_t
 */
public final class editarCliente extends javax.swing.JFrame {
static Conectar con = new Conectar();
    PreparedStatement ps = null;
    ResultSet rs = null;
    DefaultTableModel modelo;
    Home inicio;
    public editarCliente() {
        initComponents();
        this.setTitle("Administrar Cliente");
        this.setLocationRelativeTo(null);
       columnas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setLabelFor(Titulo);
        Titulo.setText("Editar Cliente");
        Titulo.setToolTipText("");
        Titulo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Veterinaria REM", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        tablaDatos2.setAutoCreateRowSorter(true);
        tablaDatos2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tablaDatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombres", "Apellido", "DNI", "Domicilio", "Celular", "Email", "Fecha", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos2.setToolTipText("");
        tablaDatos2.setColumnSelectionAllowed(false);
        jScrollPane1.setViewportView(tablaDatos2);
        if (tablaDatos2.getColumnModel().getColumnCount() > 0) {
            tablaDatos2.getColumnModel().getColumn(0).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(1).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(2).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(3).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(4).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(5).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(6).setResizable(false);
            tablaDatos2.getColumnModel().getColumn(7).setMinWidth(5);
            tablaDatos2.getColumnModel().getColumn(7).setPreferredWidth(5);
            tablaDatos2.getColumnModel().getColumn(7).setMaxWidth(10);
        }

        jPanel1.setOpaque(false);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(153, 153, 153))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDesktopPane1.setLayer(Titulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                    .addComponent(Titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarDatos();      
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         Home.formularioEditaCliente = null; // permite cerrar y volver a iniciar el formularioAgregaCliente
    }//GEN-LAST:event_formWindowClosing

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    eliminarCliente();
        int confirmar =JOptionPane.showConfirmDialog(null,"¿ESTÁ SEGURO DE ELIMINAR UN CLIENTE?","ATENCION",2);
        if (confirmar == 0) {
            JOptionPane.showMessageDialog(null, "ELIMINANDO CLIENTE");
         } 
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new editarCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos2;
    // End of variables declaration//GEN-END:variables
/**
 * Funciones para editar o eliminar los clientes y mostrar las columnas de la base de datos
 */
    public void columnas() {
        try {
            modelo = new DefaultTableModel();
            Connection conn = con.getConexion();
            tablaDatos2.setModel(modelo);
            String Sql = "SELECT id,nombres,apellido,dni,domicilio,celular,email,fecha FROM personas ";
            //System.out.println(Sql); LINEA PARA DEBUGGEAR
            ps = conn.prepareStatement(Sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantColumnas = rsMd.getColumnCount();//contar columnas y agregarlas a una variable entera 
            modelo.addColumn("Id");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellido");
            modelo.addColumn("DNI");
            modelo.addColumn("Domicilio");
            modelo.addColumn("Celular");
            modelo.addColumn("Email");
            modelo.addColumn("Fecha de alta");
            /**
             * setear anchos de columnas con codigo
             */
            int[] anchos = {7,80, 80, 45, 80, 40, 70, 30};
            for (int i = 0; i < cantColumnas; i++) {
                tablaDatos2.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantColumnas];
                for (int i = 0; i < cantColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    public void actualizarDatos() {
        try {
            int fila;
            fila = tablaDatos2.getSelectedRow();
            if (fila <= -1) {
                JOptionPane.showMessageDialog(null, "Seleccione el registro a modificar, antes de presionar el botón");
            }
            int id = Integer.parseInt(this.tablaDatos2.getValueAt(fila, 0).toString());
            String nombre = tablaDatos2.getValueAt(fila, 1).toString();
            String apellido = tablaDatos2.getValueAt(fila, 2).toString();
            String DNI = tablaDatos2.getValueAt(fila, 3).toString();
            String domicilio = tablaDatos2.getValueAt(fila, 4).toString();
            String celular = tablaDatos2.getValueAt(fila, 5).toString();
            String Email = tablaDatos2.getValueAt(fila, 6).toString();
            String modificado = tablaDatos2.getValueAt(fila, 7).toString();
            try {
                Connection conn = con.getConexion();
                String sql = "UPDATE `personas` SET nombres ='" + nombre + "', apellido ='" + apellido + "',DNI='" + DNI + "', domicilio ='" + domicilio + "', celular ='" + celular + "', email ='" + Email + "', fecha='" + modificado + "' WHERE id='" + id + "'";
                PreparedStatement actualizar = conn.prepareStatement(sql);
                actualizar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente Actualizado!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Hubo un error al actualizar: " + e);
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Error: " + e);
        }
    }
    public void eliminarCliente() {
        try {
            int fila;
            fila = tablaDatos2.getSelectedRow();
            if (fila <= -1) {
                JOptionPane.showMessageDialog(null, "Seleccione el registro a eliminar, antes de presionar el botón");
            }
            String id = tablaDatos2.getValueAt(fila, 0).toString();
            try {
                Connection conn = con.getConexion();
                String sql = "DELETE FROM personas WHERE id='" + id + "'";
                PreparedStatement actualizar = conn.prepareStatement(sql);
                actualizar.executeUpdate();
            } catch (SQLException e) {
                System.out.println("No se pudo elimar el cliente, error: " + e);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }
    }
}
