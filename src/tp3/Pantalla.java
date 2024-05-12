/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp3;

import java.awt.Color;

/**
 *
 * @author nicoe
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        setSize(1010,600);
        setResizable(false);
        setLocationRelativeTo(null);
        this.repaint(); 
        GestorProduccion gestor = new GestorProduccion(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        veces = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_gen_sim = new javax.swing.JButton();
        lote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        promedio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mejorLote = new javax.swing.JTextField();
        lote1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(152, 202, 203));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        veces.setToolTipText("");
        veces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vecesActionPerformed(evt);
            }
        });
        getContentPane().add(veces, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 140, -1));

        jLabel2.setText("Nro de simulaciones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        btn_gen_sim.setText("Generar simulación");
        btn_gen_sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gen_simActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gen_sim, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 180, 50));

        lote.setToolTipText("");
        lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loteActionPerformed(evt);
            }
        });
        getContentPane().add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 140, -1));

        jLabel4.setText("Tamaño del lote:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jPanel3.setBackground(new java.awt.Color(152, 202, 203));
        jPanel3.setMinimumSize(new java.awt.Dimension(1300, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("FUNDICIÓN Y FRESADO DE PIEZAS");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N"
            }
        ));
        tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tabla.setMaximumSize(new java.awt.Dimension(800, 400));
        jScrollPane4.setViewportView(tabla);

        jLabel3.setText("Costo Promedio:");

        promedio.setEditable(false);
        promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioActionPerformed(evt);
            }
        });

        jLabel5.setText("Mejor lote: ");

        mejorLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejorLoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mejorLote, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(377, 377, 377))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(168, 168, 168)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(mejorLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lote1.setToolTipText("");
        lote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lote1ActionPerformed(evt);
            }
        });
        getContentPane().add(lote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vecesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vecesActionPerformed

    private void btn_gen_simActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gen_simActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gen_simActionPerformed

    private void loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loteActionPerformed

    private void lote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lote1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lote1ActionPerformed

    private void promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioActionPerformed

    private void mejorLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejorLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mejorLoteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_gen_sim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextField lote;
    public javax.swing.JTextField lote1;
    public javax.swing.JTextField mejorLote;
    public javax.swing.JTextField promedio;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField veces;
    // End of variables declaration//GEN-END:variables
}
