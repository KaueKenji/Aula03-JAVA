

public class Agenda {



  int dia;
  enum_DiaDaSemana dias;

  public Agenda(int d, enum_DiaDaSemana ds) {
    this.dia = d;
    this.dias = ds;

  }

  void VerificarTarefa() {
    switch (dias) {
      case SEGUNDA:
        System.out.println("\n"+dia + " dia de JAVA");
        break;
      case QUARTA:
        System.out.println("\n"+dia + " dia de LINUX");
        break;
      case SEXTA:
        System.out.println("\n"+dia + " dia de MALDADE");
        break;
      case SABADO:
        System.out.println("\n"+dia + " dia de COBOL");
        break;
      case DOMINGO:
        System.out.println("\n"+dia + " dia de PEIXÃO");
        break;
      default:
        System.out.println("\nDIA CHATO");
        break;
    }

  }

}