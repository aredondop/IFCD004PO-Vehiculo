/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ángel Redondo Pliego
 */
public abstract class Vehiculo {

    private String matricula, bastidor;
    protected int velocidad;
    
    public Vehiculo( String matricula, String bastidor){
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.velocidad = 0;
        
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public String getBastidor() {
        return bastidor;
    }
    
    public abstract void acelerar(int cantidad);
    public abstract void reducir(int cantidad);
    public abstract void frenar();
    
    public void mostrarEstado() {
        System.out.println("Vehiculo " + matricula + " (bastidor: " + bastidor + ") va a " + velocidad + " km/h.");
    }

}