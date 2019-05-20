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
	
	<c:import url="WEB-INF/views/header.jsp"/>

	<br/><a href="listDepartments">:.DEPARTAMENTOS.:</a><br/><br/>

	<br/><a href="listEmployees">:.EMPREGADOS.:</a><br/><br/>
	
	<c:import url="WEB-INF/views/footer.jsp"/>
	
</body>
</html>