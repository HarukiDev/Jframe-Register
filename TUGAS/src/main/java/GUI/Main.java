/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package GUI;

import javax.swing.JFrame;

/**
 *
 * @author ASUS TUF
 */
public class Main {

    public static void main(String[] args) {
        Register frame = new Register();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.pack();
        frame.setVisible(true);
    }
}
