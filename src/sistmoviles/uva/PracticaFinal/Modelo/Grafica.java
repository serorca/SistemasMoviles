package sistmoviles.uva.PracticaFinal.Modelo;

import java.util.Date;

public class Grafica {
    /* Importar los elementos necesarias para crear la gráfica */
    private Date fecha;
    private Usuario usuario;
    
    public Grafica (Date fecha, Usuario usuario){
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}