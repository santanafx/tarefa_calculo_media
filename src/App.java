public class App {
    public static void main(String[] args) {
        calcularMedia();
    }

    private static void calcularMedia() {
      int nota1 = 10;
      int nota2 = 5;
      int nota3 = 6;
      int nota4 = 7;

      int resultado = (nota1 + nota2 + nota3 + nota4) / 4;

      System.out.println(resultado);
    }
}
