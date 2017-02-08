<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping</title>

</head>
<body>
<h1> WELKOMMEN!</h1>
<br>
<form:form method="GET" modelAttribute="name"
           action="${pageContext.request.contextPath}/list">
     
            <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
  </form:form>
<hr>
</body>
</html>
