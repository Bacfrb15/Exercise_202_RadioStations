/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex006;

/**
 *
 * @author franz
 */
public class SenderDlg extends javax.swing.JDialog {

    /**
     * Creates new form SenderDlg
     */
    private Sender s;
    private boolean ok;
    
    public SenderDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Sender Sender() {
        return s;
    }
    public boolean IsOK() {
        return ok;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfSender = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfFrequenz = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfBand = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Sendername:");
        getContentPane().add(jLabel1);

        tfSender.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tfSender.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(tfSender);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Frequenz:");
        getContentPane().add(jLabel2);

        tfFrequenz.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tfFrequenz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(tfFrequenz);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Band:");
        getContentPane().add(jLabel3);

        tfBand.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tfBand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(tfBand);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onUebernehmen(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAbbrechen(evt);
            }
        });
        getContentPane().add(jButton2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onUebernehmen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onUebernehmen
        
        
        s = new Sender(tfSender.getText(), Double.parseDouble(tfFrequenz.getText()), tfBand.getText());
        ok = true;
        this.setVisible(false);
    }//GEN-LAST:event_onUebernehmen

    private void onAbbrechen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAbbrechen
        ok = false;
        this.setVisible(false);
    }//GEN-LAST:event_onAbbrechen

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
            java.util.logging.Logger.getLogger(SenderDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenderDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenderDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenderDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SenderDlg dialog = new SenderDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfBand;
    private javax.swing.JTextField tfFrequenz;
    private javax.swing.JTextField tfSender;
    // End of variables declaration//GEN-END:variables
}
