<%@page import="dao.ConteudoDAO"%>
<%@page import="model.Conteudo"%>
<%@page import="java.util.ArrayList"%>


<div class="row bloco-noticias">
    
    <%
    ArrayList<Conteudo> lista = ConteudoDAO.lista();
    for(Conteudo c : lista){
        out.println(c.getTitulo());
    }
    %>
      
</div>