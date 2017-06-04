<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Cáculo Web</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>

<body>
    
    <form name="imcForm" id="imcForm" action="#">
    
    <div id="titulo"> Calculadora de IMC </div>

    <div id="texto">
    <p>
        Altura em metros <br />
        <input type="text" id="altura" name="altura" placeholder="0.00" />
    </p>

    <p>
        Peso em kg <br />
        <input type="text" id="peso" name="peso" placeholder="0.00" />
    </p>

    <div id="radio">
        <label>
        <input type="radio" name="sexo" value="opção" id="sexo_0"/> Masculino
        </label>
        <br />
        <label>
        <input type="radio" name="sexo" value="opção" id="sexo_1"/> Feminino
        </label>
    </div>
    
    <p>
        <input class=css_btn_class name="Enviar" type="submit" value="Calcular" />
    </p>
	<div id="alert"> ${resultado} </div>
	
    </div>

  </form>
  
</body>