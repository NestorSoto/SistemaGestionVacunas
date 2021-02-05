package Paneles;

import Gestor.gestor;
import estructura_Doble.Nodo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import newpackage.Paciente;
import newpackage.nodo;

/**
 *
 * @author Jorge Cardenas
 */
public class GUI_listaDePacientes extends javax.swing.JFrame {

    /**
     * Creates new form GUI_BuscarProveedores
     */
    gestor g = new gestor();
    Nodo aux;

    public GUI_listaDePacientes(gestor g) {
        this.g = g;
        aux = new Nodo();
        initComponents();
        this.setLocationRelativeTo(null);

        mostrarProveedores();
    }

    public void mostrarProveedores() {
        /*
        ArrayList<Proveedor> lsProveedor = GestorPrincipal.getGestorProveedor().mostrarProveedoresMejorado();
        Proveedor proveedor;
         */
        if (g.listaPacientes.getSize() > 0) {
            int i = 0;
            nodo n;
            n = g.listaPacientes.getCab();

            while (n != null) {

                Paciente proveedor = new Paciente();
                proveedor = n.getValor();
                //String nom_ciudad = GestorPrincipal.getGestorProveedor().getNombreCiudad(proveedor.getCodigo_ciudad());
                //jTable1.getModel().setValueAt(proveedor.getCodigo_proveedor(), i, 0);
                jTable1.getModel().setValueAt(proveedor.getDNI(), i, 0);
                jTable1.getModel().setValueAt(proveedor.getNombres(), i, 1);
                jTable1.getModel().setValueAt(proveedor.getApellidos(), i, 2);
                jTable1.getModel().setValueAt(proveedor.getFechaNac(), i, 3);
                jTable1.getModel().setValueAt(proveedor.getDireccion(), i, 4);
                //jTable1.getModel().setValueAt(nom_ciudad, i, 6);
                //jTable1.getModel().setValueAt(proveedor.getTelefono(), i, 7);

                n = n.getSiguiente();
                i++;
            }
        } else {
            JOptionPane.showMessageDialog(this, "No existe algun proveedor.", "MOSTRAR PROVEEDORES", JOptionPane.ERROR_MESSAGE);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dniBorrar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de personas sin vacunas");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 673, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "Apellidos", "Fecha Nacimiento", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 673, 251));

        jButton1.setText("Añadir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 73, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Dni:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        dniBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(dniBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 130, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 310, 60));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Descarte COVID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, 40));

        jButton5.setText("MostrarCitas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        jButton7.setText("vacunados");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 120, 40));

        jButton8.setText("Lista de Personas");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 40));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 120, 40));

        jButton6.setText("Cronograma");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 150, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        //GUI_Auxiliar auxi = new GUI_Auxiliar();
        //auxi.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        GUI_registrarPersona r = new GUI_registrarPersona(g);
        r.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int dniBo = Integer.parseInt(dniBorrar.getText());
        Paciente pa= new Paciente();
        pa.setDNI(dniBo);
        g.listaPacientes.adiciona(pa);
        dniBorrar.setText("");
        mostrarProveedores();

        JOptionPane.showMessageDialog(null, "La Persona se ha registrado con exito!", "OPERACIÓN FINALIZADA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dniBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniBorrarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        GUI_programarCita pc = new GUI_programarCita(g);
        pc.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        GUI_cronograma cr = new GUI_cronograma(g);
        cr.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        GUI_listaDeVacunados vcdos = new GUI_listaDeVacunados(g);
        vcdos.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            GUI_citas colasc = new GUI_citas(g);
            this.setVisible(false);
            colasc.setVisible(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "hay un error al cargar las citas!", "OPERACIÓN INTERRUMPIDA", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dniBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
