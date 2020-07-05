<%@page import="java.io.File"%>
<%@page import="com.thoughtworks.xstream.XStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="escola.Disciplina"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Disciplinas</title>
    </head>
    <body>
        <h1>Disciplinas</h1>
        
        <%
         //Cria um array vazio
            ArrayList<Disciplina> vetDisciplinas = Disciplina.listar();
            
            for (Disciplina disciplina: vetDisciplinas){
                %>
                
                    Nome: <%=disciplina.getNome()%><br />
                    Carga Horaria:<%=disciplina.getCargaHoraria()%><br /><hr />
                <%
            }
        %>
        <a href="cadastrardisciplina.jsp">Cadastrar Nova</a>
        
    </body>
</html>
