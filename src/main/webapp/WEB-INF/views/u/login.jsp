<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>NOMEN DARE</title>
</head>
<%@include file="../nav.jsp"%>
<body>
<h1>Nomen dare</h1>
<a href="register">Sibi nomen imponere?</a>
<form:form modelAttribute="user" method="post" action="/u/login">
    <div>
        <form:label path="nom">Nomen usoris</form:label>
        <form:input path="nom" type="text" id="nom" />
    </div>
    <div>
        <form:label path="passwd">Tessera</form:label>
        <form:input path="passwd" type="text" id="passwd" />
    </div>
    <div>
        <form:button type="submit">Dare</form:button>
    </div>
</form:form>
</body>
<%@include file="../foot.jsp"%>
</html>