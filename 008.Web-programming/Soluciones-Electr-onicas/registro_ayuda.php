<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="./css/ayuda.css" />
		<link rel="icon" type="imagen/jpg" href="./src/images/icono.jpg" />
		<title>Ayuda</title>

		<!-- bootstrap -->

		<link rel="stylesheet" href="css/estilo.css" />

		<script
			src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"
		></script>

		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
			crossorigin="anonymous"
		/>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
			crossorigin="anonymous"
		></script>

		<script
			src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
			integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
			crossorigin="anonymous"
		></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
			integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
			crossorigin="anonymous"
		></script>
		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
			integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
			crossorigin="anonymous"
		></script>
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light" id="navBar">
			<a class="navbar-brand" href="./index.html">
				<img
					src="./src/img/iconofinal.jpeg"
					width="170"
					height="50"
					alt="Logo Aduana Costa Rica"
				/>
			</a>
			<button
				class="navbar-toggler"
				type="button"
				data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent"
				aria-expanded="false"
				aria-label="Toggle navigation"
			>
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active">
						<a class="nav-link btn" href="./index.html">Página principal </a>
					</li>
					<li class="nav-item">
						<a class="nav-link btn" href="./sobre-el-proyecto.html"
							>Sobre el proyecto
						</a>
					</li>
					<li class="nav-item">
						<a class="nav-link btn" href="./equipo.html">Sobre el equipo </a>
					</li>
					<li class="nav-item">
						<a class="nav-link btn" href="./ayuda.html"
							>Ayuda <span class="sr-only">(Actual)</span></a
						>
					</li>
				</ul>
			</div>
		</nav>

		<main class="container">
			<header class="container-header">
				<h1 class="title-form">Formulario de Ayuda</h1>
			</header>

			<section class="container-body">
				<p class="mandatory-fields-label">* Campos Obligatorios</p>

				<form
					id="formulario"
					class="needs-validation"
					method="POST" action="registro_ayuda.php"
				>
					<section class="form-content">
						<div class="field">
							<label class="field-label" for="fullname"
								>Nombre y Apellido <span class="mandatory-mark">*</span></label
							>
							<input
								class="field-input"
								type="text"
								id="fullname"
								placeholder="Juan Pérez "
								name="nombre"
								autofocus
							/>
						</div>

						<div class="field">
							<label class="field-label" for="email_address"
								>E-mail <span class="mandatory-mark">*</span></label
							>
							<input
								class="field-input"
								type="email"
								id="email_address"
								name="correo"
								placeholder="micorreoelectrónico@ejemplo.com"
							/>
						</div>

						<div class="fieldset" aria-labelledby="tipo-problema-title">
							<p id="tipo-problema-title">
								Tipo de problema <span class="mandatory-mark"></span>
							</p>
							<div class="group-button">
								<div class="field">
									<input
										type="checkbox"
										value="email"
										id="email-issues"
										name="tipo-de-problema"
										class="tipo-problema"
									/>
									<label for="email-issues">Email</label>
								</div>

								<div class="field">
									<input
										type="checkbox"
										value="workstation"
										id="workstation"
										class="tipo-problema"
									/>
									<label for="workstation">Equipo</label>
								</div>

								<div class="field">
									<input
										type="checkbox"
										value="phone"
										id="phone"
										class="tipo-problema"
									/>
									<label for="phone">Código arancelario</label>
								</div>

								<div class="field">
									<input
										type="checkbox"
										value="others"
										id="others"
										class="tipo-problema"
									/>
									<label for="others">Otro</label>
								</div>
							</div>
						</div>

						<div class="field">
							<label for="description"
								>Especificar Problema
								<span class="mandatory-mark">*</span></label
							>
							<textarea
								class="field-input"
								name="especificar_problema"
								id="description"
								name="descripcion"
								cols="30"
								rows="10"
								placeholder="Escriba aquí..."
								type="text"
							></textarea>
						</div>

						<div class="field">
							<label for="comments">Comentarios y Preguntas</label>
							<textarea
								class="field-input"
								name="preguntas"
								id="comments"
								name="comentario"
								cols="30"
								rows="10"
								placeholder="Escriba aquí..."
								type="text"
							></textarea>
						</div>
					</section>

					<section class="form-footer">
						<center>
      						<input type="submit" value="Enviar" class="btn btn-info" name="btn1">
    					</center>
					</section>
				</form>

				<?php

    				if(isset($_POST['btn1']))
    				{
    				  include("abrir_conexion_ayuda.php");

					  $nombre = $_POST['nombre'];
					  $correo = $_POST['correo'];
					  $tipo = $_POST['tipo-de-problema'];
					  $especificar = $_POST['descripcion'];
					  $comentarios = $_POST['comentario'];
					
    				  mysqli_query($conexion, "INSERT INTO $tabla_db1 (Nombre,correo,Tipo,Especificar,Comentarios) values ('$nombre','$correo','$tipo','$especificar','$comentarios')");
					
    				  include("cerrar_conexion.php");
    				  echo "Se insertaron Correctamente";
    				}
				
    				  include("cerrar_conexion.php");
  				?>

				<div id="error"></div>
			</section>
		</main>

		<div class="container-fluid bg-light" style="margin-top: 2rem">
			<footer class="bg-light text-center text-lg-start">
				<div class="footer">
					<!-- Copyright -->
					<div class="p-3">
						<img src="./src/img/banderaCostaRica.png" />
						© 2021 Copyright - privacidad
					</div>
					<!-- Copyright -->
				</div>
			</footer>
		</div>

		<script src="./js/formulario.js"></script>
		<script src="./libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
	</body>
</html>
