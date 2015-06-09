package sistmoviles.uva.PracticaFinal.Modelo;

public class Usuario {

    private String nombre;
    private String apellido;
    private int edad;
    private int altura;
    private int peso_actual;
    private int peso_objetivo;
    private float IMC;
    private String clasificacion;
    private String genero;
    private String actividad;
    private String alergias;
    private Dieta dieta;
    
    public Usuario (String nombre, String apellido, int edad, int altura,
        int peso_actual, int peso_objetivo, float IMC, String clasificacion, 
        String genero, String actividad, String alergias, Dieta dieta){
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.altura = altura;
            this.peso_actual = peso_actual;
            this.peso_objetivo = peso_objetivo;
            this.IMC = IMC;
            this.clasificacion = clasificacion;
            this.genero = genero;
            this.actividad = actividad;
            this.alergias = alergias;
            this.dieta = dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso_objetivo() {
        return peso_objetivo;
    }

    public void setPeso_objetivo(int peso_objetivo) {
        this.peso_objetivo = peso_objetivo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso_actual() {
        return peso_actual;
    }

    public void setPeso_actual(int peso_actual) {
        this.peso_actual = peso_actual;
    }

    public double getIMC() {
        IMC = altura / (peso_actual * peso_actual);
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }
    
      public String getClasificacion() {
        if (IMC<16.00){
            clasificacion="Delgadez severa";
        } else {
            if (IMC < 17.00){
                clasificacion="Delgadez moderada";
            } else {
                if (IMC < 18.50){
                    clasificacion="Delgadez aceptable";
                } else {
                    if (IMC < 25){
                        clasificacion="Peso normal";
                    } else {
                        if (IMC < 30.00){
                            clasificacion="Sobrepeso";
                        } else{
                            if (IMC < 35.00){
                                clasificacion="Obeso Tipo I";
                            } else{
                                if (IMC <= 40.00){
                                    clasificacion="Obeso Tipo II";
                                } else{
                                    clasificacion="Obeso Tipo III";
                                }            
                            }
                        }
                    }
                }
            }
        }
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
}