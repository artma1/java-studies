package entities;

public class PessoasAlturas {
    private String nome;
    private int idade;
    private double altura, porcent, media;

    public PessoasAlturas(String nome, int idade, double altura) {
        this.nome= nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public double getPorcent() {
        return porcent;
    }

    public String getNome() {
        return nome;
    }
}
