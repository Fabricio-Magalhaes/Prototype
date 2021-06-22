package prototype;

/**
 *
 * @author Fabricio
 */
public class ViolaoFolk extends fabricaInstrumentos{
    
    public ViolaoFolk(ViolaoFolk violaoFolk){
        this.valor = violaoFolk.getValor();
    }
    public ViolaoFolk(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: violão Folk\n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new ViolaoFolk(this);
    }
}
