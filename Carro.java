public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("Hyundai", 2021);

        System.out.println("Automóvel");
        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Ano: " + c1.getAno());
    }
}