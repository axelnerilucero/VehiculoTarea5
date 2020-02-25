
package vehiculo;

import componentes.chasis;
import componentes.motor;
import componentes.llantas;
import coche.tsuru;

public class Vehiculo {
    
    public static void main(String[] args) {
       tsuru auto=new tsuru();
       auto.setMarca("Dodge");
       
       //Cambiar rodada de la llanta
//       auto.getNeu().setRodada((int)14f);
       //System.out.println(auto.getNeu().getRodada());
       
       auto.setMarca("Volkswagen");
       auto.setAño((int) 2018f);
       auto.setModelo("Jetta");
       auto.setNeu(new llantas((int) 16f, "205mm", "Michelin"));
       auto.setEsq(new chasis("230 Kg", true, "Monocasco"));
       auto.setMot(new motor((int) 8f,true, "200hp"));
        System.out.println("Vehiculo");
        System.out.println("Marca:"+auto.getMarca());
        System.out.println("Año:"+auto.getAño());
        System.out.println("Modelo:"+auto.getModelo());
        System.out.println("CHASIS: de tipo "+auto.getEsq().getTipoDeChasis());
        System.out.println("Rigidez:"+auto.getEsq().isRigidez()); 
        System.out.println("Peso:"+auto.getEsq().getPeso());
        System.out.println("MOTOR: de "+auto.getMot().getNumeroDeCilindros()+" cilindros");
        System.out.println("Combustion interna: "+auto.getMot().isCombustionInterna());
        System.out.println("Potencia:"+auto.getMot().getPotencia());
        System.out.println("LLANTAS: de rin "+auto.getNeu().getRodada());
        System.out.println("Ancho de la llanta:"+auto.getNeu().getMarca());
        System.out.println("Marca:"+auto.getNeu().getAnchoDeLlanta());
        System.out.println("Estado del auto:");
        auto.getMot().colocarLlave();
        auto.abrir();
        auto.getMot().encendido();
        auto.getMot().quitarLlave();
        auto.getMot().apagado();
        
    }
    
    
}
