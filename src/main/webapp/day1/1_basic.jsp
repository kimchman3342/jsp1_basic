<%@page import="project.vo.CustomerVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1_basic</title>
</head>
<body>
<p>jsp������ html �±׿� �Բ� �ڹ� ��ɾ�, ���� ��� ���� �� �� �ֽ��ϴ�.</p>
<%

	/* �ڹٿ��� �ٷ���� �迭, ����Ʈ �÷���, VO ��ü�� ���� */
	String[] names = {"�糪","����","���","����","����"};
	List<String> list = List.of("�糪","����","���","����","����");
	CustomerVo vo = new CustomerVo("sana","��糪","sana@gmail.com",23,null);

%>

	<h4>�迭 names</h4>
	<ul>
	<!-- ���⿡ names �迭 ��� ���� �ڹ� �ڵ� ����Ͽ� �ݺ��� ���  -->
	
	<h3>�÷���</h3>
	<%
	for(int i = 0; i<names.length; i++){	// for ����
	%>
		<li><%= list.get(i)  %> </li>
	
	<%
	}		// for end
	%>
	</ul>
	
	<hr>
	
		
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
	
</body>
</html>
<!-- ����Ű : ctrl + d (���� ����) ctrl + alt + ����Ű (�� �� ����)
			alt + ����Ű(���̵�)  ctrl + shift + / (�ּ�)
			shift + ����(���� �� �̵�)
			ctrl + �����̽���(����, ����Ʈ, �ڵ��ϼ� ��...)
 -->