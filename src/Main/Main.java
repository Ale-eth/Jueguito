package Main;
import Personajes.PersonajePrincipal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonajePrincipal personaje1 = new PersonajePrincipal(100, 25, "unnamed", 0, 0, true, 5);
        System.out.println("Como se llama tu personaje?");
        personaje1.nombre = sc.nextLine();


        while(personaje1.vida > 0){
            if(personaje1.movimientos >0) {
                personaje1.Move();
                personaje1.ShowStats();
            }else{
                personaje1.vida = 0;
                personaje1.Die();
                break;
            }
        }

    }

    public static void ClearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}