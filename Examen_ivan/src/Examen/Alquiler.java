package Examen;

public class Alquiler {

	public static void main(String[] args) {
		
        Vehiculo v = new Vehiculo("1234ABC", "Toyota", "Corolla", "Bueno");

        System.out.println("Detalles del alquiler:");
        System.out.println("Vehículo: " + v.toString());
        System.out.println("Estado del coche: " + v.getEstado());

	}

}
