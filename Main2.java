public class Main2{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alice", 25);
        Pessoa p2 = new Pessoa("Bob");
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa("Charlie", -5); // idade negativa

        System.out.println(p1.info() + ", Maior de idade: " + p1.isMaiorDeIdade());
        System.out.println(p2.info() + ", Maior de idade: " + p2.isMaiorDeIdade());
        System.out.println(p3.info() + ", Maior de idade: " + p3.isMaiorDeIdade());
        System.out.println(p4.info() + ", Maior de idade: " + p4.isMaiorDeIdade());

        System.out.println("Total de pessoas criadas: " + Pessoa.getTotalPessoas());
    }
}