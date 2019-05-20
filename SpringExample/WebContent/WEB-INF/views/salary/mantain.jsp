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
				<td><input type="text" name="empNo" value="${salary.empNo}"
					${formAction == 'saveSalary' ? '' : 'readonly'} /></td>
			</tr>
			<tr>
				<td>From Date:</td>
				<td><input type="text" id="fromDate" name="fromDate"
					value="<fmt:formatDate value='${salary.fromDate}' pattern='dd/MM/yyyy'/>"
					readonly /> <script>
						$("#fromDate").datepicker({
							dateFormat : 'dd/mm/yy',
							changeMonth : true,
							changeYear : true
						});
					</script></td>
			</tr>
			<tr>
				<td>Salario:</td>
				<td><input type="text" name="salary"
					value="${salary.salary}" /></td>
			</tr>
		
			
			<tr>
				<td>To date:</td>
				<td><input type="text" id="toDate" name="toDate"
					value="<fmt:formatDate value='${salary.toDate}' pattern='dd/MM/yyyy'/>"
					readonly /> <script>
						$("#toDate").datepicker({
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