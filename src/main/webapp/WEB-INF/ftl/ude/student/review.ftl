<#-- @ftlvariable name="user" type="eu.kielczewski.example.domain.User" -->
<#-- @ftlvariable name="student" type="eu.kielczewski.example.domain.edu.student.Student" -->
<#-- @ftlvariable name="view" type="eu.kielczewski.example.domain.edu.student.view.semester.StudentsSemestersFullView" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Student review</title>
</head>
<body>
<#include "/part/header.ftl">

<#--<div class="container border border-secondary rounded" style="max-width: 90% !important; width: 85%;">-->
<#---->
<#--    <h2 class="lw">8 семестр 2019</h2>-->
<#---->
<#--    <table class="table table-bordered">-->
<#--        <thead>-->
<#--        <tr>-->
<#--            <th scope="col">Предмет</th>-->
<#--            <th scope="col" colspan="19">-->
<#--                <div>-->
<#--                    Неделя-->
<#--                </div>-->
<#--            </th>-->
<#--            <th scope="col">Посещения</th>-->
<#--            <th scope="col" colspan="1">Выполнено</th>-->
<#--            <th scope="col">Рейтинг</th>-->
<#--            <th scope="col">Результат</th>-->
<#--        </tr>-->
<#--        </thead>-->
<#--        <tbody>-->
<#--        <tr>-->
<#--            <th scope="row" colspan="1"></th>-->
<#--            <td colspan="1">1</td>-->
<#--            <td colspan="1">2</td>-->
<#--            <td colspan="1">3</td>-->
<#--            <td colspan="1">4</td>-->
<#--            <td colspan="1">5</td>-->
<#--            <td colspan="1">6</td>-->
<#--            <td colspan="1">7</td>-->
<#--            <td colspan="1">8</td>-->
<#--            <td colspan="1">9</td>-->
<#--            <td colspan="1">10</td>-->
<#--            <td colspan="1">11</td>-->
<#--            <td colspan="1">12</td>-->
<#--            <td colspan="1">13</td>-->
<#--            <td colspan="1">14</td>-->
<#--            <td colspan="1">15</td>-->
<#--            <td colspan="1">16</td>-->
<#--            <td colspan="1">17</td>-->
<#--            <td colspan="1">18</td>-->
<#--            <td colspan="1">19</td>-->
<#--            <td colspan="1"></td>-->
<#--            <td colspan="1"></td>-->
<#--            <td colspan="1"></td>-->
<#--            <td colspan="1"></td>-->
<#--        </tr>-->
<#--        <tr>-->
<#--            <th scope="row">Методы и алгоритмы обработки изображений</th>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Посещено занятий 2/4"-->
<#--                data-content="оценки: л.р-1 8, л.р-2 9, л.р-3 6">-->
<#--                <div>-->
<#--                    <p class="bg-warning">2/4</p>-->
<#--                    <p class="table-warning">8</p>-->
<#--                    <p class="btn-warning">9</p>-->
<#--                    <p class="text-warning">10</p>-->
<#--                    <p class="bg-warning text-light">7</p>-->
<#--                    <p class="alert-warning">6</p>-->
<#--                </div>-->
<#--            </td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> md2o</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> md3o</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> m4do</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> 5mdo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> m7do</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">gg</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">9</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">46/180</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">4/12</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">-->
<#--                7-->
<#--            </td>-->
<#--            <td class="table-success">Зачет</td>-->
<#--        </tr>-->
<#--        <tr>-->
<#--            <th scope="row">Разработка веб приложений</th>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Посещено занятий 2/4"-->
<#--                data-content="оценки: л.р-1 8, л.р-2 9, л.р-3 6">-->
<#--                <div>-->
<#--                    <p class="bg-warning">2/4</p>-->
<#--                    <p class="table-warning">8</p>-->
<#--                </div>-->
<#--            </td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> md2o</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> md3o</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> m4do</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> 5mdo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> m7do</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">5</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?"> mo</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">30/90</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">0/7</td>-->
<#--            <td data-toggle="popover" data-trigger="hover" title="Dismissible popover" data-content="And?">-->
<#--                0-->
<#--            </td>-->
<#--            <td class="table-warning">7</td>-->
<#--        </tr>-->
<#--        </tbody>-->
<#--    </table>-->
<#---->
<#--    <table class="table table-bordered">-->
<#--        <thead>-->
<#--        <tr>-->
<#--            <th scope="col"></th>-->
<#--            <th scope="col" colspan="1">-->
<#--                <div>-->
<#--                    Тип-->
<#--                </div>-->
<#--            </th>-->
<#--            <th scope="col">Результат</th>-->
<#--        </tr>-->
<#--        </thead>-->
<#--        <tbody>-->
<#--        <tr>-->
<#--            <th scope="row">Методы и алгоритмы обработки изображений</th>-->
<#--            <td>Курсовая работа</td>-->
<#--            <td class="table-success">8</td>-->
<#--        </tr>-->
<#--        <tr>-->
<#--            <th scope="row">Разработка веб приложений</th>-->
<#--            <td>Курсовая работа</td>-->
<#--            <td class="table-warning">7</td>-->
<#--        </tr>-->
<#--        <tr>-->
<#--            <th scope="row">Преддипломная практика</th>-->
<#--            <td colspan="1"></td>-->
<#--            <td class="table-success">9</td>-->
<#--        </tr>-->
<#--        </tbody>-->
<#--    </table>-->
<#--</div>-->
<#---->
<#--<p class="text-primary">table text bg btn alert</p>-->
<#--<p class="text-primary">.text-primary</p>-->
<#--<p class="text-secondary">.text-secondary</p>-->
<#--<p class="text-success">.text-success</p>-->
<#--<p class="text-danger">.text-danger</p>-->
<#--<p class="text-warning">.text-warning</p>-->
<#--<p class="text-info">.text-info</p>-->
<#--<p class="text-light bg-dark">.text-light</p>-->
<#--<p class="text-dark">.text-dark</p>-->
<#--<p class="text-muted">.text-muted</p>-->
<#--<p class="text-white bg-dark">.text-white</p>-->
<#--<a href="#" title="Header" data-toggle="popover" data-content="Some content">Click Me</a><br>-->
<#--<a href="#" title="Header" data-toggle="popover" data-trigger="hover" data-content="Some content">Hover over me</a>-->

