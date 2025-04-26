<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%= new java.util.Date() %>
<%         for (int i = 0; i < 5; i++) {
               out.println("<p>" + i + "</p>");
           } %>
</body>
</html>