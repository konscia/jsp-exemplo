package dao;

import java.util.ArrayList;
import model.Noticia;

public class NoticiasDAO {

    public static ArrayList<Noticia> listaHome(){        
        ArrayList<Noticia> lista = new ArrayList<Noticia>();
        
        lista.add( new Noticia("Especial", "Descrição mais longa de um texto que será cortado em um determinado caracter.") );
        lista.add( new Noticia("Especial Esporte", "Descrição") );
        lista.add( new Noticia("Fofoca Super Nova", "Descrição") );
        lista.add( new Noticia("Economia Nacional", "Descrição") );
        
        return lista;        
    }
    
    public static ArrayList<Noticia> listaNoticias(){        
        ArrayList<Noticia> lista = new ArrayList<Noticia>();
        
        lista.add( new Noticia("Notícia 1", "Descrição") );
        lista.add( new Noticia("Notícia 2", "Descrição") );
        lista.add( new Noticia("Notícia 3", "Descrição") );
        lista.add( new Noticia("Notícia 4", "Descrição") );
        lista.add( new Noticia("Notícia 5", "Descrição") );
        lista.add( new Noticia("Notícia 6", "Descrição") );
        lista.add( new Noticia("Notícia 7", "Descrição") );
        lista.add( new Noticia("Notícia 8", "Descrição") );
        
        return lista;        
    }
    
    public static ArrayList<Noticia> listaEsportes(){        
        ArrayList<Noticia> lista = new ArrayList<Noticia>();
        
        lista.add( new Noticia("Notícia Esporte 1", "Descrição") );
        lista.add( new Noticia("Notícia Esporte 2", "Descrição") );
        lista.add( new Noticia("Notícia Esporte 3", "Descrição") );
        lista.add( new Noticia("Notícia Esporte 4", "Descrição") );
        lista.add( new Noticia("Notícia Esporte 5", "Descrição") );
        lista.add( new Noticia("Notícia Esporte 6", "Descrição") );
        
        return lista;        
    }
    
    public static ArrayList<Noticia> listaEntretenimento(){        
        ArrayList<Noticia> lista = new ArrayList<Noticia>();
        
        lista.add( new Noticia("Fofoca 1", "Descrição") );
        lista.add( new Noticia("Fofoca 2", "Descrição") );
        lista.add( new Noticia("Fofoca 3", "Descrição") );
        lista.add( new Noticia("Fofoca 4", "Descrição") );
        lista.add( new Noticia("Fofoca 5", "Descrição") );
        lista.add( new Noticia("Fofoca 6", "Descrição") );
        
        return lista;        
    }
}
