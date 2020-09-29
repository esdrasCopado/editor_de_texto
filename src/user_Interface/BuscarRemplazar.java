/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_Interface;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author copad
 */
public class BuscarRemplazar extends javax.swing.JFrame {
    private String ruta;
    private String linea ="";
    private Thread hilo;
    private Thread hilo2;
    private int contadorPalabras;
    private int contadorLetras;
    
/**
 * constructor que inicializa y da forma al JFrame
 * @param ruta ruta de acceso para el archivo
 */
    public BuscarRemplazar(String ruta) {
        this.ruta = ruta;

        Runnable r = new hilo_letra();
        hilo = new Thread(r);
        hilo.start();

        initComponents();
        Color c = new Color(184, 113, 232);
        this.getContentPane().setBackground(c);
        try {
            Image imagenInterna = new ImageIcon(getClass().getResource("ico.png")).getImage();

            this.setIconImage(imagenInterna);
        } catch (Exception e) {
        }
    }
    /**
     * detiene el hilo de ejecucion de lectura letra
     */
    protected void stop_thread1(){
        try {

            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(BuscarRemplazar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAceptar = new javax.swing.JButton();
        BotonRemplazar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TexBuscar = new javax.swing.JTextField();
        Remplazar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLEncontrar = new javax.swing.JLabel();
        jLRemplazar = new javax.swing.JLabel();
        jlPalabras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonRemplazar.setText("Remplazar");
        BotonRemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRemplazarActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Remplazar");

        jLEncontrar.setBackground(new java.awt.Color(255, 255, 255));
        jLEncontrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLEncontrar.setForeground(new java.awt.Color(255, 255, 255));

        jLRemplazar.setBackground(new java.awt.Color(255, 255, 255));
        jLRemplazar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLRemplazar.setForeground(new java.awt.Color(255, 255, 255));

        jlPalabras.setBackground(new java.awt.Color(255, 255, 255));
        jlPalabras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlPalabras.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Remplazar, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(TexBuscar))
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLRemplazar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLEncontrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(BotonAceptar)
                                .addGap(96, 96, 96)
                                .addComponent(BotonRemplazar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jlPalabras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(TexBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remplazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jlPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLEncontrar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLRemplazar, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptar)
                    .addComponent(BotonRemplazar)
                    .addComponent(jButton3))
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed

        String texto[] = linea.split(" ");
        String aux = TexBuscar.getText();
        int contador = 0;
        for (int i = 0; i < texto.length; i++) {
            if (texto[i].equalsIgnoreCase(aux)) {
                contador++;

            }

        }
        jlPalabras.setText("contador de palabras: "+contadorPalabras+" letras: "+contadorLetras);
        jLEncontrar.setText("Se encontraron: " + contador);
  
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void BotonRemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRemplazarActionPerformed
        String texto[] = linea.split(" ");
        String aux = TexBuscar.getText();
        String nuevo=new String();
        int contador = 0;
        for (int i = 0; i < texto.length; i++) {

            if (texto[i].equalsIgnoreCase(aux)) {
                texto[i]=Remplazar.getText();

            }
            nuevo+=texto[i]+" ";
            
        }
        linea=nuevo;
        
        Runnable r=new hilo_write();
        hilo2=new Thread(r);
        hilo2.start();
        
        
        
    }//GEN-LAST:event_BotonRemplazarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonRemplazar;
    private javax.swing.JTextField Remplazar;
    private javax.swing.JTextField TexBuscar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLEncontrar;
    private javax.swing.JLabel jLRemplazar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlPalabras;
    // End of variables declaration//GEN-END:variables

class hilo_letra implements Runnable{

    @Override
    public void run() {

        try {
            FileReader archivo = new FileReader(ruta);

            BufferedReader mibuffer = new BufferedReader(archivo);
            
            int c=0;
            while (c!=-1) {
                    
                    c = archivo.read();
                if (c != -1) {
                    char letra = (char) c;
                    linea += String.valueOf(letra);
                    
                    if(Character.isLetter(letra)){
                        contadorLetras++;
                    }
                }
                

                

            }
            String aux[]=linea.split(" ");
            contadorPalabras=aux.length;
            

             archivo.close();
             mibuffer.close();
             stop_thread1();
             

        } catch (IOException e) {
            System.out.println("hola");
            e.printStackTrace();
            
        }

    }

}
class hilo_write implements Runnable {

        @Override
        public void run() {

                if (ruta != null) {
                    try {
                        FileWriter archivo = new FileWriter(ruta);
                        BufferedWriter mibuffer = new BufferedWriter(archivo);
                        mibuffer.write(linea);
                        mibuffer.flush();
                        archivo.close();
                        jLEncontrar.setText("se cambio correctamente todas las palabras");
                       
                        
                    } catch (IOException e) {
                        System.out.println("no se encontro el archivo");
                    }
                    
                }
                
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(interface_usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
                jLEncontrar.setText("");
        }
        
        nuevaIntef n=new nuevaIntef();
       
                
        
    }
    

    class nuevaIntef extends interface_usuario {

        public nuevaIntef() {
            super.actuacizar();
        
            
        }
    }
}



