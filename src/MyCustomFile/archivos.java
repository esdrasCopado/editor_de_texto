/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyCustomFile;

import java.io.File;

/**
 *
 * @author lv1013
 */
public class archivos extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File f) {
        return f.isDirectory()||f.getAbsolutePath().endsWith(".txt");
    }

    @Override
    public String getDescription() {
       return "text document (.txt)";
    }
    
}
