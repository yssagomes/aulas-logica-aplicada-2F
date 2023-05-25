public class Main {
    public static void main(String[] args) {

        //Aula de Orientação de Projetos
        //Declarar objetos
        Pessoa adao;

        //Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();//Classe,Objeto e Construtor

        //Definição do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";

        //Acionar comportamento
        adao.falar();
        eva.falar();

        //Criar mais objetos
        Pessoa qualquer  = new Pessoa();
        //Declarar objeto
        Pessoa rainha;
        //instanciação do objeto
        rainha = new Pessoa();
        //Definindo forma da pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Turner";
        //Definição de comportamento
        System.out.println(rainha.falar("alto"));
    }
}