public class Pessoa {
    private String nome;
    private int idade;

    private static int totalPessoas = 0;

    // Construtor principal
    public Pessoa(String nome, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            this.nome = "Desconhecido";
        } else {
            this.nome = nome;
        }

        if (idade < 0) {
            this.idade = 0;
        } else {
            this.idade = idade;
        }

        totalPessoas++;
    }

    // Construtor só com nome
    public Pessoa(String nome) {
        this(nome, 0);
    }

    // Construtor sem parâmetros
    public Pessoa() {
        this("Sem nome", 0);
    }

    // Métodos estáticos
    public static int getTotalPessoas() {
        return totalPessoas;
    }

    public static void resetTotal() {
        totalPessoas = 0;
    }

    // Informações da pessoa
    public String info() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }

    // Verifica se é maior de idade
    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}
