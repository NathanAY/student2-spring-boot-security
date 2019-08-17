<#ftl encoding="utf-8">
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="form" type="eu.kielczewski.example.domain.UserCreateForm" -->

<#import "/spring.ftl" as spring>

<!DOCTYPE html>
<#--<html lang="ru" xmlns="http://www.w3.org/1999/xhtml">-->
<html lang="ru">
<head>
<#--    <meta charset="utf-8">-->
<#--    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />-->
    <meta charset="UTF-8"/>
<#--    <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">-->
<#--    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />-->

    <title>Create a new user</title>
</head>
<body>
<nav role="navigation">
    <ul>
        <li><a href="/">Home</a></li>
    </ul>
</nav>

<h1>Create a new user</h1>

<form role="form" name="form" action="" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

    <div>
        <label for="email">Email address</label>
<#--        <input type="email" name="email" id="email" value="${form.email}" required autofocus/>-->
        <input type="email" name="email" id="email" value="sdf@ssd" required autofocus/>
    </div>
    <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password" value="ыва" required/>
    </div>
    <div>
        <label for="passwordRepeated">Repeat</label>
        <input type="password" name="passwordRepeated" id="passwordRepeated" value="1" required/>
    </div>
    <div>
        <label for="role">Role</label>
        <select name="role" id="role" required>
            <option <#if form.role == 'USER'>selected</#if>>USER</option>
            <option <#if form.role == 'ADMIN'>selected</#if>>ADMIN</option>
        </select>
    </div>
    <button type="submit">Save</button>
</form>

<@spring.bind "form" />
<#if spring.status.error>
<ul>
    <#list spring.status.errorMessages as error>
        <li>${error}</li>
    </#list>
</ul>
</#if>

</body>
</html>