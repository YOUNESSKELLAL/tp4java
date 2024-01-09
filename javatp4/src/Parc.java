import java.io.*;

public class Parc {

  public static void main(String[] args) {
    Voiture voiture1 = Voiture.createVoiture("2020", 24000, Carburant.diesel);
    Voiture voiture2 = Voiture.createVoiture("2018", 40000, Carburant.essence);

    voiture1.addCarburant(30);
    voiture1.periodiciteVidange();
    System.out.println(voiture1.toString());
    voiture2.addCarburant(50);
    voiture2.periodiciteVidange();
    System.out.println(voiture2.toString());

    //serialiser
    FileOutputStream outputStream = new FileOutputStream("");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(
      outputStream
    );
    objectOutputStream.writeObject(voiture1);
    objectOutputStream.writeObject(voiture2);
    objectOutputStream.close();
    //de-serialiser

  }
}
