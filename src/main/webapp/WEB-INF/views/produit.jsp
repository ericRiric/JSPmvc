<%@ page import="com.example.demo.models.Produit" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 2467672
  Date: 2026-08-25
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Merces</title>
</head>
<body>
    <h1>Merces</h1>
    <% ArrayList<Produit> produits = (ArrayList<Produit>) request.getAttribute("produits");
      if (produits != null) { %>
        <ul>
        <% for (Produit produit : produits) { %>
          <li><%= produit.Nom %> - <%= produit.Prix %>$ <%= produit.Taxable ? "+ taxes" : ""  %> (Qté: <%= produit.Quantite %>)</li>
        <% } %>
        </ul>
      <% } %>
</body>
</html>
