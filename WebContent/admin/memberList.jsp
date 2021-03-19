<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원목록</title>
</head>
<style>
  *{
    margin: 0 auto;
    padding: 0;

    box-sizing: border-box;
    /* overflow: hidden; */
    /* 디버깅용 라인 */
    /* border: 1px solid red; */
  }
  a{
    text-decoration: none;
  }
  .wrap{
    width: 1280px;
    display: flex;
  }
  .aside{
    width: 180px;
    /* background-color: cyan; */
    font-size: 20px;
    text-align: center;

    display: flex;
    flex-direction: column;
    
  }
  .aside a{
    border: .5px solid gray;
    width: 180px;
    height: 50px;
    line-height: 50px;
    color:lightslategrey;
  }
  .aside a:hover{
    background-color: #CE6D39;
    color:lavender;
  }
  #selected{
    /* filter: brightness(20%); */
    background-color: #CE6D39;
    color:lavender;
  }
  .section{
  	margin-top: 20px;
    width: 1100px;
    background-color: lavender;
    height: 800px;
  }
  .sectionTitle{
    background-color: lavenderblush;
    height: 80px;
    border: 1px solid gray;

    /* 글자 정렬 */
    text-align: center;
    line-height: 80px;
  }
  .sectionTitle > h1{
    color: lightsalmon;
  }
  .table{
    margin-top: 30px;
  }
  .table th, .table td{
    width: 220px;
    text-align: center;
  }
  #memberListDeleteButton{
    width: 80px;
    height: 30px;

    border: 1px solid skyblue; 
    color: skyblue; 
    padding: 5px;
    margin-right: 20px;
    border-radius: 10px;
  }
  #memberListDeleteButton:hover{
    color:white; 
    background-color: skyblue;
  }
</style>
<body>

<jsp:include page="adminHeader.jsp"/>

  <div class="wrap">
    <div class="aside">
      <a href="memberList.jsp" id="selected">회원 목록</a>
      <a href="productList.jsp">상품 목록</a>
      <a href="productAdd.jsp">상품 등록</a>
      <a href="orderList.jsp">주문 목록</a>
      <a href="productQna.jsp">문의 목록</a>
    </div>
    <div class="section">
      <div class="sectionTitle">
        <h1>회원 목록</h1>
      </div>
      <table class="table">
        <!-- th -->
        <tr>
          <th>ID</th>
          <th>이름</th>
          <th>휴대폰</th>
          <th></th>
        </tr>
        <!-- tr -->
        <c:forEach var="dto" items="${ list }">
            <tr>
              <td class="t01">${ dto.news_idx }</td>
              <td class="t02"><a href="community02_view.do?news_idx=${ dto.news_idx }">${ dto.news_title }</a></td>
              <td>${ dto.news_date }</td>
              <td><button id="memberListDeleteButton">삭제</button></td>
            </tr>
        </c:forEach>
		
      </table>
    </div>
  </div>
</body>
</html>