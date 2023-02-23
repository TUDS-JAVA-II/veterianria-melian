package Graficas;
import Clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class HomeV2 extends javax.swing.JFrame {
    /**
     * Aca hay que poner todas las varibles globales para poder acceder desde todo el codigo de esta pantalla
     */
    
    Conexion con;
    public HomeV2() {
        initComponents();
        this.setTitle("Veterinaria REM");
        this.setLocationRelativeTo(null);
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/veterinaria.png")); // linea para accerder al recurso 
        this.setIconImage(icono); //linea para setear un icono al programa
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnConectar = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Clientes = new javax.swing.JPanel();
        AgregarCliente = new javax.swing.JButton();
        BuscarCliente = new javax.swing.JButton();
        ActualizarCliente = new javax.swing.JButton();
        EliminarCliente = new javax.swing.JButton();
        Animales = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Veterinaria REM");
        titulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Sistema de gestión", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        titulo.setName("Titulo"); // NOI18N
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 920, 90));

        jDesktopPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1010, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnCerrar.setBorderPainted(false);
        btnCerrar.setMaximumSize(new java.awt.Dimension(20, 20));
        btnCerrar.setOpaque(false);
        btnCerrar.setPreferredSize(new java.awt.Dimension(20, 20));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 104, 30));

        btnConectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/controlar.png"))); // NOI18N
        btnConectar.setText("Conectar");
        btnConectar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnConectar.setBorderPainted(false);
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 107, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpg"))); // NOI18N
        logo.setOpaque(true);
        jDesktopPane1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 449, 420));

        jInternalFrame1.setTitle("Submenu");
        jInternalFrame1.setToolTipText("");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clientes.setPreferredSize(new java.awt.Dimension(129, 121));
        Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar-contacto (1).png"))); // NOI18N
        AgregarCliente.setMaximumSize(null);
        AgregarCliente.setMinimumSize(new java.awt.Dimension(192, 95));
        AgregarCliente.setPreferredSize(null);
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });
        Clientes.add(AgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 199));

        BuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consulta.png"))); // NOI18N
        BuscarCliente.setMaximumSize(null);
        BuscarCliente.setMinimumSize(new java.awt.Dimension(192, 95));
        BuscarCliente.setPreferredSize(null);
        Clientes.add(BuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 200, 200));

        ActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        ActualizarCliente.setMaximumSize(null);
        ActualizarCliente.setMinimumSize(new java.awt.Dimension(192, 95));
        ActualizarCliente.setPreferredSize(null);
        Clientes.add(ActualizarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 180));

        EliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar-usuario.png"))); // NOI18N
        EliminarCliente.setMaximumSize(null);
        EliminarCliente.setMinimumSize(new java.awt.Dimension(192, 95));
        EliminarCliente.setPreferredSize(null);
        EliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarClienteActionPerformed(evt);
            }
        });
        Clientes.add(EliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 200, 180));

        jTabbedPane1.addTab("Clientes", Clientes);

        Animales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        Animales.setPreferredSize(new java.awt.Dimension(129, 121));

        javax.swing.GroupLayout AnimalesLayout = new javax.swing.GroupLayout(Animales);
        Animales.setLayout(AnimalesLayout);
        AnimalesLayout.setHorizontalGroup(
            AnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );
        AnimalesLayout.setVerticalGroup(
            AnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Animales", Animales);

        jInternalFrame1.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 420, 410));

        jDesktopPane1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 450, -1));

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 995, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // boton de conexion a base de datos (IMPORTANTE: tener la conexion abierta)
        /**
        * Agregue una pequeña validacion para acceder a los datos.
        * porque de esa manera sabemos si pudimos conectar con la base de datos, sino solo les va a mostrar por consola
        * si me dan unos dias mas, veo como es para inicializar el programa con todos los datos ya cargados, sin tener que usar este boton.
        */
        boolean flag = false;
        if (flag == false) {
            con = new Conexion();
            con.getConexion();
            JOptionPane.showMessageDialog(null, "Accediendo a la Base de Datos");
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo acceder");
        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //boton para finalizar la ejecucion del programa
        /**
        * Agregue una validacion para que se abra un cuadro de confirmacion para salir del programa
        */
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea finalizar el programa?", "Saliendo del sistema", 2);
        if (confirmar == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
        
    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void EliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarClienteActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */ 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { // aca cambien la palabra "NIMBUS" y van a cambiar de "tema" se ve de otra manera, se los dejo de tarea
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(() -> {
            new HomeV2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarCliente;
    private javax.swing.JButton AgregarCliente;
    private javax.swing.JPanel Animales;
    private javax.swing.JButton BuscarCliente;
    private javax.swing.JPanel Clientes;
    private javax.swing.JButton EliminarCliente;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
