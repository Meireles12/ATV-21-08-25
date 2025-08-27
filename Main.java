public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo(500, "Caminhão");
        Veiculo v2 = new Veiculo(600, "Ônibus");
        Veiculo v3 = new Veiculo("Carro");
        Veiculo v4 = new Veiculo("Moto");
        Veiculo v5 = new Veiculo();

        System.out.println(v1.descricao());
        System.out.println(v2.descricao());
        System.out.println(v3.descricao());
        System.out.println(v4.descricao());
        System.out.println(v5.descricao());

        System.out.println("\nTotal criados: " + Veiculo.getTotalCriados());
        System.out.println("Próximo ID automático: " + Veiculo.getProximoId());
    }
}
