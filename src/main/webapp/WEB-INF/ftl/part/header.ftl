<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="currentUser" type="eu.kielczewski.example.domain.CurrentUser" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "/css/header.html">
    <#--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
    <#--    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>-->
    <#--    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
    <#--    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>-->
    <link rel="stylesheet" href="http://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="http://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <#--    <link type="text/css" media="screen" href="./css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="./head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="./head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="../head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="../static/css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="/static/css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="static/css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="/css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="./css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="./static/css/head.css" rel="stylesheet" />-->
    <#--    <link type="text/css" media="screen" href="../static/css/head.css" rel="stylesheet" />-->
</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
    <#--    <h5 class="my-0 mr-md-auto font-weight-normal" style="font-size: large">UNIVER.BY</h5>-->
    <img class="my-0 mr-md-auto font-weight-normal"
         src="https://static1.squarespace.com/static/58f758d0893fc0eeb1eda84c/t/58f8da58b3db2b5ad6c6af45/1545138026311/?format=1500w"
         style="height: 30px" alt="UNIVER.BY">
    <nav class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark btn btn-outline-light" href="/">Просмотр</a>
        <#if currentUser??>
        <a class="p-2 text-dark btn btn-outline-light" href="/review/${currentUser.id}">Обзор</a>
        </#if>
        <a class="p-2 text-dark btn btn-outline-light" href="#">Помощь</a>
    </nav>
    <#if !currentUser??>
        <a class="btn btn-outline-secondary" href="/login">Войти</a>
    </#if>
    <#if currentUser??>
        <a class="p-2 text-dark btn btn-outline-light" href="/user/${currentUser.id}">Мой аккаунт</a>
        <form action="/logout" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <button class="btn btn-outline-primary" href="#" type="submit">Выйти</button>
        </form>
    </#if>
</div>
</body>
</html>