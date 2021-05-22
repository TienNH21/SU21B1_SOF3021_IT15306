const url = "http://localhost:8080/SOF3021_IT15306/hello-api";
fetch(url)
	.then(response => response.text())
	.then(function (data) {
		console.log("Response Body");
		console.log(data);
	});

$("#dob").datepicker();
