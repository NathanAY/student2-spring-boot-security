<#-- @ftlvariable name="user" type="eu.kielczewski.example.domain.User" -->
<#-- @ftlvariable name="student" type="eu.kielczewski.example.domain.edu.student.Student" -->
<#-- @ftlvariable name="groupView" type="eu.kielczewski.example.domain.edu.student.view.GroupView" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Student review</title>
</head>
<body>
<#include "/part/header.ftl">

<div class="container">
    <table id="example" class="table table-striped table-bordered"
            <#--       style="width:100%"-->
    >
        <thead>
        <tr>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>id факультета</th>
            <th>id специальности</th>
            <th>Начало обучения</th>
            <th>Окончание обучения</th>
        </tr>
        </thead>
        <tbody>
        <#list groupView.students as student>
            <tr>
                <td><a href="/student/${student.studentId}">${student.firstName}</a></td>
                <td>${student.lastName}</td>
                <td>${student.facultyId}</td>
                <td>${student.specialityId}</td>
                <td>${student.startDate}</td>
                <td>${student.finishDate}</td>
            </tr>
        </#list>

        </tbody>
        <tfoot>
        <tr>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>id факультета</th>
            <th>id специальности</th>
            <th>Начало обучения</th>
            <th>Окончание обучения</th>
        </tr>
        </tfoot>
    </table>

</div>

<#include "/part/footer.ftl">
<script>
    $(document).ready(function () {
        $('#example').DataTable();
    });
</script>
</body>
</html>