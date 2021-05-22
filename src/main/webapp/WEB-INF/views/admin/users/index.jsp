<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">IT15306-UD</a>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">User</a>
	      </li>
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Post</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	
	<div class="col-10 offset-1 mt-5">
		<div class="col-10 offset-1 mt-3">
			<a
				class="btn btn-success"
				href="${ pageContext.request.contextPath }/users/create">Create</a>
		</div>
		
		<div class="col-10 offset-1 mt-5">
			<table class="table table-strip table-dark">
				<thead>
					<tr>
						<td>Id</td>
						<td>Họ tên</td>
						<td>Mã SV</td>
						<td>Avatar</td>
						<td>Chuyên ngành</td>
						<td colspan="2">Thao tác</td>
					</tr>
				</thead>
				
				<tbody>
					<tr>
						<td>1</td>
						<td>Nguyễn Văn A</td>
						<td>PH12345</td>
						<td>Ko có</td>
						<td>UDPM</td>
						<td>
							<a
								class="btn btn-primary"
								href="${ pageContext.request.contextPath }/users/edit/1">Update</a>
						</td>
						<td>
							<form action="${ pageContext.request.contextPath }/users/delete/1" method="POST">
								<button class="btn btn-danger">Delete</button>
							</form>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
