<%-- 
    Document   : msgErro
    Created on : 02/01/2022, 13:06:27
    Author     : PATOLINODD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/cores.css"/>
        <link rel="stylesheet" href="./css/index/index.css"/>
        <title>msgErro</title>
        <style>
            div{
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
                margin-top: calc(100vh / 3);
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Oops!</h1>
            <p>${msgErro}</p>
        </div>
    </body>
</html>
