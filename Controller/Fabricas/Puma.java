package Controller.Fabricas;

import Controller.Camiseta;
import Interface.IFabrica;
import Interface.IProduto;

public class Puma implements IFabrica {
  public IProduto fazCamiseta(int id, String time, String tamanho) {
    return new Camiseta(id, "Puma", time, tamanho);
  }
}
