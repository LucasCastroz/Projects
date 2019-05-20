<%-- 
    Document   : CadastroPet
    Created on : 26/04/2019, 12:39:24
    Author     : marco.junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Cliente</h1>
        <h2>Nome <input type="text" name="nome"></h2>
        <h2>Peso <input type="text" name="peso"></h2>
        <h2>Raça </h2>
        <select id=raca>
        <option value="" >Selecione a Raça</option>
        <option value="vl" >Vira lata</option>
        <option value="rs" >Rasga Saco</option>
        <option value="sp" >Sheid pulga</option>
        </select>       
        <h2>Data de Nascimento<input type="text" name="dataNascimento"></h2> 
        
    </body>
</html>
