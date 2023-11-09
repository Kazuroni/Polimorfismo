package Polimorfismo;

public class Aluno {
    private String nome;
    private int ra;

    public Aluno(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public void ExibirAluno() {
        System.out.println("Nome: " + nome + ", Ra: " + ra);
    }
}
