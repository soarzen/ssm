<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script>
        $(function() {
            $("#btn").click(function() {
                $("#addbox").append('<dd>员工名称：<input name="ename" required="required">,员工工资<input name="sal" equired="required"/><input type="button" value="x" class="delete-btn"/> </dd>');

                $(".delete-btn:last").click(function() {
                    $(this).parent().remove();
                })
            })
        });
    </script>
</head>
<body>
    <form action="saveDept" method="post">
        <dl id="addbox">
            <dt>
                <button>保存</button>
                <input type="button" value="增加员工" id="btn"/>
            </dt>
            <dt>
                部门名称：<input name="dname" />
                部门位置：<input name="loc" />
            </dt>
            <dt>

                <dd>员工名称：<input name="ename">,员工工资<input name="sal"/></dd>

            </dt>
        </dl>

    </form>

    <a href="deptList.jsp">查询列表</a>
</body>
</html>
