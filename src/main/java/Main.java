
public class Main {
  public static void main(String[] args) {


    Agenda a = new Agenda(64, enum_DiaDaSemana.SEGUNDA);
    a.VerificarTarefa();

    Cotacao d = new Cotacao(100, enum_Moeda.DOLARES);
    d.converterReal();

    Cotacao e = new Cotacao(100, enum_Moeda.EUROS);
    e.converterReal();

    Cotacao l = new Cotacao(100, enum_Moeda.LIBRA);
    l.converterReal();

    Produtos livro = new Produtos("Livro", 50, enum_Tipo.LIVRO);
    livro.info();
    livro.calcularDesconto();

    Produtos escritorio = new Produtos("Escritorio", 200, enum_Tipo.ESCRITORIO);
    escritorio.info();
    escritorio.calcularDesconto();

    Produtos tecnologia = new Produtos("Tecnologia", 300, enum_Tipo.TECNOLOGIA);
    tecnologia.info();
    tecnologia.calcularDesconto();
    
  }

 
}