package dossier;

/**
 *
 * @author Arul
 */

import java.io.*;
import javax.swing.JOptionPane;
public class WelcomeScreen extends javax.swing.JFrame {

    public WelcomeScreen() {                                                    //Creates new form WelcomeScreen
        initComponents();
        this.jLabel2.setVisible(false);                                         //These components are not needed initially, hence they are set as invisible
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jTextField1.setVisible(false);
        this.jPasswordField1.setVisible(false);
        this.jPasswordField2.setVisible(false);
    }

    int x = 0;
    File IU = new File("InitialUse.txt");                                       //Create Text Files
    File PS = new File("PasswordScreen.txt");
    int UserLength = 15;
    int PassLength = 15;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Click Next to Proceed");

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to Marine Pro 2.0");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("Enter User Name");
        jLabel2.setOpaque(true);

        jLabel3.setText("Enter Password");
        jLabel3.setOpaque(true);

        jLabel4.setText("Re-Enter Password");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Next, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField1))
                        .addGap(118, 118, 118))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Next)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
    x = x + 1;
    if (x == 1) {                                                               //On first click of the "Next" button this text is displayed
        this.jTextArea1.setText("To set up Marine Pro 2.0 with your user name and password, click the Next button once again");
        this.jLabel1.setText("");                                               
    }
    if (x == 2) {                                                               //On the second click of the "Next" button this text is displayed and these fields are made visible
        this.jTextArea1.setText("Enter your new User Name and Password in the fields below, then Click Next to proceed");
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jTextField1.setVisible(true);
        this.jPasswordField1.setVisible(true);
        this.jPasswordField2.setVisible(true);
    }
    if (x == 3) {                                                               //On the second click of the "Next" button this text is displayed and these fields are made visible
        String ui = this.jTextField1.getText();
        String p1 = this.jPasswordField1.getText();
        String p2 = this.jPasswordField2.getText();
        int length = 0;
        if (p1.equals(p2)) {
            try {
                RandomAccessFile PasswordScreen = new RandomAccessFile(PS,"rw");
                PasswordScreen.seek(length);
                PasswordScreen.writeBytes(ui);
                for(int i = 1; i <= (UserLength-ui.length()); i++) {
                    PasswordScreen.writeBytes("#");
                }
                length = length + UserLength;
                PasswordScreen.seek(length);
                PasswordScreen.writeBytes(p1);
                for(int i = 1; i <= (PassLength-p1.length()); i++) {
                    PasswordScreen.writeBytes("#");
                }
                length = length + PassLength;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error");
            }
        }
        this.jTextArea1.setText("Your settings have been saved! Click the Next button to proceed to the Login Screen");
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jTextField1.setVisible(false);
        this.jPasswordField1.setVisible(false);
        this.jPasswordField2.setVisible(false);
    }
    if (x == 4) {
        try {
            File f = new File("InitialUse.txt");
            boolean exist = f.createNewFile();
            FileWriter fs = new FileWriter(f,true);
            BufferedWriter out = new BufferedWriter(fs);
            out.write("abcd");        
            out.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
        PasswordScreen form = new PasswordScreen();
        form.setVisible(true);
    }
   
}//GEN-LAST:event_NextActionPerformed

    
    public static void main(String args[]) {        
        
        try {                                                                   // Set the Nimbus look and feel 
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {                                                 //Create and display the form
                new WelcomeScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
