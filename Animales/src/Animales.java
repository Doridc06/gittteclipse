import java.util.Scanner;
public class Animales {
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("CLASIFICA ANIMALES");

    System.out.print("Intoduce el codigo del animal: ");
    int codigoAnimal = Integer.parseInt(sc.next());

    if ((codigoAnimal >= 0) && (codigoAnimal < 100)) {
      System.out.println("Cateforia: ");
      System.out.println("Mamifero");
    } else if (codigoAnimal == 100) {
      System.out.println("Cateforia: ");
      System.out.println("Mamifero y ave");
    } else if ((codigoAnimal > 100) && (codigoAnimal <= 200)) {
      System.out.println("Cateforia: ");
      System.out.println("Ave");
    } else {
      System.out.println("Cateforia: ");
      System.out.println("Desconocida");
    }
   
    String especie = "";
    switch (codigoAnimal) {
     
      case 1: especie = "Morza";
      break;
      case 2: especie = "Elefante";
      break;
      case 8: especie = "Pantera";
      break;
      case 100: especie = "Ornitorrinco";
      break;
      case 101: especie = "Pinguino";
      break;
      case 105: especie = "Albatros";
      break;
      default: especie = "Desconocida";
  }
    System.out.println("Especie: \n" + especie );
}

}

