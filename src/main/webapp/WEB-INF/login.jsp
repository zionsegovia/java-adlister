<<<<<<< HEAD
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1>Please Log In</h1>
<<<<<<< HEAD:src/main/webapp/WEB-INF/login.jsp
        <form action="/login" method="POST">
=======
        <form action="${pageContext.request.contextPath}/login.jsp" method="POST">
>>>>>>> main:src/main/webapp/login.jsp
            <div class="form-group">
                <label for="username">Username</label>
                <input id="username" name="username" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input id="password" name="password" class="form-control" type="password">
            </div>
            <input type="submit" class="btn btn-primary btn-block" value="Log In">
        </form>
    </div>
</body>
</html>
=======

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <h1>Login</h1>
    <form action="${pageContext.request.contextPath}/login.jsp" method="POST">
      <label for="username">Username</label>
      <input type="text" name="username" id="username" />
      <label for="password">Password</label>
      <input type="password" name="password" id="password" />
      <input type="submit" value="Login" />
    </form>
  </body>
</html>


<c:if test="${param.username == 'admin' && param.password == 'password'}">
  <c:redirect url="profile.jsp" />
</c:if>




>>>>>>> main
