
import Trasportes.Automovil;
import Trasportes.Avion;
import Trasportes.Vehiculo;
import Trasportes.motocicleta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Automovil bMo = new Automovil();
        motocicleta bMot = new motocicleta();
        Avion bAvi = new Avion();
        bMo.seguridad();
        bMo.setRuedas(4);
       imprimirRuedas(bMo);
        
        bMot.chopper();
        bMot.setRuedas(2);
        imprimirRuedas(bMot);
        
        bAvi.movimiento();
        bAvi.setRuedas(24);
        imprimirRuedas(bAvi);
    }
    public static void imprimirRuedas(Vehiculo arg){
        String sTipoVeh = "";
        if(arg instanceof Automovil)
             sTipoVeh = "Automovil";
        else if(arg instanceof motocicleta)
             sTipoVeh = "motociicleta";
        else 
             sTipoVeh = "Avion";
        
        System.out.print("ruedas del vehiculo es:" + arg.getRuedas());
        //si es un automovil,imprimiir la seguridad
        if (arg instanceof Automovil){
            //convertir el vehiculo a automovil
            Automovil bMo = (Automovil)arg;
            bMo.seguridad();
        }
    }
    
}

        