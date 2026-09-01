<%@ page import="com.example.demo.models.Produit" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Merces</title>
</head>
<%@include file="nav.jsp"%>
<body>
    <h1>Merces</h1>
    <c:set var="produits" value="${produits}" />
    <c:if test="${produits != null}">
        <ul>
            <c:forEach items="${produits}" var="produit">
                <li><c:out value="${produit.getNom()}" /> - <c:out value="${produit.getPrix()}" />$ <c:out value="${produit.getTaxable() ? '+ taxes' : ''}" /> (Qté: <c:out value="${produit.getQuantite()}" />)</li>
            </c:forEach>
        </ul>
    </c:if>
</body>
<%@include file="foot.jsp"%>
</html>