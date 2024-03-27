import java.util.ArrayList;
import java.util.Scanner;

import Controller.Fabricas.Adidas;
import Controller.Fabricas.Kappa;
import Controller.Fabricas.Nike;
import Controller.Fabricas.Puma;
import Controller.Fabricas.Umbro;
import Interface.IProduto;

class Main {
  public static void main(String[] args) {
    ArrayList<IProduto> produtos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual a fábrica? ");
    String fabrica = scanner.nextLine().toLowerCase();

    System.out.print("Qual a tamanho? ");
    String tamanho = scanner.nextLine().toUpperCase();

    System.out.print("Qual o time? ");
    String time = scanner.nextLine().toUpperCase();

    switch (fabrica) {
      case "adidas":
        produtos.add(new Adidas().fazCamiseta(0, time, tamanho));
        break;

      case "kappa":
        produtos.add(new Kappa().fazCamiseta(0, time, tamanho));
        break;

      case "nike":
        produtos.add(new Nike().fazCamiseta(0, time, tamanho));
        break;

      case "puma":
        produtos.add(new Puma().fazCamiseta(0, time, tamanho));
        break;

      case "umbro":
        produtos.add(new Umbro().fazCamiseta(0, time, tamanho));
        break;

      default:
        System.out.println("\nEsta fábrica não está cadastrada no nosso sistema!\n");
        break;
    }

    System.out.println("Produtos criados - \n");
    for (IProduto produto : produtos) {
      System.out.println(produto);
    }

    scanner.close();
  }
}
