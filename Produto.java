public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro!! O preço não pode ser negativo!");
        }
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Shampoo", 30.0);
        System.out.println(p1.getNome() + " - R$" + p1.getPreco());

        Produto p2 = new Produto("Condicionador", -25.0);
        System.out.println(p2.getNome() + " - R$" + p2.getPreco());

        p2.setPreco(25.0);
        System.out.println(p2.getNome() + " - R$" + p2.getPreco());

        p1.setPreco(-99.0);
        System.out.println(p1.getNome() + " - R$" + p1.getPreco());
    }
}
