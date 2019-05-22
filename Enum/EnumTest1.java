public class EnumTest1 {
 
  private enum PTCARDEAL { NORTE, SUL, LESTE, OESTE }

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

