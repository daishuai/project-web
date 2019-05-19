<%--
  Created by IntelliJ IDEA.
  User: daishuai
  Date: 2019/1/22
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <sf:form method="post" commandName="city">
        id：<sf:input path="id"/><br/>
        name：<sf:input path="name"/><br/>
        countryCode：<sf:input path="countryCode"/><br/>
        district：<sf:input path="district"/><br/>
        population：<sf:input path="population"/><br/>
    </sf:form>
</body>
</html>
