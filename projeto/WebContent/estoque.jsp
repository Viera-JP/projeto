<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="model.Javabeans"%>
<%@ page import="java.util.ArrayList"%>
<%
	ArrayList<Javabeans> lista = (ArrayList<Javabeans>) request.getAttribute("produto");
	
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Estoque GoodBurguer</title>
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
     
	  <div class="main">
        <h1 style="text-align: center;">Estoque de Alimentos</h1>      
	 <table id="tabela">
	 		 <thead>
                <tr>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Quantidade</th>
                    <th>Valor Uni.</th>
                    <th>Valor Total</th>
                    <th>Opções</th>
                </tr>
            </thead>
            <tbody>
            
			<%for (int i = 0; i < lista.size(); i++) { %>
				<tr>
					<td><%=lista.get(i).getId()%></td>
					<td><%=lista.get(i).getNome()%></td>
					<td><%=lista.get(i).getQuantidade()%></td>
					<td> R$ <%=lista.get(i).getValorUni()%></td>
					<td> R$ <%=lista.get(i).getValorTotal()%></td>
					<td><a href="select?id=<%=lista.get(i).getId() %>" class="Botao1">Editar</a>
						<a href="javascript: confirmar(<%=lista.get(i).getId() %>)" class="Botao2">Excluir</a>
					</td>
				</tr>
			<%} %>
	</tbody>
	</table>
	<a href="novoP.jsp" class="Botao1">Novo produto</a>
	<script src="scripts/confirmador.js"></script>
</div>	

<footer>
<p class= "text-muted" style="padding:10px;">&copy; Work Inside</p>  
</footer>
</body>
</html>