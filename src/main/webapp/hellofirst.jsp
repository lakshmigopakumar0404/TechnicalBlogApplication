<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.*" %>
<%@ page import="helpperClasses.helpperstart" %>
<!DOCTYPE html>
<html>
<head>
    <title> Lakshmi's title</title>
</head>
<body>
<p>Hellow World JSP!!</p>
<p> My first Name is :</p>
    <p><%= new helpperstart().kuttappi("First Name")%></p>
<p> My Last Name is :</p>
<p><%= new helpperstart().kuttappi("Last Name")%></p>
</body>
</html>
