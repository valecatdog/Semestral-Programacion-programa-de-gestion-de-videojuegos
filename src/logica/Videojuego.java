package logica;

import java.time.Year;

public class Videojuego {
    private String nombre;
    private int pegi;
    private String genero; 
    private Year anioLanzamiento; 
    
    public Videojuego (){
       
    }
    
    public Videojuego (String nombre, int pegi, String genero, Year anioLanzamiento){
        this.nombre = nombre;
        this.pegi = pegi;
        this.genero = genero;
        if (anioLanzamiento.getValue() < 2000){
            this.anioLanzamiento = Year.of(2000);
        }
        else{
            this.anioLanzamiento = anioLanzamiento;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Year getAñoLanzamiento() {
        return anioLanzamiento;
    }

    public void setAñoLanzamiento(Year anioLanzamiento) {
        if (anioLanzamiento.getValue() < 2000){
            this.anioLanzamiento = Year.of(2000);
        }
        else{
            if (!(anioLanzamiento.getValue() > Year.now().plusYears(2).getValue())){
                this.anioLanzamiento = anioLanzamiento;
            }
        }
          
    }
    
    public void setGeneroPorCodigo(int codigo){
        if(codigo == 1 || codigo == 2 || codigo == 3){ //verificacion para que si se ingresa un numero invalido no se recorran 
                                                       //todos los if
            if (codigo == 1) {
                this.genero = "Rol";
            }
            else{
                if(codigo == 2){
                    this.genero = "Carreras";
                }
                else{
                    this.genero = "FPS";
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Videojuego{" + "nombre=" + nombre + ", pegi=" + pegi + ", genero=" + genero + ", anioLanzamiento=" + anioLanzamiento + '}';
    }
    
}
