<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
	
	<br/><a href="loadDepartment">:.ADICIONAR UM DEPARTAMENTO.:</a><br/><br/>

	<table>
		<tr bgcolor="cccccc">
			<th>Id</th>
			<th>Nome</th>
			<th>Alterar</th>
			<th>Remover</th>
		</tr>
		
		<c:forEach var="department" items="${departments}" varStatus="i">
			<tr bgcolor="#${i.count % 2 == 0 ? 'eeeeee' : 'ffffff'}">
				<td>${department.id}</td>
				<td>${department.name}</td>
				<td><a href="loadDepartment?id=${department.id}">Alterar</a></td>
				<td><a href="deleteDepartment?id=${department.id}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<!-- Inclui o rodapé-->
	<c:import url="../footer.jsp"/>
	
</body>
</html>