package Interface;

public interface IProduto {
  public int getId();

  public String getFabrica();

  public String getTamanho();

  public String getTime();

  @Override
  String toString();
}
