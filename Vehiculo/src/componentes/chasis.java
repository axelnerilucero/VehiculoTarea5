
package componentes;


public class chasis {
    private String peso;
    private boolean rigidez;
    private String tipoDeChasis;

    public chasis() {
    }

    public chasis(String peso, boolean rigidez, String tipoDeChasis) {
        this.peso = peso;
        this.rigidez = rigidez;
        this.tipoDeChasis = tipoDeChasis;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public boolean isRigidez() {
        return rigidez;
    }

    public void setRigidez(boolean rigidez) {
        this.rigidez = rigidez;
    }

    public String getTipoDeChasis() {
        return tipoDeChasis;
    }

    public void setTipoDeChasis(String tipoDeChasis) {
        this.tipoDeChasis = tipoDeChasis;
    }
    public void chasis(){
        System.out.println(this.peso+"/"+this.rigidez+"/"+this.tipoDeChasis);
    }
    public void conectarRuedas(){
        System.out.println("Ruedas aseguradas");
    }
    public void recibirCargas(){
        System.out.println("Carga recibida satisfactoriamente");
    }
    public void absorberImpacto(){
        System.out.println("No se ha registrado algun incidente");
    }
}
