/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.evaluada.pkg4.joseph.salazar.guzman;

/**
 *
 * @author salaza5x
 */
public class Participantes {

    private String Nombre;
    private int Edad;
    private int NCorredor;
    private int TiempoEstimado;
    private int TiempoReal;

    // Creacion del constructor para participantes con cada Caracteristica
    public Participantes(String nombre, int edad, int numeroCorredor, int tiempoEstimado) {
        this.Nombre = nombre;
        this.Edad = edad;
        this.NCorredor = numeroCorredor;
        this.TiempoEstimado = tiempoEstimado;
        this.TiempoReal = 0;
    }

    // Getters y set de tiempo real, de cada caraceristica
    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getNumeroCorredor() {
        return NCorredor;
    }

    public int getTiempoEstimado() {
        return TiempoEstimado;
    }

    public int getTiempoReal() {
        return TiempoReal;
    }

    public void setTiempoReal(int tiempoReal) {
        this.TiempoReal = tiempoReal;
    }

    // Metodo utilizado para obtener la categoria de Juvenil, Adulto y master segun la edad
    public String getCategoria() {
        if (Edad <= 18) {
            return "Juvenil";
        } else if (Edad <= 40) {
            return "Adulto";
        } else {
            return "Master";
        }
    }

    // Representación en texto del participante
    @Override
    public String toString() {
        return "Participante{"
                + "Nombre='" + Nombre + '\''
                + ", Edad=" + Edad
                + ", Numero=" + NCorredor
                + ", TiempoEstimado=" + TiempoEstimado
                + ", TiempoReal=" + TiempoReal
                + ", La Categoría es:=" + getCategoria()
                + '}';
    }
}
