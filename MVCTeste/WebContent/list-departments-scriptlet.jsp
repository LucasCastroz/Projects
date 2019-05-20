<%@ page import="java.util.List,
		br.com.indra.treinamento.dao.DepartmentDAO,
		br.com.indra.treinamento.model.Department" %>
<html>
<head>
	<title>JSP - Lista de Departamentos</title>
</head>
<body>
	<table>
		<%
		DepartmentDAO dao = new DepartmentDAO();
		List<Department> departments = dao.findAll();
		%>
		
		<tr>
			<th>Id</th>
			<th>Nome</th>
		</tr>
		
		<%
		for (Department department : departments) {
		%>
			<tr>
				<td><%=department.getId() %></td>
				<td><%=department.getName() %></td>
			</tr>
		<%
		}
		%>
	</table>
</body>
</html>