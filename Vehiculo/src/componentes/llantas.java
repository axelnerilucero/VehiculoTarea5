
package componentes;

public class llantas {
    private int rodada;
    private String marca;
    private String anchoDeLlanta;

    public llantas() {
    }

    public llantas(int rodada, String marca, String anchoDeLlanta) {
        this.rodada = rodada;
        this.marca = marca;
        this.anchoDeLlanta = anchoDeLlanta;
    }

    public String getAnchoDeLlanta() {
        return anchoDeLlanta;
    }

    public void setAnchoDeLlanta(String anchoDeLlanta) {
        this.anchoDeLlanta = anchoDeLlanta;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void estadoDeLlanta(){
        System.out.println(this.rodada+"/"+this.anchoDeLlanta+"/"+this.marca);
    }   
    public void soportarPeso(){
        System.out.println("Peso correcto");
    }
    public void rodar(){
        System.out.println("Rodando...");
    }
    public void transmitirEsfuerzos(){
        System.out.println("Avanzando con exito");
    }
    
    
}


