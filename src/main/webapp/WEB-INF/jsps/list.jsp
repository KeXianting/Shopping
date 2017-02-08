<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopping</title>

</head>
<body>
<h1> WELKOMMEN!</h1>
<br>
 <table class="table table-striped">
        
        <thead>
            <tr>
                <th>Item Name</th>
                <th>Price</th>
               
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${items}" var="item">
                <tr>
                    <td>${item.name}</td>
                    
                    <td>${item.price}</td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
  
<hr>
</body>
</html>
