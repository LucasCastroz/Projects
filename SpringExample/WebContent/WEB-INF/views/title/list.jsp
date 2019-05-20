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
	<br/><a href="loadTitle">:.ADICIONAR UMA PROFISSAO.:</a><br/><br/>

	<table>
		<tr bgcolor="cccccc">
			<th>Id</th>
			<th>Title</th>
			<th>From date</th>
			<th>To Date</th>
			<th>Alterar</th>
			<th>Remover</th>
		</tr>
		
		<c:forEach var="title" items="${titles}" varStatus="i">
			<tr bgcolor="#${i.count % 2 == 0 ? 'eeeeee' : 'ffffff'}">
				<td>${title.empNo}</td>
				<td>${title.title}</td>
				<td align="center"><fmt:formatDate value="${title.fromDate}" pattern="dd/MM/yyyy"/></td>
				
				<td align="center"><fmt:formatDate value="${title.toDate}" pattern="dd/MM/yyyy"/></td>
				
				<fmt:formatDate value="${title.fromDate}" pattern="dd/MM/yyyy" var= "fromDateFormat"/>
				<td><a href="loadTitle?empNo=${title.empNo}&title=${title.title}&fromDate=${fromDateFormat}">Alterar</a></td>
				<td><a href="deleteTitle?empNo=${title.empNo}&title=${title.title}&fromDate=${fromDateFormat}">Remover</a></td>
			</tr>
		</c:forEach>
	</table>

<!-- Inclui o rodapé-->
	<c:import url="../footer.jsp"/>	

</body>
</html>