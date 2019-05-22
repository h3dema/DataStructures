public class EnumTest2 {
  private enum PTCARDEAL {

  /*
   * texto do poema "Sou quatro pontos cardeais"
   * http://poesiaoriginalissima.blogspot.com.br/2010/01/sou-quatro-pontos-cardeais.html
   */
  NORTE {
    @Override
    public String toString() {
      return "Norte é vida verde na terra…meu consciente";
    }
  },
  SUL {
    @Override
    public String toString() {
      return "Sul é água volta e revolta…num vario extenso";
    }
  },
  LESTE {
    @Override
    public String toString() {
      return "Este é cada aurora incluída neste dia\n"+
             "Acordo e penso: num sobressalto";
    }
  },
  OESTE {
    @Override
    public String toString() {
      return "Oeste…a certeza do presente";
    }
  }
}
public static void main(String[] args) {
    
  //Mostra a conversão
  PTCARDEAL norte = PTCARDEAL.valueOf("NORTE");
  System.out.println(norte);
  PTCARDEAL sul = PTCARDEAL.valueOf("SUL");
  System.out.println(sul);
  PTCARDEAL leste = PTCARDEAL.valueOf("LESTE");
  System.out.println(leste);
    
}
}
