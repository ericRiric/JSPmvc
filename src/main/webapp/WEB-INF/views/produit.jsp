<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MERCES</title>
</head>
<%@include file="nav.jsp"%>
<body>
    <h1>MERCES</h1>
    <c:set var="produits" value="${produits}" />
    <c:if test="${produits != null}">
        <ul>
            <c:forEach items="${produits}" var="produit">
                <li>
                    <c:out value="${produit.getNom()}" /> -
                    <c:out value="${produit.getPrix()}" />$
                    <c:out value="${produit.getTaxable() ? '+ indicatura' : ''}" />
                    (Qta: <c:out value="${produit.getQuantite()}" />) |
                    <a href="/modifier/${produit.getNoProduit()}">Mutare</a> -
                    <form method="post" action="/supprimer/${produit.getNoProduit()}" style="display: inline">
                        <a href="#" onclick="this.closest('form').requestSubmit(); return false;">Rumpere</a>
                    </form>
                </li>
            </c:forEach>
        </ul>
    </c:if>
</body>
<%@include file="foot.jsp"%>
</html>