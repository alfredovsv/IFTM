public class FichaPessoal{
    private String nome;
    private int idade;
    public static int quantidade = 0;

    public FichaPessoal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        quantidade++;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}