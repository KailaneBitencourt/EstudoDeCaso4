/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudodecaso.sistemadetransporte;

/**
 *
 * @author kailane
 */
public class SistemadeTransporte {

    public static void main(String[] args) {
        Transporte[] frota = new Transporte[3];
        
        frota[0] = new Bicicleta(1, true);
        frota[1] = new Onibus(40, "35BI");
        frota[2] = new Carro(5, "Gasolina");
        
        for(Transporte item: frota){
            System.out.println(item.mostrarDetalhe());
        }
    }
}
