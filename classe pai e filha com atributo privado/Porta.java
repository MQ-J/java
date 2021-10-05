//CLASSE PAI
public class Porta {

  //atributos privados
  private String Cor;
  private float Largura, Altura;
  private double Peso;

  //métodos gerais
  public void abrir() {}
  public void fechar() {}

  //método set (para editar atributo privado)
  public void setCor(String escolha) { Cor = escolha;}
  //método get (para ver atributo privado)
  public String getCor() { return Cor; }

}

//CLASSE FILHA
class PortaCozinha extends Porta {
}