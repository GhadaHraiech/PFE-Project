/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghadamira;

import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * @author lenovo
 */
public class Ghadamira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
      Recherche rech =new Recherche();
     
    
//frame.setLocationRelativeTo(null);
        rech.pack();
        rech.setMinimumSize(new Dimension(500, 380));
rech.setLocationRelativeTo(null);
rech.setVisible(true);

        
    
           
    
                 
               
                

    }
    
}
