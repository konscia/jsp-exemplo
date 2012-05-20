<%@page import="dao.DestaquesDAO"%>
<%@page import="model.Destaque"%>
<%@page import="java.util.ArrayList"%>
<div class="row bloco-destaques">
    <%
        //Código java
        ArrayList<Destaque> lista = DestaquesDAO.destaques();
        for( Destaque d : lista){
            out.print("<div class=\"span2\">");
                out.print("<div class=\"page-header\">");
                    out.print("<h1><small>" + d.getTitulo() + "</small> "+d.getSubtitulo()+"</h3>" );                    
                out.print("</div>");
                out.println("<p>texto parágrafo...</p>");
            out.print("</div>");
        }
    %>
</div>