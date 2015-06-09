package sistmoviles.uva.PracticaFinal.Modelo;


public class Ingrediente {
    
    private String nombre;
    private double calorias;
    private double proteinas;
    private double hidratos;
    private double grasas;
    private double azucar;
    private int prueba;
    
    public Ingrediente (String nombre, double calorias, double proteinas,
            double hidratos, double grasas, double azucar){
        this.setNombre(nombre);
        this.setCalorias(calorias);
        this.setProteinas(proteinas);
        this.setHidratos(hidratos);
        this.setGrasas(grasas);
        this.setAzucar(azucar);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getHidratos() {
		return hidratos;
	}

	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	public double getGrasas() {
		return grasas;
	}

	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}
    
}