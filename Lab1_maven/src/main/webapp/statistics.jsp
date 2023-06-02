<%-- 
    Document   : statistics
    Created on : Dec 28, 2022, 18:23:13 AM
    Author     : Vladyslav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students Statistics</title>
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
        <h1>Statistics</h1>
        <table>
                <tbody>
                    <tr>
                        <td><label for="name">Mean Age:</label></td>
                        <td>${stat.getMeanAge()}</td>
                    </tr>
                    <tr>
                        <td><label for="surname">Popular mail domain:</label></td>
                        <td>${stat.getPopularMailDomain()}</td>
                    </tr>
                </tbody>
            </table>
    </body>
</html>
