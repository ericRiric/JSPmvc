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
<form method="post" action="/produit/ajouter">
    <div>
        <label for="noProduit">Mercis numerus</label>
        <input type="number" id="noProduit" name="noProduit" min="1" />
    </div>

    <div>
        <label for="nom">Mercis nomen</label>
        <input type="text" id="nom" name="nom" />
    </div>

    <div>
        <label for="prix">Mercis pretium</label>
        <input type="number" id="prix" name="prix" min="0" step="0.01" />
    </div>

    <div>
        <label for="quantite">Mercis quantitas</label>
        <input type="number" id="quantite" name="quantite" min="1" />
    </div>

    <div>
        <label for="taxable">Indicaturamne habet?</label>
        <input type="checkbox" id="taxable" name="taxable" />
    </div>

    <div>
        <button type="submit">Addere</button>
    </div>
</form>
</body>
<%@include file="foot.jsp"%>
</html>
