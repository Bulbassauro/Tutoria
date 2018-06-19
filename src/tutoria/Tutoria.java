/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoria;

import Telas.Principal;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author gabinete
 */
public class Tutoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Principal Tela = new Principal();
        Tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Tela.setVisible(true);
        
    }
    
}
