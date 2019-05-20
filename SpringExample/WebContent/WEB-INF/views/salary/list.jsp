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
	<br/><a href="loadSalary">:.ADICIONAR UM SALARIO.:</a><br/><br/>

	<table>
		<tr bgcolor="cccccc">
			<th>Id</th>
			<th>Data Contratação</th>
			<th>Salario</th>
			<th>Ultima data</th>
			<th>Alterar</th>
			<th>Remover</th>
		</tr>
		
		<c:forEach var="salary" items="${salaries}" varStatus="i">
			<tr bgcolor="#${i.count % 2 == 0 ? 'eeeeee' : 'ffffff'}">
				<td>${salary.empNo}</td>
				<td align="center"><fmt:formatDate value="${salary.fromDate}" pattern="dd/MM/yyyy"/></td>
				<td>${salary.salary}</td>
				<td align="center"><fmt:formatDate value="${salary.toDate}" pattern="dd/MM/yyyy"/></td>
				
				<fmt:formatDate value="${salary.fromDate}" pattern="dd/MM/yyyy" var= "fromDateFormat"/>
				<td><a href="loadSalary?empNo=${salary.empNo}&fromDate=${fromDateFormat}">Alterar</a></td>
				<td><a href="deleteSalary?empNo=${salary.empNo}&fromDate=${fromDateFormat}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>

<!-- Inclui o rodapé-->
	<c:import url="../footer.jsp"/>	

</body>
</html>