public class Camion extends Vehicule {

  private static int nbMaxCamion = 10;
  private static int capacite = 60;
  private static int nbCamion = 0;
  private Carburant carburant;

  private Camion() {}

  private Camion(int model, double prix, Carburant carburant) {
    this.setMatricule(this.getClass().getName() + ":" + ++nbCamion);
    this.setModel(model);
    this.setPrix(prix);
  }

  public Camion createCamion(int modele, double prix, Carburant carburant) {
    if (nbCamion < nbMaxCamion) return new Camion(
      modele,
      prix,
      carburant
    ); else return null;
  }

  public static Camion createCamoin() {
    if (nbCamion < nbMaxCamion) return new Camion();
    return null;
  }

  public String toString() {
    return (
      "Camion " +
      super.toString() +
      ", carburant: " +
      carburant +
      ", periodicite de vidange:" +
      periodiciteVidange +
      " mois"
    );
  }
}
