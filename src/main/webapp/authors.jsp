<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Authors</title>
</head>
<body>


<c:forEach var="author" items="${authors}">
    <div class="author">
        <p>${author.name}</p>
    </div>
</c:forEach>
</body>
</html>
