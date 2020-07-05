<%@page import="java.io.File"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="escola.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
        request.setCharacterEncoding("UTF-8");
        String nome = request.getParameter("nome");
        String cargaHoraria = request.getParameter("cargaHoraria");
            
            Disciplina disciplina = new Disciplina();
            disciplina.setNome(nome);
            /* Converte Carga horária de int para string */
            disciplina.setCargaHoraria(Integer.parseInt(cargaHoraria));
            if(disciplina.salvar()){
                out.println("Disciplina cadastrada com sucesso!");
            }else{
                out.println("Ops.. ocorreu um erro!");
            }
        %>
        <br /></p>
        <a> <strong>Nome:</strong></a><%=nome%>
        <br /><strong>Carga Horária:</strong><a></a><%=cargaHoraria%><br />
        <a href="cadastrardisciplina.jsp">Cadastrar outra</a>
        <a href="listardisciplinas.jsp">Ver Disciplinas</a>
    </body>
</html>
