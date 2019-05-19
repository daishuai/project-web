<%--
  Created by IntelliJ IDEA.
  User: daishuai
  Date: 2018/4/11
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%--isELIgnored的值取决于web应用部署描述符的版本。使用Servlet2.4的描述符的JSP页面默认是解析EL表达式，即表达式有效。这默认提供了大
部分应用想要的情况。而使用Servlet2.3或者更早的描述符的JSP页面默认是忽略EL表达式的，即不解析EL表达式，这样就提供了向后兼容性。--%>
<html>
<head>
    <title>欢迎页</title>
</head>
<body>
<h2>Spring MVC 配置成功！！！！！</h2>
<h2>${QUERYT_NAME}</h2>
</body>
</html>
