package sistmoviles.uva.PracticaFinal.Modelo;

public class ListaCompra {
    private int id;
    private Dieta dieta;
    
    public ListaCompra (int id, Dieta dieta){
        this.id = id;
        this.dieta = dieta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
}