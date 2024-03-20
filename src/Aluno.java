public class Aluno {

    private String nome;
    private int idade;
    private String matricula;

    public Aluno(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void setNome(String valor){
        this.nome = valor;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int valor){
        this.idade = valor;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setMatricula(String valor){
        this.matricula = valor;
    }

    public String getMatricula(){
        return this.matricula;
    }
}