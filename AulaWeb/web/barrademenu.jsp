<jsp:useBean id="login" class="com.bean.TabelaUsuarioBean" scope="session"/>
<%@page import="com.bean.TabelaUsuarioBean"%>
<%-- 
    Document   : barrademenu
    Created on : 13/04/2019, 23:10:55
    Author     : julio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
     <%-- importa o css --%>
    <link href="css/petshop.css" rel="stylesheet" type="text/css"/>
    <style type="text/css">@import url("css/petshop.css"); </style>
    
    <%-- importa o js --%>
    <script src="<c:url value=/resources/js/main.js />"></script>
    
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Mundo Cão</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/4.3/examples/sign-in/">

    <!-- Bootstrap core CSS -->
    <link href="/docs/4.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


           
    
  </head>

  <body>

    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="#">Pet Shop</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      
      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
                 
            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Cão</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="#">- ITEM A</a>
              <a class="dropdown-item" href="#">- ITEM B</a>
              <a class="dropdown-item" href="#">- ITEM C</a>
            </div>
          </li>
            <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Gato</a>
            <div class="dropdown-menu" aria-labelledby="dropdown01">
              <a class="dropdown-item" href="#">- ITEM A</a>
              <a class="dropdown-item" href="#">- ITEM B</a>
              <a class="dropdown-item" href="#">- ITEM C</a>
            </div>
          </li>

          <li>
            <div>
                <a class="nav-link" href="Login.jsp">Promoções<span class="sr-only"></span></a>
            </div>
          </li>
        </ul>
        <form class="form-inline my-3 my-lg-0">
          <input class="form-control mr-sm-2" type="text" placeholder="Pesquisa" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Pesquisar</button>    
          <p><a><% String Login = request.getParameter("usuario");
                  
                if(Login != null)
          {%><a class="nav-link" href="Login.jsp"><%= Login %><span class="sr-only">(atual)</span></a><%} 
                else
                {%><a class="nav-link" href="Login.jsp">Realize seu Login<span class="sr-only">(atual)</span></a><%}
                %></p>
          <!--a class="nav-link" href="Login.jsp">Login<span class="sr-only">(atual)</span></a!-->
        </form>
      </div>
    </nav>
    </body>
</html>
