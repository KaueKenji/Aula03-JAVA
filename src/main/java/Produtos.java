

public class Produtos {
  String nome;
  double preco;
  enum_Tipo tipo;

  Produtos(String n, double p, enum_Tipo t) {
    this.nome = n;
    this.preco = p;
    this.tipo = t;

  }

  void info() {

    System.out.println("\nNome: " + nome);
    System.out.println("Preço: " + preco);
    System.out.println("Tipo: " + tipo);

  }

  void calcularDesconto() {
    switch (tipo) {
      case LIVRO:
        System.out.println("Com 15% de desconto: R$" + preco * 0.85);
        break;

      case ESCRITORIO:
        System.out.println("Com 20% de desconto: R$" + preco * 0.8);
        break;
      case TECNOLOGIA:
        System.out.println("Com 10% de desconto: R$" + preco * 0.9);
        break;
    }

  }

}