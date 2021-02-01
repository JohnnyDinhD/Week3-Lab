<%-- 
    Document   : arithmeticCalculator
    Created on : Jan 30, 2021, 11:51:44 AM
    Author     : 792268
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstnum" value="${firstnum}"><br>
            Second: <input type="text" name="secondnum" value="${secondnum}"><br>
            <input type="submit" value="+">
            <input type="submit" value="-">
            <input type="submit" value="*">
            <input type="submit" value="%"><br>
            
            Result:<p>${invalidmsg}</p>
            <a href="age">Age Calculator</a>

        </form> 
    </body>
</html>
