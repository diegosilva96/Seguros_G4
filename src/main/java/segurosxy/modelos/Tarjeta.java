package segurosxy.modelos;

public class Tarjeta {
  protected String bancoTarjeta;

  public Tarjeta(String bancoTarjeta) {
    this.bancoTarjeta = bancoTarjeta;
  }

  public String getBancoTarjeta() {
    return bancoTarjeta;
  }

  public void setBancoTarjeta(String bancoTarjeta) {
    this.bancoTarjeta = bancoTarjeta;
  }
}
