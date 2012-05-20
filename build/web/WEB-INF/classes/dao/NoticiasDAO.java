package dao;

import java.util.ArrayList;
import model.Noticia;

public class NoticiasDAO {

    public static ArrayList<Noticia> lista(){        
        ArrayList<Noticia> lista = new ArrayList<Noticia>();
        
        lista.add( new Noticia("Título Especial", "Descrição") );
        lista.add( new Noticia("Título 2", "Descrição") );
        lista.add( new Noticia("Título 3", "Descrição") );
        lista.add( new Noticia("Título 4", "Descrição") );
        lista.add( new Noticia("Título 5", "Descrição") );
        lista.add( new Noticia("Título 6", "Descrição") );
        
        return lista;        
    }
}
