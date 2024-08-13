package entities;

public class SomaMedia {
    private static double soma, media;
    static double[] vetor = PopularVetor.getVetor();

    public static double getMedia() {
        return media;
    }
    public static double getSoma() {
        return soma;
    }

    public static double soma() {
        for (int i = 0; i < vetor.length; i++ ) {
            soma += vetor[i];
        }
        return soma;
    }

    public static double media (double[] vetor) {
        media = soma / vetor.length;
        return media;
    }
}
