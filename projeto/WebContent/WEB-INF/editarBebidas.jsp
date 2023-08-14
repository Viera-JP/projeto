<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang ="pt-br">
<head>
<meta charset="UTF-8">
<title>Burguer</title>
<link rel="shortcut icon" href="img/6.png" type="image/x-icon">
<link rel="stylesheet" href="style.css">
</head>
<body>
	
	<h1>Editar bebida</h1>
	
	<form name="frmBebidas" action="">
	<div class="container">
		<table>
			<tr>
				<td><input type="text" name="idBebidas" class="Caixa1" readonly value="<%out.print(request.getAttribute("idBebidas"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nomeBebidas" class="Caixa1" value="<%out.print(request.getAttribute("nomeBebidas"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="tamanho" class="Caixa1" value="<%out.print(request.getAttribute("tamanho"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="quantidadeBebidas" class="Caixa1" oninput="calcularValorTotalB()" value="<%out.print(request.getAttribute("quantidadeBebidas"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="valorUniBebidas" class="Caixa1" oninput="calcularValorTotalB()" value="<%out.print(request.getAttribute("valorUniBebidas"));%>"></td>
			</tr>
			<tr>
			 <td><input type="text" name="valorTotalBebidas" class="Caixa1" readonly value="<%out.print(request.getAttribute("valorTotalBebidas"));%>"></td>
			</tr>
		</table>
		<input type="button" value="Salvar" onclick="validarBebidas()">
	</form>
	</div>
	<script src="scripts/validador.js"></script>
	<script src="scripts/valorTotal.js"></script>
</body>
</html>