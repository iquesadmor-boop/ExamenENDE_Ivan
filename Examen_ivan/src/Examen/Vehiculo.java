package Examen;

public class Vehiculo {

	private String Matricula;
	private String Marca;
	private String Modelo;
	private String Estado;
	

    public Vehiculo(String matricula, String marca, String modelo, String estado) {
        this.Matricula = matricula;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Estado = estado;
	
    }
    
    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }


    public String toString() {
        return "Vehiculo{" +
                "matricula='" +Matricula + '\'' +
                ", marca='" + Marca + '\'' +
                ", modelo='" + Modelo + '\'' +
                ", prestado=" + Estado +
                '}';
}
}
