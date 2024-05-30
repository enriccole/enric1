package bancsapp;

public class Aplicacio {

    public static void main(String[] args) {

        System.out.println("Introdueix el nom del compte bancari 1: ");
        String nom = cLlegir.dato();
        System.out.println(".................................................");
        System.out.println("Introdueix el nombre secret del compte bancari 1: ");
        int numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte1 = new CompteBancari(nom, numero);

        System.out.println("Introdueix el nom del compte bancari 2: ");
        nom = cLlegir.dato();
        System.out.println(".................................................");
        System.out.println("Introdueix el nombre secret del compte bancari 2: ");
        numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte2 = new CompteBancari(nom, numero);

        System.out.println("Introdueix l'import de l'ingrés: ");
        double importIngres = cLlegir.datoDouble();
        compte1.ingressar(importIngres);
        compte2.retirar(importIngres);
    }
}