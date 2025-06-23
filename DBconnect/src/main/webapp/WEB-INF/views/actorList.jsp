
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Actor List</title>
</head>
<body>
<h1>영화별 배우들 목록 보기</h1>
<table class="table table-hover">
    <tbody>
    <%--  JSTL : 자바의 여러 기본 문법들을 코딩할 때 tag로 쓸 수 있는 기능  --%>
    <%-- taglib 지시자가 상단에 있어야 사용가능--%>
    <c:forEach var="actor" items="${list}">
        <tr>
            <td>${actor}</td>
<%--            <td>--%>
<%--                <a href="get?no=${board.no}">${board.title}</a>--%>
<%--            </td>--%>
<%--            <td>${board.writer}</td>--%>
<%--            <td>--%>
<%--                <fmt:formatDate pattern="yyyy-MM-dd" value="${board.regDate}"/>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
