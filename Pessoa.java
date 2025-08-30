public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bia", 22);
        Pessoa p2 = new Pessoa("João", 20);

        System.out.println("1ª Pessoa: " + p1.nome + " - Idade: " + p1.idade);
        System.out.println("2ª Pessoa: " + p2.nome + " - Idade: " + p2.idade);
    }
}