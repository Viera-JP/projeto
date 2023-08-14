<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Burguer</title>
 <link rel="shortcut icon" href="img/6.png" type="image/x-icon">
 <link rel="stylesheet" href="style.css">
</head>

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

<body>
<h1 style="text-align: center;">Adicionar novo Produto</h1>
	
    
    <center><form name="frmProduto" action="insert">
	
			<input type="text" name="nome" class="valor" placeholder="Nome"><br>
			<input type="text" name="quantidade" placeholder="Quantidade" class="valor" oninput="calcularValorTotal()">	<br>
			<input type="text" name="valorUni" placeholder="Valor Unitario" class="valor" oninput="calcularValorTotal()"><br>
			<input type="text" name="valorTotal" placeholder="Valor Total" class="valor" readonly><br><br>
			
			<input type="button" value="Adicionar" class="Botao1" onclick="validar()">
	</form></center>
 	
	
<footer>
<p class="mt-5 mb-3 text-muted" style="padding:10px;">&copy; Work Inside</p>  
</footer>	
<script src="scripts/valorTotal.js"></script>
<script src="scripts/validador.js"></script>
</body>
</html>