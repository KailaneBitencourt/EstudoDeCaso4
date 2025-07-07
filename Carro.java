/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemadetransporte;

/**
 *
 * @author kailane
 */
public class Carro extends Transporte{
    public String combustivel;
    
    public Carro(int capacidade, String combustivel){
        super(capacidade);
        this.combustivel = combustivel;
    }
    @Override
    public String mostrarDetalhe(){
        return """
               CARRO
                Capacidade: """ + capacidade +
                "\n Combustivel: " + combustivel;
    }
}
