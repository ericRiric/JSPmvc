<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>NOMEN IMPONERE</title>
</head>
<%@include file="../nav.jsp"%>
<body>
<h1>Nomen imponere</h1>
<form:form modelAttribute="user" method="post" action="/u/register">
    <div>
        <form:label path="username">Nomen usoris</form:label>
        <form:input path="username" type="text" id="username" />
    </div>
    <div>
        <form:label path="password">Tessera</form:label>
        <form:input path="password" type="text" id="password" />
    </div>
    <div>
        <form:button type="submit">Imponere</form:button>
    </div>
</form:form>
</body>
<%@include file="../foot.jsp"%>
</html>
