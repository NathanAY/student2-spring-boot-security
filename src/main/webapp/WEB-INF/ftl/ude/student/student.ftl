<#-- @ftlvariable name="user" type="eu.kielczewski.example.domain.User" -->
<#-- @ftlvariable name="student" type="eu.kielczewski.example.domain.edu.student.Student" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Student details</title>
</head>
<body>

<#include "/part/header.ftl">

<div class="container bootstrap snippet">
    <div class="row">
        <div class="col-sm-10">
            <h1><a href="/review/${student.studentId}">Успеваемость</a></h1></div>
        <div class="col-sm-2">
            <a href="/users" class="pull-right"><img title="profile image" class="img-circle img-responsive" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png"></a>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-3">
            <!--left col-->
            <ul class="list-group">
                <li class="list-group-item text-muted">Учащийся</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Имя</strong></span> ${student.firstName}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Фамилия</strong></span> ${student.lastName}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Окончание обучения</strong></span> ${student.startDate}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Начало обучение</strong></span> ${student.finishDate}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>id группы</strong></span> ${student.groupId}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>id специальности</strong></span> ${student.specialityId}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>id Факультета</strong></span> ${student.facultyId}</li>
            </ul>
        </div>
    </div>
</div>

<#include "/part/footer.ftl">
</body>
</html>