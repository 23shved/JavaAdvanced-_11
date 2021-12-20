<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create Product</title>
<style>
    h1{
        background-color: darkred;
        color: #f56019;
        text-align: center;
        font-size: 76px;
    }
    .btn-primary{
    width: 100% !important;
    }
    
</style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link rel="stylesheet" href ="css/login.css">
	<link rel="stylesheet" href ="css/addproduct.css">

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
   
   <form class="createProduct">
  <div class="form-group">
    <input type="text" class="form-control productName" aria-describedby="emailHelp" placeholder="Enter book name">
  </div>
  <div class="form-group">
    <input type="text" class="form-control productDescription" aria-describedby="emailHelp" placeholder="Enter description">
  </div>
    <div class="form-group">
    <input type="number" class="form-control productPrice" aria-describedby="emailHelp" placeholder="Enter price">
  </div>

  <button type="submit" class="btn btn-primary createProduct">Submit</button>
</form>
   
<a href="index.jsp" >Go to main page</a>
<jsp:include page="footer.jsp"></jsp:include>


	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
		integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
		integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="js/header.js"></script>
    <script src="js/createProduct.js"></script>

</body>


</html>