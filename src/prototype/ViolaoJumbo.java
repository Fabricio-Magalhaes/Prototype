package prototype;

/**
 *
 * @author Fabricio
 */
public class ViolaoJumbo extends fabricaInstrumentos{
    
    public ViolaoJumbo(ViolaoJumbo violaoJumbo){
        this.valor = violaoJumbo.getValor();
    }
    public ViolaoJumbo(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: violão Jumbo\n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new ViolaoJumbo(this);
    }
}
