/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package model.soswing;

import javax.swing.ImageIcon;

/**
 *
 * @author Wilberth
 */
public class SOSWING {

    public static void main(String[] args) {
        Plantilla plantilla = new Plantilla();
        ImageIcon img = new ImageIcon("icono.png");
        plantilla.setTitle("Proyecto SO");
        plantilla.setIconImage(img.getImage());
        plantilla.setVisible(true);
     
    }
}


