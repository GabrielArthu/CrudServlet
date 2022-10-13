<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <!-- https://mvnrepository.com/artifact/jakarta.servlet.jsp.jstl/jakarta.servlet.jsp.jstl-api -->
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="Style.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  <title>Usuarios já cadastrados - Vour Excurtion</title>
</head>
<body>
<br>
  <nav >
    <ul class="nav nav-pills mb-3 justify-content-center " id="pills-tab" role="tablist">
      <li class="nav-item">
        <a class="nav-link"  href="cadastro.html"  role="tab" aria-selected="false">Cadastrar</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active"    role="tab" aria-selected="false">LIsta de Clientes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact" role="tab" aria-controls="pills-contact" aria-selected="false">Contato</a>
      </li>
    <li>
     <form action="UpdateData" method="GET" class="d-flex" role="search">
        <input  name="pesquisa" class="form-control me-3" type="search" placeholder="Digite o Nome ou o CPF" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
      </li>
      </ul>
</nav>
<br>
<main class="container">
  
  <H1 id="tt">Clientes cadastrados</H1>

  	<br>
  	<div class="container">
		<div class="row">
			<div class="cold-md-7 ">
				<table class="table bg-light rounded">
					<thead>
						<tr>
							<th>Nome</th>
							<th>CPF</th>
							<th>Email</th>
							<th>Telefone</th>
							<th>RG</th>
						</tr>
					</thead>
					<tbody>
				 	     <c:forEach items="${users}" var="user" >
							<tr>
								<td>${user.nome}</td>
								<td>${user.cpf}</td>
								<td>${user.email}</td>
								<td>${user.telefone}</td>
								<td>${user.rg}</td>
							    <td>
														  <!-- olhar -->  	<a   class="btn btn-danger"  href="BothDelete?userCpf=${user.cpf}">Deletar</a>
							   <!-- olhar -->    	<a class="btn btn-primary"  href="UpdateData?userCpf=${user.cpf}">Atualizar</a>
							    </td>
							</tr>
						</c:forEach> 	
					</tbody>
				</table>
				<hr>
				
				
			</div>
		</div>
	</div>
  <!-- 
 						<div id="confirmar">
 							<h3>Tem certeza que desaja excluir este usuário ?</h3>
 							<br>
 							<hr>
 							<a   class="btn btn-success"   href="pesquisa.jsp">NÃO</a>
 							<a   class="btn btn-danger"   href="BothDelete?userCpf=${user.cpf}">SIM</a>	
 							
 						</div>
   -->

</main>


<footer>


</footer>

<script src="JS.js"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>