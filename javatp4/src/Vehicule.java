abstract class Vehicule implements Motorisation {

  private String matricule;
  private String model;
  private double prix;
  private double carburant;

  public double getCarburant() {
    return this.carburant;
  }

  public void setCarburant(double carburant) {
    this.carburant = carburant;
  }

  public String getMatricule() {
    return this.matricule;
  }

  public void setMatricule(String matricule) {
    this.matricule = matricule;
  }

  public String getModel() {
    return this.Model;
  }

  public void setModel(String model) {
    this.model = moedel;
  }

  public double getPrix() {
    return this.prix;
  }

  public void setPrix(double prix) {
    this.prix = prix;
  }

  public String toString() {
    return ("matricule:" + matricule + ",Model:" + model + ", Prix:" + prix);
  }

  public void addCarburant(double carburant) {
    if ((getCarburant() + carburant) <= capacite) setCarburant(
      getCarburant() + carburant
    ); else {
      double max_carburant_ajout = capacite - getCarburant();
      this.setCarburant(capacite);
    }
  }

  @Override
  public Carburant typeCarburant() {
    return carburant;
  }

  @Override
  public void periodiciteVidange() {
    switch (carburant) {
      case diesel:
        periodiciteVidange = 10;
        break;
      case essence:
        periodiciteVidange = 12;
        break;
      case gaz:
        periodiciteVidange = 18;
        break;
      default:
        periodiciteVidange = 12;
    }
  }
}
