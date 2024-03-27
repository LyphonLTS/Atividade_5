package Controller;

import Interface.IProduto;

public class Camiseta implements IProduto {
  private int id;
  private String fabrica;
  private String time;
  private String tamanho;

  public Camiseta(int id, String fabrica, String time, String tamanho) {
    this.id = id;
    this.fabrica = fabrica;
    this.time = time;
    this.tamanho = tamanho;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFabrica() {
    return this.fabrica;
  }

  public void setFabrica(String fabrica) {
    this.fabrica = fabrica;
  }

  public String getTamanho() {
    return this.tamanho;
  }

  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }

  public String getTime() {
    return this.time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "\nFabrica: " + this.fabrica + "\nTamanho: " + this.tamanho + "\nTime: " + this.time;
  }
}
