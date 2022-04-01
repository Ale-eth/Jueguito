package Personajes;

import java.util.Scanner;

public class PersonajePrincipal {

        // Atributos
        public int vida;
        public int daño;
        public String nombre;
        int pos_coordY;
        int pos_coordX;
        public boolean vivo;

        // Constructor
        public PersonajePrincipal(int vida, int daño, String nombre, int pos_coordY, int pos_coordX){
            this.vida = vida;
            this.daño = daño;
            this.nombre = nombre ;
            this.pos_coordY = pos_coordY;
            this.pos_coordX = pos_coordX;
        }

        // Metodos
        public void moverse(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Movete hacia alguna direccion:");
            String direccion = sc.nextLine();
            direccion = direccion.toLowerCase();


            switch(direccion){
                case "arriba":
                    this.pos_coordY = pos_coordY+1;
                    System.out.println("Te moviste 1 posicion hacia arriba");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    this.vida = vida-25;
                    break;

                case "abajo":
                    this.pos_coordY = pos_coordY-1;
                    System.out.println("Te moviste 1 posicion hacia abajo");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    break;

                case "derecha":
                    this.pos_coordX = pos_coordX+1;
                    System.out.println("Te moviste 1 posicion hacia la derecha");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    break;

                case "izquierda":
                    this.pos_coordX = pos_coordX-1;
                    System.out.println("Te moviste 1 posicion hacia la izquierda");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    break;
            }
        }

        public void Morir(){
            System.out.println("Te moriste");
        }

        private void ShowStats(){
            System.out.println("Vida: "+ this.vida);
        }
        
    }




