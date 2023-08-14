<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 <h1 style="text-align: center;">Adicionar nova bebida</h1>
	<center><form name="frmBebidas" action="insertBebidas">
		
				<input type="text" name="nomeBebidas" class="valor" placeholder="Nome"><br>
				<input type="text" name="tamanho" class="valor" placeholder="Exemplo: 500ml, 1L, 2L"><br>
				<input type="text" name="quantidadeBebidas" class="valor" placeholder="Quantidade de bebidas" oninput="calcularValorTotalB()"><br>
				<input type="text" name="valorUniBebidas" class="valor" placeholder="Valor da unidade" oninput="calcularValorTotalB()"><br>
			
			
			 <input type="text" name="valorTotalBebidas" class="valor" placeholder="Valor total" readonly><br><br>
			
		<input type="button" value="Adicionar" class="Botao1" onclick="validarBebidas()">
	</form></center>
	<script src="scripts/validador.js"></script>
	<script src="scripts/valorTotal.js"></script>

<footer>
 <p class="text-muted" style="padding:10px;">&copy; Work Inside</p>  
</footer>	
</body>
</html>