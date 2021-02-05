package Paneles;

import Atxy2k.CustomTextField.RestrictedTextField;
import Gestor.gestor;
import static java.lang.System.exit;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import newpackage.Paciente;

/**
 *
 * @author Jorge Cardenas
 */
public class GUI_registrarPersona extends javax.swing.JFrame {

    gestor g = new gestor();

    public GUI_registrarPersona(gestor g) {
        this.g = g;
        initComponents();

    }

    public void ValidarIngreso(JTextField jtxt, int num, boolean estado) {
        RestrictedTextField restricted = new RestrictedTextField(jtxt);
        restricted.setLimit(num);
        if (estado) {
            //Numeros true
            restricted.setOnlyNums(true);
        } else {
            //Letras false
            restricted.setOnlyText(true);
            restricted.setAcceptSpace(true);
        }
    }

    /*
    public void combo_tipoDocumento(){
        ArrayList<Tipo_Documento> lsTipoDocumento = GestorPrincipal.getGestorCliente().devolverTipoDocumentos();
        combo_tipodoc.removeAllItems();
        Tipo_Documento tipdoc;
        combo_tipodoc.addItem("Seleccionar Tipo Documento");
        for (int i = 0; i < lsTipoDocumento.size(); i++) {
            tipdoc = lsTipoDocumento.get(i);
            combo_tipodoc.addItem(tipdoc.getDescripcion_documento());
        }
    }
    
    public void comboCiudad(){
        ArrayList<Ciudad> lsCiudad = GestorPrincipal.getGestorCliente().devolverCiudades();
        ciudad_combo.removeAllItems();
        Ciudad ciudad;
        ciudad_combo.addItem("Seleccionar Ciudad");
        for (int i = 0; i < lsCiudad.size(); i++) {
            ciudad = lsCiudad.get(i);
            ciudad_combo.addItem(ciudad.getNombre_ciudad());
        }
    }

    public void bloquear_cajas(){
       Cdni.setEnabled(false);
       Cdireccion.setEnabled(false);
       apellcliente.setEnabled(false);
       dircliente.setEnabled(false);       
       ciudad_combo.setEnabled(false); 
       regcliente.setEnabled(false);
       telefonoclient.setEnabled(false);
       combo_tipodoc.setEnabled(false);
    }
    
    public void  desbloquear(){
       Cdni.setEnabled(true);
       combo_tipodoc.setEnabled(true);
       Cdireccion.setEnabled(true);
       apellcliente.setEnabled(true);
       dircliente.setEnabled(true);       
       ciudad_combo.setEnabled(true); 
       telefonoclient.setEnabled(true);
       regcliente.setEnabled(true);
       cancelcli.setEnabled(true);
       
    }
     */
    public void limpiar() {
        Cdni.setText("");
        Cdireccion.setText("");
        Cnombre.setText("");
        apellcliente.setText("");
        Cdireccion.setText("");
        Cfecha.setText("");
        //combo_tipodoc.setSelectedItem("Seleccionar Tipo Documento");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regcliente = new javax.swing.JButton();
        cancelcli = new javax.swing.JButton();
        salirclijButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Cdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        combo_tipodoc = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cdireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        apellcliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cfecha = new javax.swing.JTextField();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regcliente.setText("Registrar");
        regcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclienteActionPerformed(evt);
            }
        });
        getContentPane().add(regcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 358, 92, -1));

        cancelcli.setText("Cancelar");
        cancelcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelcliActionPerformed(evt);
            }
        });
        getContentPane().add(cancelcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 358, -1, -1));

        salirclijButton3.setText("Salir");
        salirclijButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirclijButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(salirclijButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 368, 0, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("REGISTRAR PERSONAS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, 500, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdniActionPerformed(evt);
            }
        });
        jPanel1.add(Cdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, 142, -1));

        jLabel1.setText("Documento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 79, -1, -1));

        combo_tipodoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "CE" }));
        combo_tipodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipodocActionPerformed(evt);
            }
        });
        jPanel1.add(combo_tipodoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 48, 142, -1));

        jLabel4.setText("Tipo de documento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, 109, -1));

        jLabel2.setText("Dirección");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        Cdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CdireccionActionPerformed(evt);
            }
        });
        jPanel1.add(Cdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 250, -1));

        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 79, -1, -1));

        apellcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellclienteActionPerformed(evt);
            }
        });
        jPanel1.add(apellcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 99, 256, -1));

        jLabel5.setText("Nombres");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 28, -1, -1));

        Cnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnombreActionPerformed(evt);
            }
        });
        jPanel1.add(Cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 256, -1));

        jLabel6.setText("Fecha de nacimiento");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        Cfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CfechaActionPerformed(evt);
            }
        });
        jPanel1.add(Cfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 500, 310));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 358, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdniActionPerformed
        Cdni.transferFocus();
    }//GEN-LAST:event_CdniActionPerformed

    private void combo_tipodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipodocActionPerformed
        /*if(!combo_tipodoc.getSelectedItem().equals("Seleccionar Tipo Documento")){
            desbloquear();
        }*/
    }//GEN-LAST:event_combo_tipodocActionPerformed

    private void CdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CdireccionActionPerformed
        Cdireccion.transferFocus();
    }//GEN-LAST:event_CdireccionActionPerformed

    private void apellclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellclienteActionPerformed
        apellcliente.transferFocus();
    }//GEN-LAST:event_apellclienteActionPerformed

    private void regclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclienteActionPerformed
        if (Cnombre.getText() != null && apellcliente.getText() != null && Cdni.getText() != null && Cdireccion.getText() != null && Cfecha.getText() != null) {
            String nombres = Cnombre.getText();
            String apellido = apellcliente.getText();
            int dni = Integer.parseInt(Cdni.getText());
            String direccion = Cdireccion.getText();
            String fecha = Cfecha.getText();
            Paciente pas= new Paciente();
            pas.setDNI(dni);
            Paciente p = new Paciente();
            p.setApellidos(apellido);
            p.setNombres(nombres);
            p.setDNI(dni);
            p.setDireccion(direccion);
            p.setFechaNac(fecha);
            if (g.listaPacientes.existe(pas)) {
                JOptionPane.showMessageDialog(null, "No se guardo informacion. La persona ya está registrada");
            } else {
                g.listaPacientes.adiciona(p);
                JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese correctamente los items", "VALIDACION", JOptionPane.ERROR_MESSAGE);
        }
        limpiar();
    }//GEN-LAST:event_regclienteActionPerformed

    private void cancelcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelcliActionPerformed
        GUI_listaDePacientes l = new GUI_listaDePacientes(g);
        l.setVisible(true);
        this.setVisible(false);
        limpiar();
    }//GEN-LAST:event_cancelcliActionPerformed

    private void salirclijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButton3ActionPerformed
        this.dispose();

    }//GEN-LAST:event_salirclijButton3ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        GUI_Login admi = new GUI_Login();
        admi.setVisible(true);
        dispose();

    }//GEN-LAST:event_salirActionPerformed

    private void CnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnombreActionPerformed

    private void CfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CfechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cdireccion;
    private javax.swing.JTextField Cdni;
    private javax.swing.JTextField Cfecha;
    private javax.swing.JTextField Cnombre;
    private javax.swing.JTextField apellcliente;
    private javax.swing.JButton cancelcli;
    private javax.swing.JComboBox combo_tipodoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regcliente;
    private javax.swing.JButton salir;
    private javax.swing.JButton salirclijButton3;
    // End of variables declaration//GEN-END:variables
}
