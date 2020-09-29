/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_Interface;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import MyCustomFile.fileImageAccept;

/**
 *
 * @author copad
 */
public class imagen extends JFrame{
    private String ruta;
    private int WIDTH=800,HEIGHT=600;
    public imagen(String ruta){
        this.ruta=ruta;
        
        this.setTitle("Imagen");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        try {
            ImageIcon ico = new ImageIcon(getClass().getResource("ico.png"));
            setIconImage(ico.getImage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        LaminaImagen miLamina=new LaminaImagen(this.ruta);
        add(miLamina);
        
    }
}
class LaminaImagen extends JPanel{
    private String ruta;
    private Image imagen;
    private File archivo;
    fileImageAccept A=new fileImageAccept();
    public LaminaImagen(String ruta){
        this.ruta=ruta;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        try {
            archivo = new File(ruta);
            if (A.accept(archivo)) {
                imagen = ImageIO.read(archivo);
                ImageIcon i = new ImageIcon(imagen.getScaledInstance(800, 600, Image.SCALE_SMOOTH));
                g.drawImage(i.getImage(), 0, 0, null);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
       
        
        
    }
}
