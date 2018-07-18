/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBasePackage;

import javax.swing.JTextField;

/**
 *
 * @author Gabriel
 */
public class TransferJDialog extends javax.swing.JDialog {

    /**
     * Creates new form TransferJDialog
     */
    public TransferJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPaneSearch1 = new javax.swing.JPanel();
        search6 = new javax.swing.JLabel();
        jTxtSearch1 = new javax.swing.JTextField();
        jlblTransfer = new javax.swing.JLabel();
        jbtnAcept1 = new javax.swing.JButton();
        jbtnAcept3 = new javax.swing.JButton();
        jPnlKeyboard = new javax.swing.JPanel();
        keytrasnfer00 = new javax.swing.JButton();
        keytransfer03 = new javax.swing.JButton();
        keytransfer01 = new javax.swing.JButton();
        keytransfer02 = new javax.swing.JButton();
        keytransfer09 = new javax.swing.JButton();
        keytransfer07 = new javax.swing.JButton();
        keytransfer06 = new javax.swing.JButton();
        keytransfer05 = new javax.swing.JButton();
        keytransfer08 = new javax.swing.JButton();
        keytransfer04 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmar monto");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(404, 183));

        search6.setText("Monto $:");

        jlblTransfer.setBorder(javax.swing.BorderFactory.createTitledBorder("Comisión"));

        jbtnAcept1.setText("Aceptar");
        jbtnAcept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcept1ActionPerformed(evt);
            }
        });

        jbtnAcept3.setText("Borrar");
        jbtnAcept3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcept3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneSearch1Layout = new javax.swing.GroupLayout(jPaneSearch1);
        jPaneSearch1.setLayout(jPaneSearch1Layout);
        jPaneSearch1Layout.setHorizontalGroup(
            jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSearch1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPaneSearch1Layout.createSequentialGroup()
                        .addComponent(search6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtSearch1))
                    .addGroup(jPaneSearch1Layout.createSequentialGroup()
                        .addComponent(jbtnAcept1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnAcept3)
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaneSearch1Layout.setVerticalGroup(
            jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSearch1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search6)
                    .addComponent(jTxtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPaneSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAcept1)
                    .addComponent(jbtnAcept3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPnlKeyboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        keytrasnfer00.setText("0");
        keytrasnfer00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytrasnfer00ActionPerformed(evt);
            }
        });

        keytransfer03.setText("3");
        keytransfer03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer03ActionPerformed(evt);
            }
        });

        keytransfer01.setText("1");
        keytransfer01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer01ActionPerformed(evt);
            }
        });

        keytransfer02.setText("2");
        keytransfer02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer02ActionPerformed(evt);
            }
        });

        keytransfer09.setText("9");
        keytransfer09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer09ActionPerformed(evt);
            }
        });

        keytransfer07.setText("7");

        keytransfer06.setText("6");
        keytransfer06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer06ActionPerformed(evt);
            }
        });

        keytransfer05.setText("5");
        keytransfer05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer05ActionPerformed(evt);
            }
        });

        keytransfer08.setText("8");
        keytransfer08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer08ActionPerformed(evt);
            }
        });

        keytransfer04.setText("4");
        keytransfer04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keytransfer04ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPnlKeyboardLayout = new javax.swing.GroupLayout(jPnlKeyboard);
        jPnlKeyboard.setLayout(jPnlKeyboardLayout);
        jPnlKeyboardLayout.setHorizontalGroup(
            jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlKeyboardLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                        .addComponent(keytransfer04)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer05)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer06))
                    .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                        .addComponent(keytransfer07)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keytrasnfer00)
                            .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                                .addComponent(keytransfer08)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(keytransfer09))))
                    .addGroup(jPnlKeyboardLayout.createSequentialGroup()
                        .addComponent(keytransfer01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keytransfer03)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPnlKeyboardLayout.setVerticalGroup(
            jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnlKeyboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keytransfer01)
                    .addComponent(keytransfer02)
                    .addComponent(keytransfer03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keytransfer06)
                    .addComponent(keytransfer05)
                    .addComponent(keytransfer04))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPnlKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keytransfer07)
                    .addComponent(keytransfer08)
                    .addComponent(keytransfer09))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keytrasnfer00)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPaneSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPnlKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPaneSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPnlKeyboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAcept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcept1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jbtnAcept1ActionPerformed

    private void jbtnAcept3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcept3ActionPerformed
        jTxtSearch1.setText("");
    }//GEN-LAST:event_jbtnAcept3ActionPerformed

    private void keytrasnfer00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytrasnfer00ActionPerformed
        keyboard('0', jTxtSearch1);
    }//GEN-LAST:event_keytrasnfer00ActionPerformed

    private void keytransfer03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer03ActionPerformed
        keyboard('3', jTxtSearch1);
    }//GEN-LAST:event_keytransfer03ActionPerformed

    private void keytransfer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer01ActionPerformed
        keyboard('1', jTxtSearch1);
    }//GEN-LAST:event_keytransfer01ActionPerformed

    private void keytransfer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer02ActionPerformed
        keyboard('2', jTxtSearch1);
    }//GEN-LAST:event_keytransfer02ActionPerformed

    private void keytransfer09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer09ActionPerformed
        keyboard('9', jTxtSearch1);
    }//GEN-LAST:event_keytransfer09ActionPerformed

    private void keytransfer06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer06ActionPerformed
        keyboard('6', jTxtSearch1);
    }//GEN-LAST:event_keytransfer06ActionPerformed

    private void keytransfer05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer05ActionPerformed
        keyboard('5', jTxtSearch1);
    }//GEN-LAST:event_keytransfer05ActionPerformed

    private void keytransfer08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer08ActionPerformed
        keyboard('8', jTxtSearch1);
    }//GEN-LAST:event_keytransfer08ActionPerformed

    private void keytransfer04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keytransfer04ActionPerformed
        keyboard('4', jTxtSearch1);
    }//GEN-LAST:event_keytransfer04ActionPerformed

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
            java.util.logging.Logger.getLogger(TransferJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TransferJDialog dialog = new TransferJDialog(new javax.swing.JFrame(), true);
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
    private void keyboard(char input, JTextField text){
            StringBuilder str = new StringBuilder();
            str.append(text.getText());
            str.append(input);
            text.setText(str.toString());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPaneSearch1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPnlKeyboard;
    private javax.swing.JTextField jTxtSearch1;
    private javax.swing.JButton jbtnAcept1;
    private javax.swing.JButton jbtnAcept3;
    private javax.swing.JLabel jlblTransfer;
    private javax.swing.JButton keytransfer01;
    private javax.swing.JButton keytransfer02;
    private javax.swing.JButton keytransfer03;
    private javax.swing.JButton keytransfer04;
    private javax.swing.JButton keytransfer05;
    private javax.swing.JButton keytransfer06;
    private javax.swing.JButton keytransfer07;
    private javax.swing.JButton keytransfer08;
    private javax.swing.JButton keytransfer09;
    private javax.swing.JButton keytrasnfer00;
    private javax.swing.JLabel search6;
    // End of variables declaration//GEN-END:variables
}
