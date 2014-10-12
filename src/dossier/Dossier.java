/*
 * Dossier.java
 *
 * Created on Aug 13, 2011, 01:33:05 AM
 */

package dossier;

/**
 *
 * @author Arul
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

public class Dossier {

    public static void main(String[] args) throws IOException {        
                                                                                //Sets the Nimbus look and feel
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Dossier.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Dossier.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Dossier.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Dossier.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        try {
            File f = new File("InitialUse.txt");                                //Creates the text file
            FileInputStream a = new FileInputStream(f);
            DataInputStream in = new DataInputStream(a);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));      
            if (br.readLine() == null ) {                                       //If the text file is empty, open the WelcomeScreen
                WelcomeScreen form = new WelcomeScreen();
                form.setVisible(true);  
            } else {                                                            //If the text file is not empty, open the PasswordScreen
                PasswordScreen form2 = new PasswordScreen();
                form2.setVisible(true);
            } in.close();
        } catch (FileNotFoundException ex) {} 
    }
}