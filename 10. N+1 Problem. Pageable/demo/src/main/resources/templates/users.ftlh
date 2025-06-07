<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
</head>
<body>
<#list users as user>
    ${user.id}
    ${user.email}
    ${user.firstName}
    ${user.lastName}
    <br>
</#list>
</body>
</html>