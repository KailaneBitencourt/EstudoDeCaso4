/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemadetransporte;

/**
 *
 * @author kailane
 */
public abstract class Transporte {
    public int capacidade;
    
    public Transporte(int capacidade){
        this.capacidade = capacidade;
    }
    
    public abstract String mostrarDetalhe();
}
