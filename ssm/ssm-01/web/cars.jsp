<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>汽车列表</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
    <h2 align="center">汽车列表</h2>
    <table class="table table-striped">
        <thead>
            <th>汽车编号</th>
            <th>汽车名称</th>
            <th>汽车颜色</th>
            <th>汽车价格</th>
            <th>操作</th>
        </thead>
        <tbody>
            <c:choose>
                <c:when test="${requestScope.cars == null or requestScope.cars.size() == 0}">
                    <tr>
                        <td align="center" colspan="5">没有任何记录</td>
                    </tr>
                </c:when>
                <c:otherwise>
                    <c:forEach items="${requestScope.cars}" var="car">
                        <tr>
                            <td>${car.cno}</td>
                            <td>${car.cname}</td>
                            <td>${car.color}</td>
                            <td>${car.price}</td>
                            <td>
                                <a href="">编辑</a>
                                <a href="">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </tbody>
    </table>
</body>
</html>
