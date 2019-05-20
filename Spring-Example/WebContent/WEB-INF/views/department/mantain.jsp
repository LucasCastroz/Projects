<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Treinamento - Spring</title>
</head>
<body>
	<basefont face="arial, verdana, sans-serif" size="-2">

	<c:import url="../header.jsp"/>
	
	<form action="${formAction}" method="post">
		Id: <input type="text" name="id" value="${department.id}" ${formAction == 'saveDepartment' ? '' : 'readonly'}/><br/>
		Nome: <input type="text" name="name" value="${department.name}"/><br/>
		
		<input type="submit" value="Gravar"/>
	</form>
	
	<c:import url="../footer.jsp"/>
	
</body>
</html>