package Controller.Fabricas;

import Controller.Camiseta;
import Interface.IFabrica;
import Interface.IProduto;

public class Kappa implements IFabrica {
  public IProduto fazCamiseta(int id, String time, String tamanho) {
    return new Camiseta(id, "Kappa", time, tamanho);
  }
}
