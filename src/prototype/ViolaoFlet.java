package prototype;

/**
 *
 * @author Fabricio
 */
public class ViolaoFlet extends fabricaInstrumentos{
    
    public ViolaoFlet(ViolaoFlet violaoFlet){
        this.valor = violaoFlet.getValor();
    }
    public ViolaoFlet(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: violão Flet\n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new ViolaoFlet(this);
    }
}
