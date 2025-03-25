/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel Redondo Pliego
 */
public class VehiculoElectrico extends Vehiculo{
    private int nivelBateria; // %
    
    public VehiculoElectrico( String matricula, String bastidor){
        super(matricula, bastidor);
        this.nivelBateria = 100;
    }
    
    @Override
    public void acelerar(int cantidad) {
        if (nivelBateria > 0) {
            velocidad += cantidad;
            nivelBateria -= cantidad * 0.2; // gasta batería
            System.out.println("Vehiculo electrico acelera " + cantidad + " km/h");
        } else {
            System.out.println("Bateria descargada. No puede acelerar.");
        }
        mostrarEstado();
    }

    @Override
    public void reducir(int cantidad) {
        velocidad = Math.max(0, velocidad - cantidad);
        System.out.println("Reduccion de velocidad: -" + cantidad + " km/h");
        mostrarEstado();
    }

    @Override
    public void frenar() {
        velocidad = 0;
        System.out.println("Vehiculo electrico ha frenado.");
        mostrarEstado();
    }

    public void recargar() {
        nivelBateria = 100;
        System.out.println("Bateria recargada al 100%");
    }

}