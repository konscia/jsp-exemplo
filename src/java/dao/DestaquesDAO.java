/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Destaque;

/**
 *
 * @author senai
 */
public class DestaquesDAO {
    
    public static ArrayList<Destaque> destaques(){        
        ArrayList<Destaque> lista = new ArrayList<Destaque>();
        
        lista.add( new Destaque("Destaque", "PR") );
        lista.add( new Destaque("Destaque", "SC") );
        lista.add( new Destaque("Destaque", "RS") );
        lista.add( new Destaque("Destaque", "SP") );       
        
        return lista;        
    }
}
