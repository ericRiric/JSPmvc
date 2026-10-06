<nav class="row">
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <a class="col" href="/">DOMUM</a>
    <span class="col"> | </span>
    <a class="col" href="/ajouter">ADDERE</a>
    <span class="col"> | </span>
    <a class="col" href="/u/login">NOMEN DARE</a>
    <span class="col"> | </span>
    <a class="col" href="/u/register">NOMEN IMPONERE</a>

    <sec:authorize access="isAuthenticated()">
        <span class="col"> | </span>
        <a class="col" href="/logout">DEC</a>
    </sec:authorize>
</nav>