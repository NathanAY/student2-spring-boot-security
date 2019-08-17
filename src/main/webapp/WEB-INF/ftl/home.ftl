<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="currentUser" type="eu.kielczewski.example.domain.CurrentUser" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Home page</title>
</head>
<body>
<#include "/part/header.ftl">
<div id="myCarousel1" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->

    <ol class="carousel-indicators">
        <li data-target="#myCarousel1" data-slide-to="0" class=""></li>
        <li data-target="#myCarousel1" data-slide-to="1" class="active"></li>
        <li data-target="#myCarousel1" data-slide-to="2" class=""></li>
    </ol>
    <div class="carousel-inner">
        <div class="item"> <img src="http://hdqwalls.com/wallpapers/student-study-stress-img.jpg" style="width:100%; height: 700px" alt="First slide">
            <div class="carousel-caption">
                <h1>Образование<br> Спорт &amp; Досуг</h1>
            </div>
        </div>
        <div class="item active"> <img src="https://teenlife.s3.amazonaws.com/media/uploads/blogs/7-study-tips-high-school-students/iStock-495718767.jpg" style="width:100%; height: 700px" alt="Second slide">
            <div class="carousel-caption">
                <h1>Наука<br> Спорт &amp; Досуг</h1>
            </div>
        </div>
        <div class="item"> <img src="https://studyinthestates.dhs.gov/sites/default/files/students.jpg" style="width:100%; height: 700px" alt="Third slide">
            <div class="carousel-caption">
                <h1>Общество<br> Спорт &amp; Досуг</h1>
            </div>
        </div>

    </div>
    <a class="left carousel-control" href="#myCarousel1" data-slide="prev"> <img src="https://img.icons8.com/ios/50/000000/chevron-right-filled.png" style="-webkit-transform: rotate(180deg);"></a>
    <a class="right carousel-control" href="#myCarousel1" data-slide="next"><img src="https://img.icons8.com/ios/50/000000/chevron-right-filled.png"></a>

</div>

<#--<div class="container">-->
<#--    <nav role="navigation">-->
<#--        <ul class="nav flex-column">-->
<#--            <#if !currentUser??>-->
<#--                <li><a href="/login">Log in</a></li>-->
<#--            </#if>-->
<#--            <#if currentUser?? && currentUser.role == "ADMIN">-->
<#--                <li><a href="/user/create">Create a new user</a></li>-->
<#--                <li><a href="/users">View all users</a></li>-->
<#--            </#if>-->
<#--            <li class="nav-item"><a href="/student/1">STUDENT</a></li>-->
<#--            <li><a href="/review/1">review</a></li>-->
<#--            <li><a href="/group/1">group</a></li>-->
<#--        </ul>-->
<#--    </nav>-->
<#--</div>-->


<section class="feature-area">
    <div class="container">
        <div class="row">
            <div class="col-lg-4">
                <div class="single-feature">
                    <div class="title">
                        <h4>Посмотреть последнюю группу</h4>
                    </div>
                    <div class="desc-wrap">
                        <p>
                            Перейти к списку групп. Показывает всех учащихся определенной группы
                        </p>
                        <a href="/group/1">Группы</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="single-feature">
                    <div class="title">
                        <h4>Успеваемость</h4>
                    </div>
                    <div class="desc-wrap">
                        <p>
                            Открыть успеваемость последнего студента. Показывает его успеваемость в текущем семестре и посещения
                        </p>
                        <a href="/review/1">Посмотреть успеваемость</a>
                    </div>
                </div>
            </div>
            <div class="col-lg-4">
                <div class="single-feature">
                    <div class="title">
                        <h4>Посмотреть пользователей</h4>
                    </div>
                    <div class="desc-wrap">
                        <p>
                            Только для админа системы.
                        </p>
                        <a href="/users">Последние пользователи</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>






<#include "/part/footer.ftl">
</body>
</html>