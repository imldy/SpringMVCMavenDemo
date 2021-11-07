<%--
  Created by IntelliJ IDEA.
  User: imldy
  Date: 2021/11/7
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RESTful 测试</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
    </script>
    <script type="text/javascript">
        function search() {
            var id = $("#number").val();
            $.ajax({
                url: "${pageContext.request.contextPath}/user/" + id,
                type: "get",
                // 定义回调响应的数据格式为JSON字符串，该属性可忽略
                dataType: "json",
                success: function (data) {
                    if (data.username != null) {
                        alert("您查询的用户是" + data.username);
                    } else {
                        alert("未找到用户" + id);
                    }
                }
            });
        }
    </script>
</head>
<body>
<form>
    编号:<input type="text" name="number" id="number">
    <input type="button" value="搜索" onclick="search()">
</form>
</body>
</html>
