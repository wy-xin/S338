<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${pageInfo.list}" var="account">
        ${account.name} <br/>
    </c:forEach>

    <c:forEach begin="1" end="${pageInfo.pages}" step="1" var="currentPage">
        <a href="">第${currentPage}页</a>
    </c:forEach>

    <br/>

    当前页：${pageInfo.pageNum} <br/>
    总记录数：${pageInfo.total} <br/>
    总页数：${pageInfo.pages} <br/>
    导航页码数：${pageInfo.navigatePages} <br/>

    <c:forEach begin="1" items="${pageInfo.navigatepageNums}" var="currentPage">
        <a href="${pageContext.request.contextPath}/queryAllByPage?currentPage=${currentPage}">第${currentPage}页</a>
    </c:forEach>
</body>
</html>
