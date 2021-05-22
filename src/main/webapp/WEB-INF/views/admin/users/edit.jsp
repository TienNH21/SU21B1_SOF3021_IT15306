<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form" %>
<title>Insert title here</title>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap.min.css"></link>
<link rel="stylesheet" href="${ pageContext.request.contextPath }/css/bootstrap-datepicker.min.css"></link>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light px-5">
	  <a class="navbar-brand" href="#">Navbar</a>
	
	  <div class="collapse navbar-collapse">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Users</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Categories</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Products</a>
	      </li>
	    </ul>
	  </div>
	</nav>

	<div class="mt-5 col-10 offset-1">
		<form:form
			modelAttribute="user"
			method="POST"
			action="${ pageContext.request.contextPath }/users/update/1">
			<input type="hidden" name="_method" value="put" />
			<div class="form-group mt-3">
				<label for="name">Name</label>
				<form:input path="hoTen" cssClass="form-control" />
			    <%-- <input value="${ user.name }" type="text" class="form-control" id="name" name="name" autocomplete="off"> --%>
			    <small id="name_error" class="form-text text-danger"></small>
			</div>
			<div class="form-group mt-3">
				<label for="email">Email</label>
				<form:input path="email" cssClass="form-control" />
			</div>
			<div class="form-group mt-3">
				<label for="password">Password</label>
				<form:password path="password" cssClass="form-control" />
			</div>
			<div class="form-group mt-3">
				<label for="dob">Date of Birth</label>
			    <input type="text" class="form-control" id="dob" name="dob" autocomplete="off">
			</div>
			<div class="form-group mt-3">
				<label for="role">Role</label>
				<form:select path="phanQuyen" cssClass="form-control">
					<form:option value="1">Sinh Vien</form:option>
					<form:option value="2">Giang Vien</form:option>
					<form:option value="3">PDT</form:option>
					<form:option value="4">CNBM</form:option>
				</form:select>
				<%-- <select name="role" id="role" class="form-control" required>
					<option selected disabled>Choose</option>
					<option value="1" ${ user.role == 1 ? "selected" : "" }>User</option>
					<option value="2" ${ user.role == 2 ? "selected" : "" }>Admin</option>
				</select> --%>
			</div>
			<div class="form-group mt-3">
				<label for="avatar">Image</label>
			    <input type="file" value="${ user.avatar }" class="form-control" id="avatar" name="avatar">
			</div>
			<div class="form-group mt-3">
				<label for="gender">Gender</label>
				<form:select path="gioiTinh" cssClass="form-control">
					<form:option value="0">Nữ</form:option>
					<form:option value="1">Nam</form:option>
				</form:select>
				<%-- <select name="gender" id="gender" class="form-control" required>
					<option selected disabled>Choose</option>
					<option value="1" ${ user.gender == 1 ? "selected" : "" }>Male</option>
					<option value="2" ${ user.gender == 2 ? "selected" : "" }>Female</option>
				</select> --%>
			</div>
			<%-- <div class="form-group mt-3">
				<label for="status">Status</label>
				<select name="status" id="status" class="form-control" required>
					<option selected disabled>Choose</option>
					<option value="1" ${ user.status == 1 ? "selected" : "" }>Active</option>
					<option value="2" ${ user.status == 2 ? "selected" : "" }>Inactive</option>
				</select>
			</div> --%>
			<div class="form-group mt-3">
				<button class="btn btn-primary">Submit</button>
				<button type="reset" class="btn btn-danger">Clear</button>
			</div>
		</form:form>
	</div>

	<script src="${ pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script src="${ pageContext.request.contextPath }/js/bootstrap-datepicker.min.js"></script>
	<script src="${ pageContext.request.contextPath }/js/admin/users/edit.js"></script>
</body>
</html>