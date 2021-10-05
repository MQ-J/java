public class Galaxia {

  //ATRIBUTOS - GALAXIA
  private String Espectro;

  //CLASSES INTERNAS - GALAXIA
  public class BuracoNegro {
    public int massa;
    public void sugatudo() {
      System.out.println("buraco negro está sugando!");
    }
  }
  public class SistemaPlanetario {
    public class Estrela {
      public int massa;
      public int temperaturamedia;
      public void morrer() {
        System.out.println("estrela morreu!");
      }
      public void transformar() {
        System.out.println("estrela se transformou!");
      }
    }
    public class Planeta {
      public int gravidade;
      public int raio;
      public void translacao() {
        System.out.println("planeta orbitou estrela!");
      }
    }
  }

  //MÉTODOS - GALAXIA
  public void rotacao() {
    System.out.println("galáxia está rodando!");
  }
  
}