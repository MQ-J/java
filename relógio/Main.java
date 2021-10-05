//para pedir dados pelo teclado
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("INICIANDO RELÓGIO\n");
    Scanner teclado = new Scanner(System.in);

    //criando objetos da classe ponteiros
    Ponteiro horas = new Ponteiro();
    Ponteiro minutos = new Ponteiro();
    Ponteiro segundos = new Ponteiro();

    //definindo quantas horas valem cada rotação deles
    horas.rotação = 12;
    minutos.rotação = 1;
    segundos.rotação = 0.0166666667f;

    //usuário escolhe quantas vezes os ponteiros giram
    System.out.println("quantas vezes o ponteiro das horas girou: ");
    horas.vezes = teclado.nextInt();
    System.out.println("quantas vezes o ponteiro dos minutos girou: ");
    minutos.vezes = teclado.nextInt();
    System.out.println("quantas vezes o ponteiro dos segundos girou: ");
    segundos.vezes = teclado.nextInt();

    //programa calcula total de horas e mostra na tela
    System.out.println("Total de horas:" + 
    (horas.girar(horas.rotação, horas.vezes) +
    minutos.girar(minutos.rotação, minutos.vezes) + 
    segundos.girar(segundos.rotação, segundos.vezes)));

    System.out.println("\nENCERRANDO RELÓGIO");

  }
}