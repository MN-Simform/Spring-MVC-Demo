<%@ page language = "java" contentType = "text/html; charset=UTF-8" pageEncoding = "UTF-8" %>
<!DOCTYPE html>
<head>
    <title>Jsp Login Page</title>
</head>
<body>
    <form action = "/login" method = "post">
    <table>
    <tr>
        <td><label>Enter Username : </label></td>
        <td><input type = "text" name = "name" /></td>
    </tr>
    <tr>
        <td><label>Enter Password : </label></td>
        <td><input type = "password" name = "password" /></td>
    </tr>
    <tr>
        <td colspan = "2"><input type = "submit" value = "Submit" /></td>
    </tr>
    </form>
    <p style = "color : red;">${errMessage}</p>
</body>
</html>