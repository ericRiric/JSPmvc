<nav class="row">
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <a class="col" href="/">DOMUM</a>
    <span class="col"> | </span>
    <a class="col" href="/ajouter">ADDERE</a>

    <sec:authorize access="isAnonymous()">
        <span class="col"> | </span>
        <a class="col" href="/u/login">NOMEN DARE</a>
        <span class="col"> | </span>
        <a class="col" href="/u/register">NOMEN IMPONERE</a>
    </sec:authorize>

    <sec:authorize access="isAuthenticated()">
        <span class="col"> | </span>
        <form method="post" action="/logout">
            <input type="hidden"
                   name="${_csrf.parameterName}"
                   value="${_csrf.token}"/>
            </form>
            <button type="submit">DEC</button>
        </form>
    </sec:authorize>
</nav>
<hr />