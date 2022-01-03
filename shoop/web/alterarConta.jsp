<%-- 
    Document   : alterarConta
    Created on : 02/01/2022, 22:13:22
    Author     : PATOLINODD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="/loja" var="loja"/>
<c:url value="/alterarCadastro" var="alterar"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/cores.css"/>
        <link rel="stylesheet" href="./css/index/index.css"/>
        <title>Alterar Conta</title>
        <style>
            header{
                display: flex;
                justify-content: space-around;
                align-items: center;
                margin: auto;
                padding: auto;
            }
            form{
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
            }
        </style>
    </head>
    <body>
        <header>
            <h2><a href="${loja}">Loja</a></h2>
            <h1>Alterar cadastro de usuario</h1>
        </header>
            <form action="${alterar}" method="post">
                <label>NOME:</label>
                <input type="text" name="nome" value="${usuario.nome}"/>
                <label>EMAIL:</label>
                <input type="text" name="email" value="${usuario.email}"/>
                <label>SENHA:</label>
                <input type="password" name="senha" value="${usuario.senha}"/>
                <input type="hidden" name="id" value="${usuario.id}"/>
                <input type="submit" value="alterar"/>
            </form>
    </body>
</html>
