package aplicacao;

public class Aluno {

    //1. Contém 4 atributos privativos.
    private String codigo;
    private String nome;
    private String telefone;
    private int acessos;

    //2. Contém 1 atributo default.
    int categoria;

    //Clarimundo precisei criar o getNome para validar se o aluno ja existe
    public String getNome(){
        return this.nome;
    }

    //Clarimundo precisei criar o getCodigo
    public String getCodigo(){
        return this.codigo;
    }

    
    //Clarimundo pediu para ignorar
    // public Aluno (String codigo, String nome, String telefone, int acessos){
    //     this.codigo = codigo;
    //     this.nome = nome;
    //     this.telefone = telefone;
    //     this.acessos = acessos;
    // }

    // 3. Contém 2 construtores sobrecarregados sendo que um deles é para instanciar os
    // alunos de categoria 1 e o outro é para alunos com categoria 2 e 3.
    public Aluno (String codigo, String nome, String telefone, int acessos, int categoria){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.acessos = acessos;
        this.categoria = categoria;
    }

    //4. Contém 2 métodos sobrecarregados que exibem as informações do aluno no formato:
    //Clarimundo trocou por exibe1 e exibe2
    public String exibe1(){
        // Código: xxxxx
        // Nome: xxxxxxxxxxxxxxxxxxxxxx
        // Telefone: (xx) xxxxx-xxxx
        // Categoria: x

        String retorno = "";
        retorno += "Código: " + this.codigo;
        retorno += "\nNome: " + this.nome;
        retorno += "\nTelefone: " + this.telefone;
        retorno += "\nCategoria: " + this.categoria;

        return retorno;
    }

    public String exibe2(int acessos){
        // Código: xxxxx
        // Nome: xxxxxxxxxxxxxxxxxxxxxx
        // Telefone: (xx) xxxxx-xxxx
        // Categoria: x
        // Acessos: x

        String retorno = "";
        retorno += "Código: " + this.codigo;
        retorno += "\nNome: " + this.nome;
        retorno += "\nTelefone: " + this.telefone;
        retorno += "\nCategoria: " + this.categoria;
        retorno += "\nAcessos: " + this.acessos;

        return retorno;
    }
    
}