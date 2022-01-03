<%-- 
    Document   : default
    Created on : 30/12/2021, 01:48:22
    Author     : PATOLINODD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="/filtrarPesquisa" var="pesquisar"/>
<c:url value="/login.jsp" var="cadastrarUsuario"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/cores.css"/>
        <link rel="stylesheet" href="./css/index/index.css"/>
        <link rel="stylesheet" href="./css/index/conteudo.css"/>
        <link rel="stylesheet" href="./css/index/nav.css"/>
        <title>Loja de Produtos</title>
    </head>
    <body>
        <header><nav>
           <h1>Loja</h1>
               <form action="${pesquisar}" method="get">
                   <input id="pesquisa" type="text" name="pesquisar"/><input type="submit"/>
               </form>
                   <button><a href="${cadastrarUsuario}">ENTRAR</a></button>
        </nav></header>
        <main>conteudo</main>
        <footer>todos os direitos reservados</footer>
    </body>
</html>
