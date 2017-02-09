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

<form method="POST" action="${contextPath}/list" class="form-signin">
        <h2 class="form-heading">Add Product</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <input name="name" type="text" class="form-control" placeholder="Item name"
                   autofocus="true"/>
            </br>
            <input type="number" name="price"  placeholder="Price">
            <br>
            <button class="btn btn-lg btn-primary" type="submit">Add</button>
           
        </div>

    </form>
</body>
</html>
