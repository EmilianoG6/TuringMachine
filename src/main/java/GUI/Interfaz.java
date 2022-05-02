package GUI;

import static PIA.TuringMachine.*;
import java.awt.Color;
import java.awt.Image;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon imagenUANL= new ImageIcon("UANL.png");
        UANLlabel.setIcon(new ImageIcon(imagenUANL.getImage().getScaledInstance(UANLlabel.getWidth(), UANLlabel.getHeight(), Image.SCALE_SMOOTH)));
        ImageIcon imagenFCFM= new ImageIcon("FCFM.png");
        FCFMlabel.setIcon(new ImageIcon(imagenFCFM.getImage().getScaledInstance(FCFMlabel.getWidth(), FCFMlabel.getHeight(), Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresoCadenaTextField = new javax.swing.JTextField();
        ComprobarButton = new javax.swing.JButton();
        UANLlabel = new javax.swing.JLabel();
        FCFMlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TA 032 PIA E1");
        setForeground(java.awt.Color.darkGray);
        setMinimumSize(new java.awt.Dimension(475, 380));
        setPreferredSize(new java.awt.Dimension(300, 308));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IngresoCadenaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(IngresoCadenaTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 270, -1));

        ComprobarButton.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        ComprobarButton.setText("Comprobar");
        ComprobarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ComprobarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ComprobarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 125, 45));

        UANLlabel.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\OneDrive - Universidad Autonoma de Nuevo León\\Teoría de Autómatas - Prof. Yazmany Jahaziel Guerrero Ceja\\TA-032-PIA-E1\\UANL.png")); // NOI18N
        UANLlabel.setMaximumSize(new java.awt.Dimension(60, 60));
        UANLlabel.setMinimumSize(new java.awt.Dimension(60, 60));
        UANLlabel.setName(""); // NOI18N
        UANLlabel.setPreferredSize(new java.awt.Dimension(60, 60));
        UANLlabel.setRequestFocusEnabled(false);
        getContentPane().add(UANLlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, 78, 100));

        FCFMlabel.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\OneDrive - Universidad Autonoma de Nuevo León\\Teoría de Autómatas - Prof. Yazmany Jahaziel Guerrero Ceja\\TA-032-PIA-E1\\FCFM.png")); // NOI18N
        FCFMlabel.setMaximumSize(new java.awt.Dimension(60, 60));
        FCFMlabel.setMinimumSize(new java.awt.Dimension(60, 60));
        FCFMlabel.setName(""); // NOI18N
        FCFMlabel.setPreferredSize(new java.awt.Dimension(60, 60));
        FCFMlabel.setRequestFocusEnabled(false);
        getContentPane().add(FCFMlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 22, 72, 70));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTO INTEGRADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 22, 470, -1));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DE APRENDIZAJE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 470, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("L = {a²ⁿbbb|n≥0}");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 470, 50));

        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jButton1.setText("Simulador");
        jButton1.setAlignmentX(0.5F);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(125, 28));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, 45));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MÁQUINA DE TURING");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 470, 30));

        jMenu1.setText("Equipo 1");

        jMenuItem2.setText("José Antonio Cano Caramillo - 1914173");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Emiliano García Dávila - 1958339");
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Manuel Fernando Rivera de León - 1742940");
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Juan José Suárez Ibarra - 2076264");
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Angel Manuel Tapia Avitia - 1905895");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprobarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarButtonActionPerformed
        if(validar(reasignar(IngresoCadenaTextField.getText()), IngresoCadenaTextField.getText()))
            JOptionPane.showMessageDialog(null, "Cadena válida.");
        else
            JOptionPane.showMessageDialog(null, "Cadena inválida.");
    }//GEN-LAST:event_ComprobarButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
            Desktop.getDesktop().browse(new URI("http://turingmachinesimulator.com/shared/rsspmwkejp"));
        }
        catch(Exception exc){
            JOptionPane.showMessageDialog(null, "Error, no se pudo abrir el simulador.");
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
