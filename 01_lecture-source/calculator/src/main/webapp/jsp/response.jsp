<%--
  Created by IntelliJ IDEA.
  User: hi-sinchon 3강
  Date: 2024-11-05
  Time: 오후 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
    int number1 = Integer.parseInt((request.getParameter("number1")));
    int number2 = Integer.parseInt((request.getParameter("number2")));
    String operator = request.getParameter("operator");
    int resultTotal = (int) request.getAttribute("resultTotal");
  %>

  <table>
    <th>1번 숫자요</th>
    <th>연산기호요</th>
    <th>2번 숫자요</th>
    <th>답이에유</th>
    <tr>
      <td><%=number1%></td>
      <td><%=operator%></td>
      <td><%=number2%></td>
      <td><%=resultTotal%></td>
    </tr>
  </table>
</body>
</html>