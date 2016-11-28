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
    <title>ADD FORM</title>
</head>
<body>
<h1>수정 페이지</h1>
<form action="update.do" method="post">
    <p>
        <label for="sabun">사번</label>
        <input type="text" name="sabun" id="sabun" value="${dto.sabun}">
    </p>
    <p>
        <label for="name">이름</label>
        <input type="text" name="name" id="name" value="${dto.name}">
    </p>
    <p>
        <label for="pay">금액</label>
        <input type="text" name="pay" id="pay" value="${dto.pay}">
    </p>
    <p>
        <button type="submit">입 력</button>
        <button type="reset">취 소</button>
    </p>
</form>
</body>
</html>
