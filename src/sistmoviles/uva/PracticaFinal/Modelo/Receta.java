package sistmoviles.uva.PracticaFinal.Modelo;

import java.util.ArrayList;

public class Receta {
    private String nombre;
    private ArrayList<Ingrediente> ingredientes;
    
    public Receta (String nombre, ArrayList<Ingrediente> ingredientes){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}