<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JOIN_product</title>
<link rel="stylesheet"    href="assets/css/register.css" >
</head>
<body>
  <div class="contents-wrap">
  <h3 style="text-align: center;">상품 등록</h3>
  <hr>
          <form id="productReg.cc" method = "post">
            <ul class="join-wrap">
              <li>카테고리</li>
              <li>
                <input  name="category" type="text" 
                  placeholder="카테고리를 입력해 주세요." />
              </li>
            
              <li>상품코드</li>
              <li><input  name="pcode" type="text" placeholder="상품코드" /></li>
              <li>상품이름</li>
              <li><input  name="pname" type="text" placeholder="상품이름" /></li>
              <li>가격</li>
              <li id ="priceChk"><input name="price" type="text" placeholder="가격" /></li>
            </ul>
            <button  class="join-btn" >상품 등록</button>
          </form>
        </div>
  <script src="assets/js/script.js"></script>
</body>
</html>