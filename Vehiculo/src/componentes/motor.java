
package componentes;


public class motor {
    private int numeroDeCilindros;
    private boolean combustionInterna;
    private String potencia;

    public motor() {
    }

    public motor(int numeroDeCilindros, boolean combustionInterna, String potencia) {
        this.numeroDeCilindros = numeroDeCilindros;
        this.combustionInterna = combustionInterna;
        this.potencia = potencia;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getNumeroDeCilindros() {
        return numeroDeCilindros;
    }

    public void setNumeroDeCilindros(int numeroDeCilindros) {
        this.numeroDeCilindros = numeroDeCilindros;
    }

    public boolean isCombustionInterna() {
        return combustionInterna;
    }

    public void setCombustionInterna(boolean combustionInterna) {
        this.combustionInterna = combustionInterna;
    }
    public void descripcionDelMotor(){
        System.out.println(this.numeroDeCilindros+"/"+this.combustionInterna+"/"+this.potencia);
    }
    public void colocarLlave(){
        System.out.println("La llave ha sido colocada");
    }
    public void admitir(){
        System.out.println("La mezcla dentro del clindro ha sido admitida...");
    } 
    public void comprimir(){
        System.out.println("La mezcla gaseosa de aire-gasolina ha sido comprimida...");
    }
   
    public void escapar(){
        System.out.println("Los gases han sido expulsados fuera del cilindro...");
    } 
    public void encendido(){
        colocarLlave();
        admitir();
        comprimir();
        escapar();
        System.out.println("Encendido");
    }
    public void quitarLlave(){
        System.out.println("La llave ha sido retirada");
    }
    public void apagado(){
        quitarLlave();
        System.out.println("Apagado");
    }
}
