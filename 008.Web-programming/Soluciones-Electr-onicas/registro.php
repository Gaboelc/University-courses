<html>
<head>
  <title>Consulta a la base de datos</title>

  <link rel="stylesheet" href="./css/index.css" />

  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

  <!-- Optional theme -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

  <!-- Latest compiled and minified JavaScript -->
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
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
						<a class="nav-link btn" href="./index.html"
							>Página principal <span class="sr-only">(Actual)</span></a
						>
					</li>
					<li class="nav-item">
						<a class="nav-link btn" href="./sobre-el-proyecto.html"
							>Sobre el proyecto</a
						>
					</li>
					<li class="nav-item">
						<a class="nav-link btn" href="./equipo.html">Sobre el equipo</a>
					</li>
					<li class="nav-item">
						<a class="nav-link btn" href="./ayuda.html">Ayuda</a>
					</li>
				</ul>
			</div>
		</nav>

<div class="row">
  <div class="col-md-4"></div>
  <div class="col-md-4">

    <center><h1>Consulta a la base de datos</h1></center>

    <form method="POST" action="registro.php" >

    <div class="form-group">
      <label for="fecha">Fecha</label>
      <input type="date" name="fecha" class="form-control" id="fecha">
  </div>

  <div class="form-group">
      <label for="numero">Referencia e-RAV</label>
      <input type="text" name="numero" class="form-control" id="numero" >
  </div>

   <div class="form-group">
      <label for="descripcion">Descripcion</label>
      <input type="text" name="descripcion" class="form-control" id="descripcion">
  </div>

  <div class="form-group">
      <label for="relacionado">TLC</label>
      <input type="text" name="relacionado" class="form-control" id="relacionado">
  </div>
    
    <center>
      <input type="submit" value="Consultar" class="btn btn-info" name="btn2">
    </center>

  </form>



  <?php

    if(isset($_POST['btn2']))
    {
      include("abrir_conexion.php");

        $fecha = $_POST['fecha'];
        $numero = $_POST['numero'];
        if($fecha=="") //VERIFICO QUE AGREGEN UN DOCUMENTO OBLIGATORIAMENTE.
          {
            $resultados = mysqli_query($conexion,"SELECT * FROM $tabla_db1  WHERE `Numero_de_tarifa_de_categoria` = $numero");
          while($consulta = mysqli_fetch_array($resultados))
          {
            echo 
            "
              <table width=\"100%\" border=\"1\">
                <tr>
                  <td><b><center>Fecha</center></b></td>
                  <td><b><center>Referencia e-RAV</center></b></td>
                  <td><b><center>Descripción</center></b></td>
                  <td><b><center>TLC</center></b></td>
                </tr>
                <tr>
                  <td>".$consulta['Fecha']."</td>
                  <td>".$consulta['Numero_de_tarifa_de_categoria']."</td>
                  <td>".$consulta['Descripcion']."</td>
                  <td>".$consulta['Relacionado']."</td>
                </tr>
              </table>
            ";
          }
          }
        else
        {  
          $resultados = mysqli_query($conexion,"SELECT * FROM $tabla_db1  WHERE `Numero_de_tarifa_de_categoria` = $numero");
          while($consulta = mysqli_fetch_array($resultados))
          {
            echo 
            "
              <table width=\"100%\" border=\"1\">
                <tr>
                  <td><b><center>Fecha</center></b></td>
                  <td><b><center>Referencia e-RAV</center></b></td>
                  <td><b><center>Descripción</center></b></td>
                  <td><b><center>TLC</center></b></td>
                </tr>
                <tr>
                  <td>".$consulta['Fecha']."</td>
                  <td>".$consulta['Numero_de_tarifa_de_categoria']."</td>
                  <td>".$consulta['Descripcion']."</td>
                  <td>".$consulta['Relacionado']."</td>
                </tr>
              </table>
            ";
          }
        }

      include("cerrar_conexion.php");
    }
  ?>



  </div>
  <div class="col-md-4"></div>
</div>

  <div class="container-fluid bg-light">
			<footer class="bg-light text-center text-lg-start">
				<div class="footer">
					<!-- Copyright -->
					<div class="p-3">
					  <img src="./src/img/banderaCostaRica.png" /> © 2021 Copyright -
					  privacidad
				</div>
				<!-- Copyright -->
			</div>
		</footer>
	</div>
</body>
</html>