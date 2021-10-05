//CLASSE PRINCIPAL
class Main {
  public static void main(String[] args) {

    //criando objeto da classe pai
    Porta principal = new Porta();
    //criando objeto da classe filha
    PortaCozinha sanfonada = new PortaCozinha();

    //manuseando atributo privado da classe pai
    principal.setCor("Azul");
    System.out.println("cor da porta principal: " + principal.getCor());

    //manuseando atributo privado da classe pai na filha
    sanfonada.setCor("Amarela");
    System.out.println("cod da porta sanfonada: " + sanfonada.getCor());
  }
}