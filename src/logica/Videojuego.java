package logica;

import java.time.LocalDate;

public class Videojuego {
    private String nombre;
    private int pegi;
    private String genero; 
    private LocalDate anioLanzamiento; 
    
    public Videojuego (){
       
    }
    
    public Videojuego (String nombre, int pegi, String genero, LocalDate anioLanzamiento){
        this.nombre = nombre;
        this.pegi = pegi;
        this.genero = genero;
        if (anioLanzamiento.getYear() < 2000){
            anioLanzamiento = LocalDate.of(2000,anioLanzamiento.getMonthValue(), anioLanzamiento.getDayOfMonth());
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

    public LocalDate getAñoLanzamiento() {
        return anioLanzamiento;
    }

    public void setAñoLanzamiento(LocalDate añoLanzamiento) {
        if (anioLanzamiento.getYear() < 2000){
            anioLanzamiento = LocalDate.of(2000,anioLanzamiento.getMonthValue(), anioLanzamiento.getDayOfMonth());
        }
        else{
            this.anioLanzamiento = anioLanzamiento;
        }
    }
    
    public void setGeneroPorCodigo(int codigo){
        if(codigo == 1 || codigo == 2 || codigo == 3){
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
