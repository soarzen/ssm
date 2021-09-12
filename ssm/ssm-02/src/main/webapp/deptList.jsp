<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script>
        $(function () {
            $.post('deptList',{},function(depts) {
                console.log(depts);
                for(var i = 0; i < depts.length; i++) {
                    var dept = depts[i];
                    $('#showBox').append('<dt>'+dept.dname+'</dt>');
                    for (var j = 0; j < dept.emps.length; j++) {
                        var emp = dept.emps[j];
                        $('#showBox').append('<dd>'+emp.ename+','+emp.sal+'</dd>');
                    }
                }
            },'json');
        });
    </script>
</head>
<body>
    <h2>部门列表</h2>
    <dl id="showBox">

    </dl>
</body>
</html>
