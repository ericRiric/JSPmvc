<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test="${produit != null}">
        <c:set var="estModif" value="${true}" />
    </c:when>
    <c:otherwise>
        <c:set var="estModif" value="${false}" />
    </c:otherwise>
</c:choose>

<div>
    <label for="noProduit">Mercis numerus</label>
    <input type="number" id="noProduit" name="noProduit" min="0" value="${estModif ? produit.getNoProduit() : ""}" />
</div>

<div>
    <label for="nom">Mercis nomen</label>
    <input type="text" id="nom" name="nom" value="${estModif ? produit.getNom() : ""}" />
</div>

<div>
    <label for="prix">Mercis pretium</label>
    <input type="number" id="prix" name="prix" min="0" step="0.01" value="${estModif ? produit.getPrix() : ""}" />
</div>

<div>
    <label for="quantite">Mercis quantitas</label>
    <input type="number" id="quantite" name="quantite" min="1" value="${estModif ? produit.getQuantite() : ""}"/>
</div>

<div>
    <label for="taxable">Indicaturamne habet?</label>
    <input type="checkbox" id="taxable" name="taxable" ${estModif ? (produit.getTaxable() ? "checked" : "") : ""}/>
</div>
