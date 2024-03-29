<%-- 
    Document   : listed
    Created on : 14 янв. 2023 г., 01:38:01
    Author     : Vladyslav
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students List</title>
        <style>
            h1{
                text-align: center;
            }
            #page {
                width: 800px;
                margin: auto;
            }
            form {
                width: 400px;
                margin: 20px auto;
            }
            input[type=submit] {
                margin: auto;
            }
            .list, .list td, .list th {
                margin: auto;
                border: 1px solid black;
                border-collapse: collapse;
            }
            .list td, .list th {
                padding:10px;
            }
        </style>
    </head>
    <body>
        <h1>Grouped by ${filter}</h1>
        <div id="content">
        <c:if test="${filtered.size() > 0}">
            <table class="list">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Surname</th>
                </tr>
                <c:forEach var="student" items="${filtered}">
                    <tr>
                        <td><c:out value="${student.getDoc().getId()}"/></td>
                        <td><c:out value="${student.getName()}"/></td>
                        <td><c:out value="${student.getSurname()}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </div>
    </body>
</html>
