/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ángel Redondo Pliego   
 */  
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Practica Vehiculo");
        System.out.println("Creamos un vehiculo electrico con datos aleatorios");

        String matricula = generarMatriculaAleatoria();
        String bastidor = generarBastidorAleatorio();

        VehiculoElectrico miElectrico = new VehiculoElectrico(matricula, bastidor);

        System.out.println("Matricula generada: " + matricula);
        System.out.println("Bastidor generado: " + bastidor);

        miElectrico.acelerar(80);
        miElectrico.reducir(30);
        miElectrico.frenar();
    }

    public static String generarMatriculaAleatoria() {
        Random rand = new Random();
        int numeros = rand.nextInt(9000) + 1000; // Apaño para forzar 1000 a 9999
        String letras = "";
        for (int i = 0; i < 3; i++) {
            letras += (char) (rand.nextInt(26) + 'A');
        }
        return numeros + letras;
    }

    public static String generarBastidorAleatorio() {
        Random rand = new Random();
        int numero = rand.nextInt(900) + 100; // Apaño para forzar 100 a 999
        return "TESLA" + numero;
    }
}