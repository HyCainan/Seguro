
package segurocarro;

public class Seguro {
    private float valor;
    private boolean vigencia;
    private Cliente proprietario;
    private Cliente[] assegurados;

    public Seguro(float valor, boolean vigencia, Cliente proprietario, Cliente[] assegurados) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.proprietario = proprietario;
        this.assegurados = assegurados;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void setProprietario(Cliente proprietario) {
        this.proprietario = proprietario;
    }

    public Cliente[] getAssegurados() {
        return assegurados;
    }

    public void setAssegurados(Cliente[] assegurados) {
        this.assegurados = assegurados;
    }
    
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }
    
}
