<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:forEach items="${myList}" var="element">
  <tr>
    <td>${element.name}</td>
    <td>${element.surname}</td>
  </tr>
</c:forEach>
</body>
</html>