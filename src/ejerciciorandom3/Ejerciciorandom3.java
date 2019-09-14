/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorandom3;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author rc185303
 */
public class Ejerciciorandom3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd=new Random();
        int n, dado, carta;
        double sueldo, peso;
        n=rnd.nextInt(101);
        dado=rnd.nextInt(6)+1;
        carta=rnd.nextInt(12)+1;
        sueldo=rnd.nextDouble()*80000;
        peso=rnd.nextDouble()*300;
        JOptionPane.showMessageDialog(null,"\n numero hasta 100: \n"+ n + "\n dado: \n" + dado + "\n carta: \n" + carta + 
                "\n sueldo: \n" + sueldo + "\n peso: \n" + peso);
    }
    
}
