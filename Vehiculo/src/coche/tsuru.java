
package coche; 
import componentes.chasis;
import componentes.llantas;
import componentes.motor;

public class tsuru {
    private String marca;
    private String modelo; 
    private int año;
    private chasis esq;
    private llantas neu;
    private motor mot;

    public tsuru() {
    }

    public tsuru(String marca, String modelo, int año, chasis esq, llantas neu, motor mot) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.esq = esq;
        this.neu = neu;
        this.mot = mot;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void abrir(){
        System.out.println("Abierto");
    }
    public void cerrar(){
        System.out.println("Cerrado");
    }

    public chasis getEsq() {
        return esq;
    }

    public void setEsq(chasis esq) {
        this.esq = esq;
    }

    public llantas getNeu() {
        return neu;
    }

    public void setNeu(llantas neu) {
        this.neu = neu;
    }

    public motor getMot() {
        return mot;
    }

    public void setMot(motor mot) {
        this.mot = mot;
    }
    
}
