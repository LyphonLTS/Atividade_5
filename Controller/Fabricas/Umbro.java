package Controller.Fabricas;

import Controller.Camiseta;
import Interface.IFabrica;
import Interface.IProduto;

public class Umbro implements IFabrica {
  public IProduto fazCamiseta(int id, String time, String tamanho) {
    return new Camiseta(id, "Umbro", time, tamanho);
  }
}
