package Polimorfismo;

public class Program {
    public static void main(String[] args) {
        // Dependência
        Comprar comprar = new Comprar();
        Cupom cupomzinho = new Cupom();
        double mostrar = comprar.RealizarCompra(cupomzinho, 12);

        System.out.println("Valor de sua compra: " + mostrar);
        //

        // Composição
        Pessoa pessoa = new Pessoa();
        pessoa.MostrarEndereco();
        //

        // Agregação
        Aluno aluno1 = new Aluno("Mateus", 893829);
        Aluno aluno2 = new Aluno("Luna", 23942);

        Disciplina disciplina1 = new Disciplina("Técnicas de Programação");
        disciplina1.CriarAluno(aluno1);
        disciplina1.CriarAluno(aluno2);

        disciplina1.MostrarAlunos();
        //
    }
}
