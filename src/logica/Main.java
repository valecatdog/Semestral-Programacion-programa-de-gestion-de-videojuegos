package logica;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Videojuego> listaVideojuegos = new ArrayList<>();
        String nombre;
        Year anioLanz;
        int pegi;
        String genero;
        
        for (int i = 0; i < 1; i++){
            System.out.println("Ingrese el nombre del juego: ");
            nombre = scan.nextLine();
            
            System.out.println("Ingrese el año de lanzamiento del juego: ");
            anioLanz = Year.of(scan.nextInt());
            nombre = scan.nextLine();
            
            System.out.println("Ingrese el PEGI del juego: ");
            pegi = scan.nextInt();
            nombre = scan.nextLine();
            
            System.out.println("Ingrese el genero del juego: ");
            genero = scan.nextLine();
            
            Videojuego videojuego = new Videojuego(nombre, pegi, genero, anioLanz);
            System.out.println(videojuego);
            listaVideojuegos.add(videojuego);
        }
        
        System.out.println("\n");
        for (Videojuego v : listaVideojuegos){
            System.out.println(v);
        }
        
        listaVideojuegos.get(0).setGeneroPorCodigo(3);
        System.out.println("\n");
        System.out.println(listaVideojuegos.get(0));
               
    }
    
}
