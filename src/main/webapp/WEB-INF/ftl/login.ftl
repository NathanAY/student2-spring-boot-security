<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Log in</title>
</head>
<body>
<#include "/part/header.ftl">

<div class="container" style="max-width: 700px">

    <form class="text-center border border-light p-5" role="form" action="/login" method="post">
        <h5>You can use: demo@localhost / demo</h5>

        <p class="h4 mb-4">Войти</p>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <div>
            <input type="email" name="email" id="email" class="form-control mb-4" placeholder="Логин" required autofocus/>
        </div>
        <div>
            <input type="password" name="password" id="password" class="form-control mb-4" placeholder="Пароль" required/>
        </div>
<#--        <div>-->
<#--            <label for="remember-me">Запомнить меня</label>-->
<#--            <input type="checkbox" name="remember-me" id="remember-me"/>-->
<#--        </div>-->
        <button class="btn btn-info btn-block my-4" type="submit">Войти</button>

        <div class="d-flex justify-content-around">
            <div>
                <!-- Remember me -->
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="defaultLoginFormRemember">
                    <label class="custom-control-label" for="defaultLoginFormRemember">Запомнить меня</label>
                </div>
            </div>
            <div>
                <!-- Forgot password -->
                <a href="">Забыли пароль?</a>
            </div>
        </div>

        <!-- Register -->
        <br><br><p>Нет аккаунта?
            <a href="">Зарегистрируйтесь</a>
        </p><br>

<#--        <!-- Social login &ndash;&gt;-->
<#--        <p>or sign in with:</p>-->

<#--        <a type="button" class="light-blue-text mx-2">-->
<#--            <i class="fab fa-facebook-f"></i>-->
<#--        </a>-->
<#--        <a type="button" class="light-blue-text mx-2">-->
<#--            <i class="fab fa-twitter"></i>-->
<#--        </a>-->
<#--        <a type="button" class="light-blue-text mx-2">-->
<#--            <i class="fab fa-linkedin-in"></i>-->
<#--        </a>-->
<#--        <a type="button" class="light-blue-text mx-2">-->
<#--            <i class="fab fa-github"></i>-->
<#--        </a>-->
        <!-- Terms of service -->
        <p>Нажимая
            <em>зарегистрироваться</em> вы соглашаетесь
            <a href="" target="_blank">с лицензионным соглашением</a>

    </form>

    <#if error.isPresent()>
        <p>The email or password you have entered is invalid, try again.</p>
    </#if>

</div>
<#include "/part/footer.ftl">
</body>
</html>