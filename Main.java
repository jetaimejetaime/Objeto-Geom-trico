package objeto.com;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        circulo.exibirInformacoes();

        Retangulo retangulo = new Retangulo(4.0, 6.0);
        retangulo.exibirInformacoes();
    }
}
