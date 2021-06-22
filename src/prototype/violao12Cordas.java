package prototype;

/**
 *
 * @author Fabricio
 */
public class violao12Cordas extends fabricaInstrumentos{
    public violao12Cordas(violao12Cordas Violao12Cordas){
        this.valor = Violao12Cordas.getValor();
    }
    public violao12Cordas(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: Violão 12 cordas \n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new violao12Cordas(this);
    }
}
