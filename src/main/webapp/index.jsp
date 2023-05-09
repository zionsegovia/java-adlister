<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int count = 0; %>
<& count += 1; %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Start Page"/>
    </jsp:include>
</head>
<body>

    <jsp:include page="partials/mavbar.jsp"/>
<%-- This is a jsp comment you will not see this in the html --%>
<!-- this is an html comments , you will see this in the html -->
<h1> Implicit Objects in action:</h1>
<p> Path: <%= request.getRequestURL()%></p>
<p>Query String: <%=request.getQueryString()%></p>
<p>"name" parameter: <%= request.getParameter("name")%></p>
<p>"method" attribute: <%= request.getMethod()%> </p>

<h2> EL/ Expression Language</h2>
<p>"name" parameter: ${param["name"]}</p>
<h1> The current count is <%= count %></h1>

<p> ${"2.2 + 2.2"}</p>

<% request.setAttribute("numbers", new int[]{222,777,21,7,14,3});%>

<ul>
    <c:forEach items="${numbers}" var="number">
        <li>${number}</li>
    </c:forEach>
</ul>
<% request.setAttribute("five", 5); %>
  <c:choose>
      <c:when test="${number < 3}">
          <p>Expression 1 is true</p>
      </c:when>
      <c:when test="${number > 6}">
          <p>Expression 2 is false</p>
      </c:when>
      <c:otherwise>
          <p>Both expressions are false</p>
      </c:otherwise>
  </c:choose>
</body>
</html>
