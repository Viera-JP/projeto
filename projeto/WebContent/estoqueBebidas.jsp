<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.BebidasBeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<BebidasBeans> lista = (ArrayList<BebidasBeans>) request.getAttribute("bebidas");
	
%>
<!DOCTYPE html>
<html lang ="pt-br">
<head>
<meta charset="UTF-8">
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
	<h1 style="text-align: center;">Estoque de Bebidas</h1>
	<table id="tabela">
	 		 <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Tamanho</th>
                    <th>Quantidade</th>
                    <th>Valor Uni.</th>
                    <th>Valor Total</th>
                    <th>Opções</th>
                </tr>
            </thead>
            <tbody>
            
			<%for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%=lista.get(i).getIdBebidas()%></td>
					<td><%=lista.get(i).getNomeBebidas()%></td>
					<td><%=lista.get(i).getTamanho()%></td>
					<td><%=lista.get(i).getQuantidadeBebidas()%></td>
					<td> R$ <%=lista.get(i).getValorUniBebidas()%></td>
					<td> R$ <%=lista.get(i).getValorTotalBebidas()%></td>
					<td><a href="selectBebidas?idBebidas=<%=lista.get(i).getIdBebidas()%>"class="Botao1">Editar</a>
						<a href="javascript: confirmarB(<%=lista.get(i).getIdBebidas() %>)" class="Botao2">Excluir</a>
					</td>
				
				</tr>
			<%} %>
	</tbody>
	</table>
	<center><a href="NovoB.jsp" class="Botao1">Nova Bebida</a></center>
	<script src = "scripts/confirmador.js"></script>
	

<footer>
<p class= "text-muted" style="padding:10px;">&copy; Work Inside</p>  
</footer>
	
</body>
</html>