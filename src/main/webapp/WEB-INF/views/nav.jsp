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
        <a class="col" href="/p/panier">QVASILLVM</a>
        <span class="col"> | </span>
        <form method="post" action="/logout" style="display: inline;">
            <input type="hidden"
                   name="${_csrf.parameterName}"
                   value="${_csrf.token}" />
            <button type="submit"
                    style="background:none; border:none; padding:0; color:inherit; text-decoration:underline; cursor:pointer; font:inherit;">
                DEC
            </button>
        </form>
    </sec:authorize>
</nav>
<hr />