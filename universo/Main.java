class Main {
  public static void main(String[] args) {

    //TÍTULO
    System.out.println("### UNIVERSO ###\n");

    //nome da galáxia
    Galaxia Andromeda = new Galaxia();
    Andromeda.rotacao();

    //nome do buraco negro
    Galaxia.BuracoNegro Faustão = Andromeda.new BuracoNegro();
    Faustão.sugatudo();

    //nome do sistema planetário
    Galaxia.SistemaPlanetario sistemaAntar = Andromeda.new SistemaPlanetario();

    //nome da estrela
    Galaxia.SistemaPlanetario.Estrela Antares = sistemaAntar.new Estrela();
    Antares.transformar();

    //nome do planeta
    Galaxia.SistemaPlanetario.Planeta Kripton = sistemaAntar.new Planeta();
    Kripton.translacao();
  }

}

