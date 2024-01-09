public class Voiture extends Vehicule implements Decapotable {

  private static int nbMaxVoitures = 10;
  private static int capacite = 60;
  private static int nbVoitures = 0;
  private Carburant carburant;
  private int periodiciteVidange;
  private boolean toitReplie;

  private Voiture() {}

  private Voiture(int modele, double prix, Carburant carburant) {
    this.setMatricule(this.getClass().getName() + ":" + ++nbVoitures);
    this.setCarburant(carburant);
    this.setPrix(prix);
  }


  public static Voiture createVoiture(int modele, double prix, Carburant carburant) {
    if (nbVoitures < nbMaxVoitures) return new Voiture(
      modele,
      prix,
      carburant
    ); else return null;
  }

  public static Voiture(){
    if (nbVoitures < nbMaxVoitures) return new Voiture();
    return null;
  }
  @Override
  public void replieLeToit() {
    toitReplie = true;
  }

  public int getPeriodiciteVidange() {
    return periodiciteVidange;
  }

  public String toString() {
    return (
      "Voiture " +
      super.toString() +
      ", type du carburant: " +
      carburant +
      ", periodicite de vidange:" +
      periodiciteVidange +
      " mois"
    );
  }
}
