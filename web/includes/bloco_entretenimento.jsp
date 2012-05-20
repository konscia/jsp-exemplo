<%@page import="java.util.ArrayList"%>
<%@page import="model.Noticia"%>
<%@page import="dao.NoticiasDAO"%>
<div class="row bloco-noticias">
    
    <%
        //Código java
        ArrayList<Noticia> lista = NoticiasDAO.listaEntretenimento();
        for( Noticia n : lista){
            out.print("<div class=\"noticia span4\">");
                out.print("<h3>" + n.getTitulo() + "</h3>" );
                out.print("<p>" + n.getDescricao() + "</p>" );
                out.print(" <a href=\"#\">mais +</a>" );
            out.print("</div>");
        }
    %>
</div>