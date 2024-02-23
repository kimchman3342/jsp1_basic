<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN_customer</title>										
<link rel="stylesheet"    href="assets/css/register.css" > <!-- ..은 상위폴더로 올라간다는 얘기  -->	
<!-- 서블릿으로 화면을 보여 줄 때에는 ???? -->
</head>
<body>
  <div class="contents-wrap">
  <h3 style="text-align: center;">고객 등록</h3>
  <hr>
          <form id="register.cc" method = "post">
            <ul class="join-wrap">
              <li>아이디</li>
              <li>
                <input name="username(최대 20글자)" type="text" 
                  placeholder="아이디를 입력해 주세요." />
              </li>
            
              <li>이름</li>
              <li><input  name="name" type="text" placeholder="이름(최대 40글자)" /></li>
              <li>이메일</li>
              <li><input  name="email" type="text" placeholder="이메일을 입력해 주세요.(최대 40글자)" /></li>
              <li>나이</li>
              <li><input name="age" type="text" placeholder="나이를 입력하세요.(숫자 최대 3글자)" /></li>
            </ul>
            <button  class="join-btn" >회원가입</button>
          </form>
        </div>
  <script src="assets/js/script.js"></script>
</body>
</html>