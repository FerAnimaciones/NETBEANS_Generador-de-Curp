/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fernanando Manuel
 */
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.*;

public class FerAnimaciones {

    public void Acerca() {
        Icon icono = new ImageIcon("src/Imagenes/FerAnimaciones.png");
        showMessageDialog(null, "Fernando Manuel Avila Cataño", "FerAnimaciones",0,icono);
    }
}
