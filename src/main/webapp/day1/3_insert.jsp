<%@page import="project.dao.TblCustomerDao"%>
<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3_INSERT</title>
</head>
<body>
<p>2�� select ��ȸ ��� Ȯ�ΰ� ���� �̹����� insert ������ ���ϴ�.</p>
<%

	
	CustomerVo vo = new CustomerVo("sanaa","��糪","sana@gmail.com",23,null);
	// dao ����	insert
	TblCustomerDao dao = new TblCustomerDao();
	dao.join(vo);
%>

	
		
	<h4>customorVo ��ü</h4>
	<table style="width:500px;">
		<tr>
			<th>���̵�</th>
			<th>�̸�</th>
			<th>�̸���</th>
			<th>����</th>
			<th>���Գ�¥</th>
		</tr>
		<tr>
			<td><%= vo.getCustomId() %></td>
			<td><%= vo.getName()%></td>
			<td><%= vo.getEmail() %></td>
			<td><%= vo.getAge() %></td>
			<td><%= vo.getReg_date()%></td>
		</tr>
	</table>
	<p>�Ʒ� ��ũ�� ������ �̵��ؼ� insert �Ϸ�ƴ��� Ȯ���� ���ϴ�.</p>
	<a href = "2_jdbc.jsp"> ��ü �� ��ȸ</a>
	
</body>
</html>
<!-- ����Ű : ctrl + d (���� ����) ctrl + alt + ����Ű (�� �� ����)
			alt + ����Ű(���̵�)  ctrl + shift + / (�ּ�)
			shift + ����(���� �� �̵�)
			ctrl + �����̽���(����, ����Ʈ, �ڵ��ϼ� ��...)
 -->