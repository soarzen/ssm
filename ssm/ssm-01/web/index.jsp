<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="importCars" method="post" enctype="multipart/form-data">
        <input type="file" name="excel"/><br/>
        <button>导入</button>
    </form>

    <a href="carList">汽车列表</a>
</body>
</html>
