package dao;

import java.util.ArrayList;
import model.Noticia;
import util.*;

public class NoticiasDAO {

    public static ArrayList<Noticia> listaHome(){        
        ArrayList<Noticia> lista = new ArrayList<Noticia>();
        
        MySQL bancoDados = new MySQL();
        String sql = "select * from noticias"; //Cria consulta para pegar todas as notícias do banco
        ConjuntoResultados linhas = bancoDados.executaSelect(sql); //Pega conjunto de linhas retornadas 
        //Para cada linha retornado, 
            //cria um objeto Modelo
            //E preenche seus atributos com o valor de cada coluna
        while(linhas.next()){
            Noticia n = new Noticia();
            n.setTitulo( linhas.getString("titulo") );
            n.setDescricao( linhas.getString("descricao") );
            
            lista.add(n);
        }
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
