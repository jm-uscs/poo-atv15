package uscs;

public class TestaNulo {
    public static void main(String[] args) {
        String texto = null;
        int num;
        try {
            System.out.println("Tamanho do texto: " + texto.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um objeto nulo.");
        }
    }
}