<#--<p class="text-muted">${view.student.lastName}</p>-->

<div class="container bootstrap snippet">
    <div class="row">
        <div class="col-sm-10">
            <h1><a href="/student/${view.student.studentId}">Карточка</a></h1></div>

    </div>
    <div class="row">
        <div class="col-sm-3">
            <!--left col-->
            <ul class="list-group">
                <li class="list-group-item text-muted">Учащийся</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Имя</strong></span> ${view.student.firstName}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Фамилия</strong></span> ${view.student.lastName}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Окончание обучения</strong></span> ${view.student.startDate}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Начало обучение</strong></span> ${view.student.finishDate}</li>
            </ul>
        </div>
    </div>
</div>

<#list view.semesters as semester>
    <div class="container border border-secondary rounded" style="max-width: 90% !important; width: 85%;">

        <h2 class="lw">${semester.title}</h2>

        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">Предмет</th>
                <th scope="col" colspan="${semester.getSubjectNames()!?first.subject.weeks!?size}">
                    <div>
                        Неделя
                    </div>
                </th>
                <th scope="col">Посещения</th>
                <th scope="col" colspan="1">Выполнено</th>
                <th scope="col">Рейтинг</th>
                <th scope="col">Результат</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row" colspan="1"></th>
                <#assign x=semester.getSubjectNames()!?first.subject.weeks!?size>
                <#list 1..x as i>
                    <td colspan="1">${i}</td>
                </#list>
                <td colspan="1"></td>
                <td colspan="1"></td>
                <td colspan="1"></td>
                <td colspan="1"></td>
            </tr>
            <#list semester.getSubjectNames() as subject>
                <tr>
                    <th scope="row">${subject.name}</th>
                    <#assign allAttended = 0>
                    <#assign allTotal = 0>
                    <#list subject.subject.weeks as week>
                        <#assign allAttended = allAttended + week.attendedClasses>
                        <#assign allTotal = allTotal + week.totalClasses>
                        <td data-toggle="popover" data-trigger="hover" title="Посещено занятий ${week.attendedClasses}/${week.totalClasses}"
                            data-content="
                            <#if week.getCompleted()??>
                                оценки: ${week.getCompleted()}
                            </#if>
                        ">
                            <div>
                                <#assign classesStyle="btn-success">
                                <#if week.attendedClasses != week.totalClasses>
                                    <#assign classesStyle="btn-warning">
                                </#if>
                                <p class="${classesStyle}">${week.attendedClasses}/${week.totalClasses}</p>
                                <#assign mark = week.getCompletedStr()>
                                <p class="bg-warning text-light">${mark}</p>
                            </div>
                        </td>
                    </#list>
                    <td data-toggle="popover" data-trigger="hover"
                        title="Dismissible popover" data-content="And?">${allAttended}/${allTotal}
                    </td>
                    <td>${subject.subject.completed}</td>
                    <#assign rating = subject.subject.rating>
                    <#assign ratingClass = "table-danger">
                    <#if (rating >= 6) >
                        <#assign ratingClass = "table-warning">
                    </#if>
                    <#if (rating >= 8) >
                        <#assign ratingClass = "table-success">
                    </#if>
                    <td class="${ratingClass}">${rating}</td>
                    <td class="table-success">${subject.subject.result}</td>
                </tr>

            </#list>
            </tbody>
        </table>

        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col"></th>
                <th scope="col" colspan="1">
                    <div>Тип</div>
                </th>
                <th scope="col">Результат</th>
            </tr>
            </thead>
            <tbody>
            <#list semester.additionalTermsNames as additionalTermsName>
                <tr>
                    <th scope="row">${additionalTermsName.name}</th>
                    <td>${additionalTermsName.type?if_exists}</td>
                    <#assign rating = additionalTermsName.additionalTermsDataView.result>
                    <#assign ratingClass = "table-danger">
                    <#if (rating == "6" || rating == "7") >
                        <#assign ratingClass = "table-warning">
                    </#if>
                    <#if (rating == "8" || rating == "9" || rating == "10" || rating.toLowerCase() == "зачет") >
                        <#assign ratingClass = "table-success">
                    </#if>
                    <td class="${ratingClass}">${rating}</td>
                </tr>
            </#list>
            </tbody>
        </table>
    </div>
</#list>

<#include "/part/footer.ftl">
<script>
    $(document).ready(function () {
        $('[data-toggle="popover"]').popover({
            container: 'body'
        });
    });
</script>
</body>
</html>