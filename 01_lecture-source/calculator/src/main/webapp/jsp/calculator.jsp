<%--
  Created by IntelliJ IDEA.
  User: hi-sinchon 3강
  Date: 2024-11-05
  Time: 오전 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/calculate" method="post">
        <input type="text" name="number1" placeholder="숫자 1">
        <select name="operator">
          <option value="+">+</option>
          <option value="-">-</option>
          <option value="*">*</option>
          <option value="/">/</option>
        </select>
        <input type="text" name="number2" placeholder="숫자 2">
      <button type="submit">계산</button>
    </form>
</body>
</html>
