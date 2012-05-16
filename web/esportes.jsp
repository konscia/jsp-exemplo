<!DOCTYPE html>
<html lang="en">
  
  <jsp:include page="includes/head.jsp" />

  <body>

    <div class="container">
      <jsp:include page="includes/bloco_topo.jsp">
          <jsp:param name="titulo" value="Esportes" />
      </jsp:include>	   	 
      <jsp:include page="includes/bloco_noticias_esportes.jsp" />
      <jsp:include page="includes/bloco_destaques.jsp" />
    </div>
    
    <jsp:include page="includes/javascript.jsp" />
  </body>
</html>
