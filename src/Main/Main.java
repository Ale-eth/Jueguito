package Main;
import Personajes.PersonajePrincipal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonajePrincipal personaje1 = new PersonajePrincipal(100, 25, "unnamed", 0, 0);
        System.out.println("Como se llama tu personaje?");
        personaje1.nombre = sc.nextLine();

        System.out.println(personaje1);

    }
}