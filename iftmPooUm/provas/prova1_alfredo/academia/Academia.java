package academia;

public class Academia {

    //1. Contém 1 atributo privativo que conta quantos alunos há na academia.
    private int alunos;

    // 2. Contém 1 atributo default e estático que conta os acessos à aulas com personal. No
    // mês só podem ocorrer 5 aulas com o personal dentro da academia. Se a categoria do
    // aluno for 1, então ele não tem direito a ter essas aulas com personal. Se a categoria do
    // aluno for 2, então ele tem direito a ter 1 aula com personal. Se a categoria for 3, então ele
    // tem direito a ter até 2 aulas com personal.
    static int acessos = 0;

     //Clarimundo precisei criar os metodos, get e set
    public static int getAcessos() {
        return acessos;
    }

    public static void setAcessos(int novoValor) {
        acessos = novoValor;
    }

    
    //3. Contém 1 construtor padrão.
    public Academia(){

    }

    //4. Contém 1 método para atualizar a contagem de alunos da academia.
    public void atualiza(int alunos){
        this.alunos += alunos;
    }


   
}
