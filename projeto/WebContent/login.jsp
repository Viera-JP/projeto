<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" href="estilologin.css">
</head>
<body>

 <header>
        <!--  <nav class="navbar">
            <div class="logo">
                <img src="imagens/6.png" alt="GoodBurguer" id="logo">
            </div>
            <ul class="nav-links">
                <li>
                    <a href="#home">Home</a>
                </li>
                <li>
                    <a href="#cardapio">Cardápio</a>
                </li>
                <li>
                    <a href="#sobre">Sobre</a>
                </li>
            </ul>
            <h1> "A melhor hamburgueria do Rio de Janeiro!"</h1>
        </nav>   -->

    </header>

	
		<div class="login">
		<div id="form">
			<form action="login" method="post">
				<h2 class="page-header">Acessar Sistema</h2>

				<label for="login">Usuário</label>
				<div class="input">

					<input id="username" type="text" name="login" placeholder="Usuário" id="username">
				</div>

				<label for="senha">Senha</label>
				<div class="input">

					<input id="senha" type="password" name="senha" placeholder="Senha" id="password">
				</div>

				<div id="btn">
					<button type="submit" value="Logar">Entrar</button>
				</div>
			</form>
		</div>


	</div>
</body>
</html>