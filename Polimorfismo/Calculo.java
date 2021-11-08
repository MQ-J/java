public class Calculo {

  // POLIMORFISMO POR SOBRECARGA DE MÉTODOS

  public void somar(int n1, int n2)
  {
    System.out.println("soma é....: " + (n1 + n2));
  }

  public void somar(int n1, double n2)
  {
    System.out.println("soma é....: " + (n1 + n2));
  }

  public void somar(int n1, int n2, int n3)
  {
    System.out.println("soma é....: " + (n1 + n2 + n3));
  }
}