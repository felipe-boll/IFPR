package ex.felipeBoll_lista_04;

import java.util.Scanner;

public class FelipeBoll_05 {

  public static int somaDoIntervalo(int valor1, int valor2, int i) {
    int soma = 0;
    i = valor1;

    if (i == valor1) {
      i++;
    }
    do {
      soma = soma + i;
      i++;
    } while (i < valor2);
    return soma;
  }

  public static void main(String[] args) {
    Scanner tecladoScanner = new Scanner(System.in);

    int resultadoSoma = 0;
    int i = 0;

    System.out.println("Informe o primeiro valor");
    int valor1 = tecladoScanner.nextInt();

    System.out.println("Informe o segundo valor");
    int valor2 = tecladoScanner.nextInt();

    resultadoSoma = somaDoIntervalo(valor1, valor2, i);
    System.out.println(resultadoSoma);

    tecladoScanner.close();
  }
}
