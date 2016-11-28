<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style></style>
    <!-- jQuery (자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <title>DETAIL</title>
</head>
<body>
<h1>상세페이지</h1>
<table>
    <tr>
        <td>사번</td>
        <td>${dto.sabun}</td>
    </tr>
    <tr>
        <td>이름</td>
        <td>${dto.name}</td>
    </tr>
    <tr>
        <td>날짜</td>
        <td>${dto.nalja}</td>
    </tr>
    <tr>
        <td>금액</td>
        <td>${dto.pay}</td>
    </tr>
    <tr>
        <td colspan="2">
            <a href="edit.do?idx=${dto.sabun}">수 정</a>
            <a href="del.do?idx=${dto.sabun}">삭 제</a>
        </td>
    </tr>
</table>
</body>
</html>
