package sistmoviles.uva.PracticaFinal.Modelo;


import java.util.ArrayList;

public class Dieta {

    private String nombre;
    private ArrayList<Receta> desayuno;
    private ArrayList<Receta> almuerzo;
    private ArrayList<Receta> comida;
    private ArrayList<Receta> merienda;
    private ArrayList<Receta> cena;
    
    public Dieta (String nombre, ArrayList<Receta> desayuno, ArrayList<Receta> almuerzo,
            ArrayList<Receta> comida, ArrayList<Receta> merienda,
            ArrayList<Receta> cena){
            this.nombre = nombre;
            this.desayuno = desayuno;
            this.almuerzo = almuerzo;
            this.comida = comida;
            this.merienda = merienda;
            this.cena = cena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Receta> getDesayuno() {
        return desayuno;
    }

    public void setDesayuno(ArrayList<Receta> desayuno) {
        this.desayuno = desayuno;
    }

    public ArrayList<Receta> getAlmuerzo() {
        return almuerzo;
    }

    public void setAlmuerzo(ArrayList<Receta> almuerzo) {
        this.almuerzo = almuerzo;
    }

    public ArrayList<Receta> getComida() {
        return comida;
    }

    public void setComida(ArrayList<Receta> comida) {
        this.comida = comida;
    }

    public ArrayList<Receta> getMerienda() {
        return merienda;
    }

    public void setMerienda(ArrayList<Receta> merienda) {
        this.merienda = merienda;
    }

    public ArrayList<Receta> getCena() {
        return cena;
    }

    public void setCena(ArrayList<Receta> cena) {
        this.cena = cena;
    }
    
}