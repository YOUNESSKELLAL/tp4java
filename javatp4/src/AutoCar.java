public class AutoCar extends Vehicule {

  private static int nbMaxAutoCar = 10;
  private static int capacite = 60;
  private static int nbAutocar = 0;
  private Carburant carburant;

  private Camion() {}

  private Camion(int model, double prix, Carburant carburant) {
    this.setMatricule(this.getClass().getName() + ":" + ++nbAutocar);
    this.setModel(model);
    this.setPrix(prix);
  }

  public static Camion createAutocar(int modele, double prix, Carburant carburant) {
    if (nbAutocar < nbMaxAutoCar) return new AutoCar(
      modele,
      prix,
      carburant
    ); else return null;
  }

  public static Camion(){
    if (nbVoitures < nbMaxVoitures) return new AutoCar();
    return null;
  }
}
