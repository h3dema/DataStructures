

class TesteArvore {

  public static void main(String[] args) {
    Arvore<Integer> a = new Arvore<>(1);

    a.inserir(4);
    a.inserir(8);
    a.inserir(9);
    a.inserir(2);
    a.inserir(10);
    a.inserir(11);
    a.inserir(12);
    
    System.out.println(a.toString());
    System.out.println("altura:" + a.altura());
    a.balancear();
    System.out.println("altura:" + a.altura());
    System.out.println(a.toString());
    
  }

}