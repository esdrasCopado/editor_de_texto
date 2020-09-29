/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCustomFile;

import java.io.File;

/**
 *
 * @author copad
 */
public class fileImageAccept extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File file) {
        return file.isDirectory()||file.getAbsolutePath().endsWith(".jpg")||file.getAbsolutePath().endsWith(".png");
    }

    @Override
    public String getDescription() {
        return "image document(.jpg)";
    }
    
}
