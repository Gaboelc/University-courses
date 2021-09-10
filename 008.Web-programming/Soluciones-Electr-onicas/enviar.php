<?php
	$name = $_POST['nombre'];
	$mail = $_POST['correo'];
	$tipo_de_problema = $_POST['tipo-de-problema'];
	$especificar_problema = $_POST['especificar_problema'];
	$preguntas = $_POST['preguntas'];

	$header = 'From: ' . $mail . " \r\n";
	$header .= "X-Mailer: PHP/" . phpversion() . " \r\n";
	$header .= "Mime-Version: 1.0 \r\n";
	$header .= "Content-Type: text/plain";

	$message = "Este mensaje fue enviado por: " . $name . " \r\n";
	$message .= "Su e-mail es: " . $mail . " \r\n";
	$message .= "El problema fue: " . $tipo_de_problema . " \r\n";
	$message .= "Mensaje: " . $especificar_problema . " \r\n";
	$message .= "Comentarios y preguntas: " . $preguntas . " \r\n";
	$message .= "Enviado el: " . date('d/m/Y', time());

	$para = "melinoegabo@gmail.com";
	$asunto = "Problema de: " . $name .;

	mail($para, $asunto, utf8_decode($message), $header);

	header("Location:ayuda.html");
?>