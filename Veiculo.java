public class Veiculo {
    private final int id;
    private String modelo;

    // Contador estático para IDs automáticos
    private static int proximoId = 1001;
    private static int totalCriados = 0;

    // Construtor principal
    public Veiculo(int id, String modelo) {
        this.id = id;
        if (modelo == null || modelo.trim().isEmpty()) {
            this.modelo = "Indefinido";
        } else {
            this.modelo = modelo;
        }
        totalCriados++;
    }

    // Construtor com sobrecarga (gera id automaticamente)
    public Veiculo(String modelo) {
        this(proximoId, modelo);
        proximoId++;
    }

    // Construtor sem parâmetros
    public Veiculo() {
        this("Genérico");
    }

    // Método estático para saber o próximo ID
    public static int getProximoId() {
        return proximoId;
    }

    // Retorna descrição do veículo
    public String descricao() {
        return "Veículo [id=" + id + ", modelo=" + modelo + "]";
    }

    // Total de veículos criados
    public static int getTotalCriados() {
        return totalCriados;
    }
}