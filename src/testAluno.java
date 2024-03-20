public class testAluno {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Marcos", 27, "1234");
        Aluno a2 = new Aluno("Luiza", 24,"2234");


        System.out.print("\nNome: " + a1.getNome());
        System.out.print("\nIdade: " + a1.getIdade());
        System.out.print("\nMatrícula: " + a1.getMatricula());
        System.out.print("\n");

        System.out.print("\nNome: " + a2.getNome());
        System.out.print("\nIdade: " + a2.getIdade());
        System.out.print("\nMatrícula: " + a2.getMatricula());

    }
}
