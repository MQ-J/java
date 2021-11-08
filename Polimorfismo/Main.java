class Main {
  public static void main(String[] args) {
    
    Calculo a = new Calculo();
    Calculo2 b = new Calculo2();

    //olha a importância de prever a necessidade de quem vai usar o código
    a.somar(1, 2);
    a.somar(90, 3, 17);
    a.somar(2, 3.5);

    b.somar(1, 2);
  }
}