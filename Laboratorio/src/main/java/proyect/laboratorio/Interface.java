package proyect.laboratorio;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Interface extends javax.swing.JFrame {
ArrayList<Tarea>Array=new ArrayList<Tarea>();
DefaultListModel modelo = new DefaultListModel();
    public Interface() {
        initComponents();
        listTarea.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrear = new javax.swing.JButton();
        textDato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTarea = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear.setText("Crear tarea");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 30));
        getContentPane().add(textDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));

        jScrollPane1.setViewportView(listTarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 170, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese una tarea");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sus tareas son");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 130, 20));

        jButton1.setText("Eliminar tarea");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\3cb37bb0-f9c0-41ac-908a-b017a05d2cf1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String nombre = textDato.getText();
        if (!nombre.isEmpty()) {
             Tarea nuevaTarea = new Tarea(nombre);
        Array.add(nuevaTarea);
        modelo.removeAllElements();
        textDato.setText("");
        for (int i = 0; i < Array.size(); i++) {
            modelo.addElement(Array.get(i));
        }
        }
        else{
       JOptionPane.showMessageDialog(null, "Error no le puso nombre ala tarea");
    }//GEN-LAST:event_btnCrearActionPerformed
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int index = listTarea.getSelectedIndex();
           if (index != -1) {
               Array.remove(index);
               modelo.remove(index);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTarea;
    private javax.swing.JTextField textDato;
    // End of variables declaration//GEN-END:variables
}
