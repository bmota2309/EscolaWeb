<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Disciplina</title>
    </head>
    <body>
        <h1>Cadastrar Disciplina</h1>
        <form name="formulario" method="post" action="salvardisciplina.jsp">
            <label> Nome </label>
            <input type="text" name="nome" placeholder="Nome da Disciplina" />
            <br />
            <label>Carga Horaria </label>
            <input type="number" name="cargaHoraria" placeholder="Carga Horaria"/>
            <br />
            <input type="submit" name="enviar" value="Salvar" />
        </form>
        <a href="listardisciplinas.jsp">Ver Disciplinas</a>
    </body>
</html>
