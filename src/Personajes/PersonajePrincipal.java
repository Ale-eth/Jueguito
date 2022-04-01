package Personajes;

import java.util.Scanner;

import static Main.Main.ClearScreen;

public class PersonajePrincipal {

        // Atributos
        public int vida;
        public int movimientos;
        public int daño;
        public String nombre;
        int pos_coordY;
        int pos_coordX;
        public boolean vivo;

        // Constructor
        public PersonajePrincipal(int vida, int daño, String nombre, int pos_coordY, int pos_coordX,boolean vivo, int movimientos){
            this.vida = vida;
            this.daño = daño;
            this.nombre = nombre ;
            this.pos_coordY = pos_coordY;
            this.pos_coordX = pos_coordX;
            this.movimientos = movimientos;
            this.vivo = vivo;
        }

        // Metodos
        public void Move(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Movete hacia alguna direccion:");
            String direccion = sc.nextLine();
            direccion = direccion.toLowerCase();
            ClearScreen();


            switch(direccion){
                case "arriba":
                    this.pos_coordY = pos_coordY+1;
                    System.out.println(this.nombre+", te moviste 1 posicion hacia arriba");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    this.movimientos--;
                    break;

                case "abajo":
                    this.pos_coordY = pos_coordY-1;
                    System.out.println(this.nombre+", te moviste 1 posicion hacia abajo");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    this.movimientos--;
                    break;

                case "derecha":
                    this.pos_coordX = pos_coordX+1;
                    System.out.println(this.nombre+", te moviste 1 posicion hacia la derecha");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    this.movimientos--;
                    break;

                case "izquierda":
                    this.pos_coordX = pos_coordX-1;
                    System.out.println(this.nombre+", te moviste 1 posicion hacia la izquierda");
                    System.out.println("Estas en X: "+pos_coordX+ " Y: "+pos_coordY);
                    this.movimientos--;
                    break;
            }

            System.out.println("----------------------------------");
        }

        public void Die(){
            System.out.println("Vida: "+this.vida+", te moriste");
        }

        public void ShowStats(){
            System.out.println("* Datos del personaje *");
            System.out.println(this.nombre);
            System.out.println("Vida: "+ this.vida);
            System.out.println("Te quedan " +this.movimientos+ " movimientos");
            System.out.println("----------------------------------");
        }

    }




