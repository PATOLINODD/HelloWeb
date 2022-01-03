<%-- 
    Document   : loja
    Created on : 31/12/2021, 01:52:03
    Author     : PATOLINODD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="alterarConta" var="alterar"/>
<c:url value="excluirConta" var="excluir"/>
<c:url value="index.jsp" var="inicio"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/cores.css"/>
        <link rel="stylesheet" href="./css/index/index.css"/>
        <link rel="stylesheet" href="./css/loja/dropDownMenu.css"/>
        <title>LOJA</title>
    </head>
    <body>
        <header class="menu">
            <h1>PAGINA DA LOJA</h1> <form><input type="text" name="pesquisa"/><input type="submit"/></form>
            <ul class="menu-item">
                <li class="dropMenu">
                    <span>perfil</span>
                    <ul class="subMenu">
                        <li class="subMenu-item">
                                <a href="${alterar}?id=${usuario.id}">alterar conta</a>
                        </li>
                        <li class="subMenu-item">
                                <a href="${excluir}?id=${usuario.id}">excluir conta</a>
                        </li>
                        <li class="subMenu-item"><a href="${inicio}">sair</a></li>
                    </ul>
                </li>
            </ul>
        </header>
            <p>${usuario.nome}</p>
            <p>${usuario.email}</p>
            <p>${usuario.id}</p>
                        
    </body>
</html>
