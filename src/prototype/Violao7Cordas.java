package prototype;

/**
 *
 * @author Fabricio
 */
public class Violao7Cordas extends fabricaInstrumentos{
    public Violao7Cordas(Violao7Cordas violao7Cordas){
        this.valor = violao7Cordas.getValor();
    }
    public Violao7Cordas(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: violão 7 cordas\n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new Violao7Cordas(this);
    }
}
