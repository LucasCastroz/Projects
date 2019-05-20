<jsp:include page="/barrademenu.jsp" />
<%-- 
    Document   : CadastroCliente
    Created on : 26/04/2019, 12:39:01
    Author     : marco.junior
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Cadastro de Cliente</title>
        <meta charset="UTF-8">
    </head>
    <body>                  
    <div id="cliente" class="tab-pane container active"><br><br><br><br> 
    <center> <h1>Alteração de Cadastro de Clientes</h1> </center>
    <form name="frmIncluir" action="ServletTeste" method="GET">
    <div id="cliente" class="tab-pane container active">  
     <table border="1">
>       
         <center> <h1>Preencher Informações</h1> </center>
            <div class="row">
		<div class="col-md-3 mb-3">
                    ID
                    <input type="text" class="form-control" id="nome_pet" placeholder="" value="" required=""name="codigo">
                </div>
                 <div class="col-md-3 mb-3">
                     USUARIO
                    <input type="text" class="form-control" id="peso_pet" placeholder="" value="" required="" name="usuario">
                </div>
                <div class="col-md-3 mb-3">
                    SENHA
                    <input type="text" class="form-control" id="peso_pet" placeholder="" value="" required="" name="senha">
               </div>            
            </div>       
    </table>
    <div class="container">
        <div class="row">
            <div class="col-md-3 mb-3">
            <button class="btn btn-primary btn-lg" type="submit" id="t1">Enviar Solicitação</button>
            </div>

          </div>
    </div>
    </div>             
</form>
</div>
        
</body>   
</html>
