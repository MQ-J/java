public class Calculo2 extends Calculo {
  
  // POLIMORFISMO POR SOBREPOSIÇÃO DE MÉTODOS

  @Override
  public void somar(int n1, int n2)
  {
    System.out.println("estou sobrepondo um método existente. sua soma: " + (n1 + n2));
  }
}