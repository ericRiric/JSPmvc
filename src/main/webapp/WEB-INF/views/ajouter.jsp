<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>ADDERE</title>
</head>
<%@include file="nav.jsp"%>
<body>
<h1>MERCEM ADDERE</h1>
<form method="post" action="/ajouter">
    <%@include file="form.jsp"%>
    <div>
        <button type="submit">Addere</button>
    </div>
</form>
</body>
<%@include file="foot.jsp"%>
</html>
