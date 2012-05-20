<!DOCTYPE html>
<html lang="en">
  
  <jsp:include page="includes/head.jsp" />

  <body>

    <div class="container">
        <jsp:include page="includes/bloco_topo.jsp">
            <jsp:param name="titulo" value="Página Principal" />
        </jsp:include>
        
      <jsp:include page="includes/bloco_home.jsp" />
      <jsp:include page="includes/bloco_destaques.jsp" />
    </div>
    
    <jsp:include page="includes/javascript.jsp" />
  </body>
</html>
