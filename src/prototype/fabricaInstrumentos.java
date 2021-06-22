package prototype;

/**
 *
 * @author Fabricio
 */
public abstract class fabricaInstrumentos {
    public double valor;
    public abstract String exibirInformacao();
    public abstract fabricaInstrumentos clonar();
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
}
