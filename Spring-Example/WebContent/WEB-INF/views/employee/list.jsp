<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
	<title>Treinamento - Spring</title>
	<style type="text/css">
		body, table {
			font-family: ARIAL;
			font-size: 14px;
		}
	</style>
</head>
<body>
	<basefont face="arial, verdana, sans-serif" size="-2">

	<!-- Inclui o cabeçalho -->
	<c:import url="../header.jsp"/>
	
	<br/><a href="loadEmployee">:.ADICIONAR UM EMPREGADO.:</a><br/><br/>

	<table>
		<tr bgcolor="cccccc">
			<th>Id</th>
			<th>Data de Nascimento</th>
			<th>Nome</th>
			<th>Sobrenome</th>
			<th>Sexo</th>
			<th>Data de Contratação</th>
			<th>Alterar</th>
			<th>Remover</th>
		</tr>
		
		<c:forEach var="employee" items="${employees}" varStatus="i">
			<tr bgcolor="#${i.count % 2 == 0 ? 'eeeeee' : 'ffffff'}">
				<td>${employee.id}</td>
				<td align="center"><fmt:formatDate value="${employee.birthDate}" pattern="dd/MM/yyyy"/></td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td align="center">${employee.gender}</td>
				<td align="center"><fmt:formatDate value="${employee.hireDate}" pattern="dd/MM/yyyy"/></td>
				<td><a href="loadEmployee?id=${employee.id}">Alterar</a></td>
				<td><a href="deleteEmployee?id=${employee.id}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- Inclui o rodapé-->
	<c:import url="../footer.jsp"/>
	
</body>
</html>