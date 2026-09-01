<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri ="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>MUTARE</title>
</head>
<%@include file="nav.jsp"%>
<body>
<h1>MERCEM MUTARE</h1>
<c:set var="produit" value="${produit}" />
<form method="post" action="/modifier/${produit.getNoProduit()}">
    <%@include file="form.jsp"%>
    <div>
        <button type="submit">Mutare</button>
    </div>
</form>
</body>
<%@include file="foot.jsp"%>
</html>
