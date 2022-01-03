<%-- 
    Document   : login
    Created on : 29/12/2021, 20:33:33
    Author     : PATOLINODD
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="/cadastrarUsuario" var="cadastrarUsuario"/>
<c:url value="/entrar" var="entrar"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/cores.css"/>
        <link rel="stylesheet" href="./css/index/index.css"/>
        <link rel="stylesheet" href="./css/login/login.css"/>
        <title>Login</title>
    </head>
    <body>
        <h1>PAGINA DE CADASTRAR USUARIO</h1>
        <div class="cadastro">
            <button id="entrar">entrar</button>
            <form action="${cadastrarUsuario}" method="post">
                <label>NOME:*</label>
                <input type="text" name="nome"/>
                <label>EMAIL:*</label>
                <input type="email" name="email"/>
                <label>SENHA:*</label>
                <input type="password" name="senha1"/>
                <label>REPITA SENHA:*</label>
                <input type="password" name="senha2"/>
                <input type="submit" value="cadastrar"/>
            </form>
        </div>
        <div class="entrar">
            <button id="cadastrar">CADASTRAR</button>
            <form action="${entrar}" method="post">
                <label>EMAIL:*</label>
                <input type="email" name="email"/>
                <label>SENHA:*</label>
                <input type="password" name="senha"/>
                <input type="submit" value="entrar"/>
            </form>
        </div>
            <script>
                const btn = document.querySelector("#cadastrar");
                btn.onclick = () => {
                    document.querySelector(".cadastro").style.display="flex";
                    document.querySelector(".entrar").style.display="none";
                }
                document.querySelector("#entrar").onclick = () => {
                    document.querySelector(".cadastro").style.display="none";
                    document.querySelector(".entrar").style.display="flex";
                }
                
            </script>
    </body>
</html>
