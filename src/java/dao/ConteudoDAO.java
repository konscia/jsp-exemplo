package dao;


import model.Conteudo;
import java.util.ArrayList;


public class ConteudoDAO {

    public static ArrayList<Conteudo> lista(){
        
        ArrayList<Conteudo> minhaLista = new ArrayList<Conteudo>();
        minhaLista.add( new Conteudo("Título", "Descrição"));
        minhaLista.add( new Conteudo("Título 2", "Descrição"));
        minhaLista.add( new Conteudo("Título 3", "Descrição"));
        minhaLista.add( new Conteudo("Título 4", "Descrição"));
        minhaLista.add( new Conteudo("Título 5", "Descrição"));
        minhaLista.add( new Conteudo("Título 6", "Descrição"));
        return minhaLista;
        
    }
}
