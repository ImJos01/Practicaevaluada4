/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.evaluada.pkg4.joseph.salazar.guzman;

/**
 *
 * @author salaza5x
 */
public class Maraton {

    private Participantes[] participantes;
    private int Contador;

    // Constructor que define un tamaño máximo para los participantes
    public Maraton(int CapacidadMaxima) {
        this.participantes = new Participantes[CapacidadMaxima];
        this.Contador = 0;
    }

    // Registra un nuevo participante
    public boolean registrarParticipante(Participantes participante) {
        if (Contador >= participantes.length) {
            return false; // 
        }

        // Verifica si el número de corredor ya existe
        for (int i = 0; i < Contador; i++) {
            if (participantes[i].getNumeroCorredor() == participante.getNumeroCorredor()) {
                return false;
            }
        }

        participantes[Contador++] = participante;
        return true;
  }
