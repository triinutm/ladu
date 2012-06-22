<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
<head><title>Login please.</title></head>
<body onload='document.f.j_username.focus();'>
	<h3>Login with Username and Password</h3>
	<h4><font color="red"><c:out value="${failed}"/></font></h4>
	<form id="f" name="f" action="j_spring_security_check" method="post">
		<table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''>
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" />
				</td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" type="reset" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>