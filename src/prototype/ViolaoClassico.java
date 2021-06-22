package prototype;

/**
 *
 * @author Fabricio
 */
public class ViolaoClassico extends fabricaInstrumentos{

    public ViolaoClassico(ViolaoClassico violaoClassico){
        this.valor = violaoClassico.getValor();
    }
    public ViolaoClassico(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: violão classico\n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new ViolaoClassico(this);
    }
    
}
