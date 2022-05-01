package GUI;

import static PIA.TuringMachine.*;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
        ImageIcon imagenUANL= new ImageIcon("UANL.png");
        UANLlabel.setIcon(new ImageIcon(imagenUANL.getImage().getScaledInstance(UANLlabel.getWidth(), UANLlabel.getHeight(), Image.SCALE_SMOOTH)));
        ImageIcon imagenFCFM= new ImageIcon("FCFM.png");
        FCFMlabel.setIcon(new ImageIcon(imagenFCFM.getImage().getScaledInstance(FCFMlabel.getWidth(), FCFMlabel.getHeight(), Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UANLlabel1 = new javax.swing.JLabel();
        IngresoCadenaTextField = new javax.swing.JTextField();
        ComprobarButton = new javax.swing.JButton();
        UANLlabel = new javax.swing.JLabel();
        FCFMlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        UANLlabel1.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\OneDrive - Universidad Autonoma de Nuevo León\\Teoría de Autómatas - Prof. Yazmany Jahaziel Guerrero Ceja\\TA-032-PIA-E1\\UANL.png")); // NOI18N
        UANLlabel1.setMaximumSize(new java.awt.Dimension(60, 60));
        UANLlabel1.setMinimumSize(new java.awt.Dimension(60, 60));
        UANLlabel1.setName(""); // NOI18N
        UANLlabel1.setPreferredSize(new java.awt.Dimension(60, 60));
        UANLlabel1.setRequestFocusEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TA 032 PIA E1");

        IngresoCadenaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoCadenaTextFieldActionPerformed(evt);
            }
        });

        ComprobarButton.setText("Comprobar");
        ComprobarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarButtonActionPerformed(evt);
            }
        });

        UANLlabel.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\OneDrive - Universidad Autonoma de Nuevo León\\Teoría de Autómatas - Prof. Yazmany Jahaziel Guerrero Ceja\\TA-032-PIA-E1\\UANL.png")); // NOI18N
        UANLlabel.setMaximumSize(new java.awt.Dimension(60, 60));
        UANLlabel.setMinimumSize(new java.awt.Dimension(60, 60));
        UANLlabel.setName(""); // NOI18N
        UANLlabel.setPreferredSize(new java.awt.Dimension(60, 60));
        UANLlabel.setRequestFocusEnabled(false);

        FCFMlabel.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\OneDrive - Universidad Autonoma de Nuevo León\\Teoría de Autómatas - Prof. Yazmany Jahaziel Guerrero Ceja\\TA-032-PIA-E1\\FCFM.png")); // NOI18N
        FCFMlabel.setMaximumSize(new java.awt.Dimension(60, 60));
        FCFMlabel.setMinimumSize(new java.awt.Dimension(60, 60));
        FCFMlabel.setName(""); // NOI18N
        FCFMlabel.setPreferredSize(new java.awt.Dimension(60, 60));
        FCFMlabel.setRequestFocusEnabled(false);

        jLabel1.setText("PRODUCTO INTEGRADOR");

        jLabel2.setText("DE APRENDIZAJE");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setText("L={ a²ⁿbbb | n≥1 }");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UANLlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(FCFMlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IngresoCadenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(ComprobarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UANLlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FCFMlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(IngresoCadenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComprobarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoCadenaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoCadenaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoCadenaTextFieldActionPerformed

    private void ComprobarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarButtonActionPerformed
        if(validar(reasignar(IngresoCadenaTextField.getText()))==true)
            JOptionPane.showMessageDialog(null, "Cadena válida.");
        else 
            JOptionPane.showMessageDialog(null, "Cadena inválida.");
    }//GEN-LAST:event_ComprobarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprobarButton;
    private javax.swing.JLabel FCFMlabel;
    private javax.swing.JTextField IngresoCadenaTextField;
    private javax.swing.JLabel UANLlabel;
    private javax.swing.JLabel UANLlabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
