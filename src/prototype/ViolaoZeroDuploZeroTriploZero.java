package prototype;

/**
 *
 * @author Fabricio
 */
public class ViolaoZeroDuploZeroTriploZero extends fabricaInstrumentos{
        
    public ViolaoZeroDuploZeroTriploZero(ViolaoZeroDuploZeroTriploZero violaoZeroDuploZeroTriploZero){
        this.valor = violaoZeroDuploZeroTriploZero.getValor();
    }
    public ViolaoZeroDuploZeroTriploZero(){
        valor = 0;
    }
    @Override
    public String exibirInformacao() {
        return "Modelo: Violao Zero Duplo Zero Triplo Zero\n Valor: "+getValor();
    }

    @Override
    public fabricaInstrumentos clonar() {
        return new ViolaoZeroDuploZeroTriploZero(this);
    }
}
