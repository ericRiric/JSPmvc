package com.example.demo.controllers;

import java.io.*;
import java.util.ArrayList;

import com.example.demo.models.Produit;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "produitServ", value = "/produitServ")
public class ProduitServlet extends HttpServlet {
    ArrayList<Produit> produits = new ArrayList<>();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        produits.add(new Produit(
                0,
                "Goonoid",
                10.99,
                5,
                false
        ));
        produits.add(new Produit(
                1,
                "Goon",
                20.99,
                12,
               true
        ));

        request.setAttribute("produits", produits);
        request.getRequestDispatcher("/produit.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
