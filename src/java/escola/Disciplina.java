package escola;

import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Disciplina {

    /**
     * Atributos
     */
    private String nome;
    private int cargaHoraria;

    /**
     * Importa Lista de Professores para a variavel professores
     */
    ArrayList<Professor> professores;

    /**
     * Importa lista de Turmas para a variavel alunos
     */
    ArrayList<Turma> turmas;

    /**
     * Metodos Getters e Setters
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }

    }

    public boolean salvar() {

        try {

            /* Cria um array vazio */
            ArrayList<Disciplina> vetDisciplinas = Disciplina.listar();
            // Adiciona disciplina no Vetor this[o proprio objeto] 
            vetDisciplinas.add(this);

            /*Cria uma nova instacia de XStream*/
            XStream xstream = new XStream();

            /*Define apelido para os objetos da classe Disciplina*/
            xstream.alias("disciplina", Disciplina.class);

            /* Cria arquivo disciplinas.xml */
            FileWriter escritor = new FileWriter(Conexao.getCaminho());

            /* Escreve no arquivo com os dados do vetor*/
            escritor.write( xstream.toXML(vetDisciplinas));

            /*Fecha o arquivo*/
            escritor.close();
            // retorna verdadeiro
            return true;
            
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
            return false;
        }

    }
    public static ArrayList<Disciplina> listar(){
        /* Cria um array vazio */
            ArrayList<Disciplina> vetDisciplinas = new ArrayList<Disciplina>();

            /*Cria caminho para salvar o xml */
            //String caminho = request.getServletContext().getRealPath("/");
           // String caminho = "C:\\Users\\bruno\\Documents\\NetBeansProjects\\EscolaWeb\\xml\\";

            XStream leitor = new XStream();
            leitor.alias("disciplina", Disciplina.class);
            File arquivo = new File(Conexao.getCaminho()+"disciplinas.xml");
            if (arquivo.exists()) {
                    //Person newJoe = (Person)xstream.fromXML(xml);
                vetDisciplinas = (ArrayList<Disciplina>) leitor.fromXML(arquivo);
            }
            return vetDisciplinas;
    }

}