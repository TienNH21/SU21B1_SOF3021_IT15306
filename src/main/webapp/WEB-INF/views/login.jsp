<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="${ pageContext.request.contextPath }/login">
		<div>
			<label>Email</label>
			<input type="email" name="email" id="email"  />
		</div>
		<div>
			<label>Password</label>
			<input type="password" name="password" id="password"  />
		</div>
		<div>
			<button>Login</button>
		</div>
	</form>
</body>
</html>