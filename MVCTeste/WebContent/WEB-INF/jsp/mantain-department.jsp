<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Trenamento - MVC</title>
</head>
<body>

	<c:import url="header.jsp"/>
	
	<form action="mvc?action=MantainDepartmentAction" method="post">
		<c:choose>
					<c:when test="${subAction == 'SAVE'}">
						Id: <input type="text" name="id" value="${department.id}"/><br/>
					</c:when>
					<c:otherwise>
						Id: <input type="text" name="id" value="${department.id}" readonly/><br/>
					</c:otherwise>
		</c:choose>
		Nome: <input type="text" name="name" value="${department.name}"/><br/>
	
		<input type="hidden" name="subAction" value="${subAction}"/>
		
		<input type="submit" value="Gravar"/>
	</form>
	
	<c:import url="footer.jsp"/>
	
</body>
</html>