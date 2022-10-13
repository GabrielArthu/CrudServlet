<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
  <link rel="stylesheet" href="Style.css">
<meta charset="utf=8">
<title>CRUD JAVA - Atualizar cliente</title>
</head>
<body>
<br>
  <nav >
    <ul class="nav nav-pills mb-3 justify-content-center " id="pills-tab" role="tablist">
      <li class="nav-item">
        <a class="nav-link"  href="cadastro.html"  role="tab" aria-selected="false">Cadastrar</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active"  href="SelectAndCreate"  role="tab" aria-selected="false">LIsta de Clientes</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact" role="tab" aria-controls="pills-contact" aria-selected="false">Contato</a>
      </li>
    </ul>
</nav>
<br>
	<div class="container">
		<div class="row">
			<div class="cold-md-7">
				<h1 id="tt">Atualizar dados de clientes</h1> 
				<hr>
				<form action="UserUpdateData" method="POST">
				
					
					<div class="form-floating mb-3">
						<input value="${user.cpf}" name="cpf" type="text" class="form-control" placeholder="Nascimento">
						<label>CPF</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${user.nome}" name="nome" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Nome completo</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${user.telefone}" name="telefone" maxlength="11" type="text" class="form-control"> 
						<label>Telefone (apenas numeros)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${user.email}" name="email" type="text" class="form-control" placeholder="Nascimento">
						<label>email</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${user.rg}" name="rg" type="text" class="form-control" placeholder="Nascimento">
						<label>RG</label>
					</div>

					<button class="btn btn-success" type="submit">Alterar
						Cliente</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulario</button>
					
				</form>
				
			</div>
		</div>
	</div>


















<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>	

</body>
</html>