<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Treinamento - Spring</title>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<style type="text/css">
.ui-datepicker {
	font-size: 9pt;
}

body, table {
	font-family: ARIAL;
	font-size: 14px;
}
</style>
</head>
<body>
	<basefont face="arial, verdana, sans-serif" size="-2">

	<c:import url="../header.jsp" />

	<form action="${formAction}" method="post">

		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name="empNo" value="${employee.empNo}"
					${formAction == 'saveEmployee' ? '' : 'readonly'} /></td>
			</tr>
			<tr>
				<td>Data de Nascimento:</td>
				<td><input type="text" id="dateBirth" name="dateBirth"
					value="<fmt:formatDate value='${employee.dateBirth}' pattern='dd/MM/yyyy'/>"
					readonly /> <script>
						$("#dateBirth").datepicker({
							dateFormat : 'dd/mm/yy',
							changeMonth : true,
							changeYear : true
						});
					</script></td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="firstName"
					value="${employee.firstName}" /></td>
			</tr>
			<tr>
				<td>Sobrenome:</td>
				<td><input type="text" name="lastName"
					value="${employee.lastName}" /></td>
			</tr>
			<tr>
				<td>Sexo:</td>
				<td><select name="gender">
						<option value="M" ${employee.gender == 'M' ? 'selected' : ''}>Masculino</option>
						<option value="F" ${employee.gender == 'F' ? 'selected' : ''}>Feminino</option>
				</select></td>
			</tr>
			<tr>
				<td>Data de Contratação:</td>
				<td><input type="text" id="hireDate" name="hireDate"
					value="<fmt:formatDate value='${employee.hireDate}' pattern='dd/MM/yyyy'/>"
					readonly /> <script>
						$("#hireDate").datepicker({
							dateFormat : 'dd/mm/yy',
							changeMonth : true,
							changeYear : true
						});
					</script></td>
			</tr>
		</table>

		<br /> <input type="submit" value="Gravar" />
	</form>

	<c:import url="../footer.jsp" />

</body>
</html>