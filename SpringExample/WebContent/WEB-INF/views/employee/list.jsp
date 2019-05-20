<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>

<title>Spring Teste</title>

<style type="text/css">
		body, table {
			font-family: ARIAL;
			font-size: 14px;
		}
	</style>
</head>
<body>


	<!-- Inclui o cabeçalho -->
	<c:import url="../header.jsp"/>
	<br/><a href="principal">:.INICIO.:</a><br/><br/>
	<br/><a href="loadEmployee">:.ADICIONAR UM EMPLOYEE.:</a><br/><br/>

	<table>
		<tr bgcolor="cccccc">
			<th>Id</th>
			<th>Data Nascimento</th>
			<th>Primeiro Nome</th>
			<th>Ultimo Nome</th>
			<th>Genero</th>
			<th>Data Contratação</th>
			<th>Alterar</th>
			<th>Remover</th>
		</tr>
		
		<c:forEach var="employee" items="${employees}" varStatus="i">
			<tr bgcolor="#${i.count % 2 == 0 ? 'eeeeee' : 'ffffff'}">
				<td>${employee.empNo}</td>
				<td align="center"><fmt:formatDate value="${employee.dateBirth}" pattern="dd/MM/yyyy"/></td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td align="center">${employee.gender}</td>
				<td align="center"><fmt:formatDate value="${employee.hireDate}" pattern="dd/MM/yyyy"/></td>
				<td><a href="loadEmployee?empNo=${employee.empNo}">Alterar</a></td>
				<td><a href="deleteEmployee?empNo=${employee.empNo}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>

<!-- Inclui o rodapé-->
	<c:import url="../footer.jsp"/>	

</body>
</html>