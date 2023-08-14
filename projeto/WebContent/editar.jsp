<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Edição de Produtos - GoodBurguer</title>
 <link rel="shortcut icon" href="img/6.png" type="image/x-icon">
<link rel="shortcut icon" href="/GoodBurguer 1.0/img/6.png" type="image/x-icon">
<link rel="stylesheet" href="style.css">
</head>
<body>
<header>
<div class="logo">
            <img src="img/4.png" alt="GoodBurguer" id="logo">
	 </div> <!--logo-->
	  <div class="cabeçalho-link">
            <li>
             <a href="index.jsp">Home</a>
            </li>
            <li>               
                <a href="novoP.jsp">Cadastrar Alimentos</a>
            </li>
            <li>               
                <a href="NovoB.jsp">Cadastrar Bebidas</a>
            </li>
            <li>
                <a href="main">Estoque de Alimentos</a>
            </li>
            <li>               
               <a href="mainBebidas">Estoque de Bebidas</a>
            </li>
            
             <a href="login.jsp"><button>Sair</button></a>
             
            </div><!--cabeçalho-->
    </header>
    <div class="">     
           <div class="text">
	<center><h3>Edição de Produto</h3></center>
	</div>
     </div>
      <center><form name="frmProduto" action="update">

		<table>
			<tr>
				<td><input type="text" name="id" class="valor" readonly
					value="<%out.print(request.getAttribute("id"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="valor"
					value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="quantidade" class="valor"
					oninput="calcularValorTotal()"
					value="<%out.print(request.getAttribute("quantidade"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="valorUni" class="valor"
					oninput="calcularValorTotal()"
					value="<%out.print(request.getAttribute("valorUni"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="valorTotal" class="valor"
					readonly value="<%out.print(request.getAttribute("valorTotal"));%>"></td>
			</tr>
		</table>
		<br>
		<input type="button" value="Salvar" class="Botao1" onclick="validar()">
	</form></center>
	</div>

	<script src="scripts/valorTotal.js"></script>
	<script src="scripts/validador.js"></script>


<p class="p-1"></p>
<footer>
<p class="mt-5 mb-3 text-muted" style="padding:10px;">&copy; Work Inside</p>  
</footer>	
</body>
</body>
</html>