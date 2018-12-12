
package Ventana;

import Datos.GrupoPersonas;
import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setTitle("Ingreso Datos");
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    public GrupoPersonas grupo = new GrupoPersonas();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatoNombre = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DatoEdad = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        VerPersonas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DatoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoNombreActionPerformed(evt);
            }
        });
        DatoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoNombreKeyTyped(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        DatoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoEdadActionPerformed(evt);
            }
        });
        DatoEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoEdadKeyTyped(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        VerPersonas.setText("Ver");
        VerPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPersonasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DatoNombre)
                            .addComponent(DatoEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(VerPersonas)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DatoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(VerPersonas))
                .addGap(46, 46, 46)
                .addComponent(Salir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoNombreActionPerformed

        
    }//GEN-LAST:event_DatoNombreActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void DatoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoEdadActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_DatoEdadActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       if ((DatoNombre.getText().isEmpty())){
        JOptionPane.showMessageDialog(this, "No dejar espacios en blanco","ERROR",JOptionPane.ERROR_MESSAGE);
    }
       else if (DatoEdad.getText().isEmpty()){
         JOptionPane.showMessageDialog(this, "No dejar espacios en blanco","ERROR",JOptionPane.ERROR_MESSAGE);  
       }     
       else{   
        String nombre =DatoNombre.getText();
        int edad = Integer.parseInt(DatoEdad.getText());
        grupo.AgregarPersona(nombre,edad);
       }
    }//GEN-LAST:event_AgregarActionPerformed

    private void VerPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPersonasActionPerformed
        grupo.ImprimirDatos();
    }//GEN-LAST:event_VerPersonasActionPerformed

    private void DatoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoNombreKeyTyped
       char validar=evt.getKeyChar();
       if(Character.isDigit(validar)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresar Solo letras");
       }
    }//GEN-LAST:event_DatoNombreKeyTyped

    private void DatoEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoEdadKeyTyped
        char validar=evt.getKeyChar();
       if(Character.isLetter(validar)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(rootPane, "Ingresar Solo Numeros");
       } // TODO add your handling code here:
    }//GEN-LAST:event_DatoEdadKeyTyped

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField DatoEdad;
    private javax.swing.JTextField DatoNombre;
    private javax.swing.JButton Salir;
    private javax.swing.JButton VerPersonas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
