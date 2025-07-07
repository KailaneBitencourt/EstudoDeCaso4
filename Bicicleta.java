/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.sistemadetransporte;

/**
 *
 * @author kailane
 */
public class Bicicleta extends Transporte{
    public boolean temMarcha;
    
    public Bicicleta(int capacidade, boolean temMarcha){
        super(capacidade);
        this.temMarcha = temMarcha;
    }
    
    @Override
    public String mostrarDetalhe(){
        return  """
                BICLETA
                 Capacidade: """ + capacidade +
                "\n Tem marcha? " + temMarcha;
    }
    
}
