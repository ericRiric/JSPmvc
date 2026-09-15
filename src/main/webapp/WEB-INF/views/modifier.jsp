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
<form:form method="post" action="/modifier/${produit.getNoProduit()}" modelAttribute="produit">
    <%@include file="form.jsp"%>
    <div>
        <form:button type="submit">Mutare</form:button>
    </div>
</form:form>
</body>
<%@include file="foot.jsp"%>
</html>
