<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <form:label path="nom">Mercis nomen</form:label>
    <form:input path="nom" type="text" id="nom" />
</div>

<div>
    <form:label path="prix">Mercis pretium</form:label>
    <form:input path="prix" type="number" id="prix" min="0" step="0.01" />
</div>

<div>
    <form:label path="quantite">Mercis quantitas</form:label>
    <form:input path="quantite" type="number" id="quantite" min="1" />
</div>

<div>
    <form:label path="taxable">Indicaturamne habet?</form:label>
    <form:checkbox path="taxable" id="taxable" />
</div>
