

public class Cotacao {

  double valor;
  enum_Moeda moeda;

  public Cotacao(double v, enum_Moeda m) {
    this.valor = v;
    this.moeda = m;

  }

  void converterReal() {
    System.out.println("\n");
    switch (moeda) {
      case DOLARES:
        System.out.println(4.95 * valor + " Reais");
        break;
      case EUROS:
        System.out.println(5.25 * valor + " Reais");
        break;
      case LIBRA:
        System.out.println(6.25 * valor + " Reais");
        break;

    }

  }

}