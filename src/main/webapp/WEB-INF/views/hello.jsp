<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Poly</h1>
	<form method="POST" enctype="multipart/form-data"
		action="${ pageContext.request.contextPath }/hello-upload">
		<input type="file" name="uploadedFile" />
		<button>Submit</button>
	</form>
</body>
</html>
