package Personajes;

import java.util.Scanner;

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
            System.out.println("-> Movete hacia alguna direccion:");
            String direccion = sc.nextLine();
            direccion = direccion.toLowerCase();

            if(ValidarMovimiento(direccion)){
                switch(direccion){
                    case "arriba":
                        this.pos_coordY = pos_coordY+1;
                        System.out.println(this.nombre+", se movio 1 posicion hacia arriba");
                        this.movimientos--;
                        break;

                    case "abajo":
                        this.pos_coordY = pos_coordY-1;
                        System.out.println(this.nombre+", se movio 1 posicion hacia abajo");
                        this.movimientos--;
                        break;

                    case "derecha":
                        this.pos_coordX = pos_coordX+1;
                        System.out.println(this.nombre+", se movio 1 posicion hacia la derecha");
                        this.movimientos--;
                        break;

                    case "izquierda":
                        this.pos_coordX = pos_coordX-1;
                        System.out.println(this.nombre+", se movio 1 posicion hacia la izquierda");
                        this.movimientos--;
                        break;

                }
            }else{
                while(!ValidarMovimiento(direccion)) {
                    System.out.println("La direccion no es valida, elije: Arriba Abajo Izquierda o Derecha: ");
                    direccion = sc.nextLine();
                    direccion = direccion.toLowerCase();
                }
            }

            System.out.println("----------------------------------");
        }

        public boolean ValidarMovimiento(String direccion){
        boolean valid = direccion.equals("arriba") || direccion.equals("abajo") || direccion.equals("derecha") || direccion.equals("izquierda");
            return valid;
        }


        public void Die(){
            System.out.println("Vida: "+this.vida+", te moriste");
        }

        public void ShowStats(){
            System.out.println("* Datos de "+ this.nombre+ " *");
            System.out.println("Posicion xy: "+this.pos_coordX+" - "+this.pos_coordY);
            System.out.println("Vida: "+ this.vida);
            System.out.println("Te quedan " +this.movimientos+ " movimientos");
            System.out.println("----------------------------------");
        }

    }




