/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemadetransporte;

/**
 *
 * @author kailane
 */
public class Onibus extends Transporte{
    public String linha;
    
    public Onibus(int capacidade, String linha){
        super(capacidade);
        this.linha = linha;
    }
    
    @Override
    public String mostrarDetalhe(){
        return """
               ONIBUS
               Capacidade: """ + capacidade +
                "\nLinha: " + linha;
                        
    }
}
