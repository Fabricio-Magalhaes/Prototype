package prototype;

/**
 *
 * @author Fabricio
 */
public class Prototype {

    public static void main(String[] args) {
        Violao7Cordas violao7Cordas = new Violao7Cordas();
        fabricaInstrumentos violao7CordasNovo = violao7Cordas.clonar();
        violao7CordasNovo.setValor(100);
        fabricaInstrumentos violao7CordasUsado = violao7Cordas.clonar();
        violao7CordasUsado.setValor(50);
        System.out.println("Violao Novo "+violao7CordasNovo.exibirInformacao());
        System.out.println("Violao Usado"+violao7CordasUsado.exibirInformacao());
        
        ViolaoClassico violaoClassico = new ViolaoClassico();
        fabricaInstrumentos violaoClassicoNovo = violaoClassico.clonar();
        violaoClassicoNovo.setValor(200);
        fabricaInstrumentos violaoClassicoUsado = violaoClassico.clonar();
        violaoClassicoUsado.setValor(100);
        System.out.println("Violao Novo "+violaoClassicoNovo.exibirInformacao());
        System.out.println("Violao Usado"+violaoClassicoUsado.exibirInformacao());
        
        ViolaoFlet violaoFlet = new ViolaoFlet();
        fabricaInstrumentos violaoFletNovo = violaoFlet.clonar();
        violaoFletNovo.setValor(210);
        fabricaInstrumentos violaoFletUsado = violaoFlet.clonar();
        violaoFletUsado.setValor(110);
        System.out.println("Violao Novo "+violaoFletNovo.exibirInformacao());
        System.out.println("Violao Usado"+violaoFletUsado.exibirInformacao());
        
        ViolaoFolk violaoFolk = new ViolaoFolk();
        fabricaInstrumentos violaoFolkNovo = violaoFolk.clonar();
        violaoFolkNovo.setValor(220);
        fabricaInstrumentos violaoFolkUsado = violaoFolk.clonar();
        violaoFolkUsado.setValor(120);
        System.out.println("Violao Novo "+violaoFolkNovo.exibirInformacao());
        System.out.println("Violao Usado"+violaoFolkUsado.exibirInformacao());
        
        ViolaoJumbo violaoJumbo = new ViolaoJumbo();
        fabricaInstrumentos violaoJumboNovo = violaoJumbo.clonar();
        violaoJumboNovo.setValor(230);
        fabricaInstrumentos violaoJumboUsado = violaoJumbo.clonar();
        violaoJumboUsado.setValor(130);
        System.out.println("Violao Novo "+violaoJumboNovo.exibirInformacao());
        System.out.println("Violao Usado"+violaoJumboUsado.exibirInformacao());
        
        ViolaoZeroDuploZeroTriploZero violaoViolaoZeroDuploZeroTriploZero = new ViolaoZeroDuploZeroTriploZero();
        fabricaInstrumentos ViolaoZeroDuploZeroTriploZeroNovo = violaoViolaoZeroDuploZeroTriploZero.clonar();
        ViolaoZeroDuploZeroTriploZeroNovo.setValor(240);
        fabricaInstrumentos ViolaoZeroDuploZeroTriploZeroUsado = violaoViolaoZeroDuploZeroTriploZero.clonar();
        ViolaoZeroDuploZeroTriploZeroUsado.setValor(140);
        System.out.println("Violao Novo "+ViolaoZeroDuploZeroTriploZeroNovo.exibirInformacao());
        System.out.println("Violao Usado"+ViolaoZeroDuploZeroTriploZeroUsado.exibirInformacao());
        
        violao12Cordas Violao12Cordas = new violao12Cordas();
        fabricaInstrumentos Violao12CordasNovo = Violao12Cordas.clonar();
        Violao12CordasNovo.setValor(250);
        fabricaInstrumentos Violao12CordasUsado = Violao12Cordas.clonar();
        Violao12CordasUsado.setValor(150);
        System.out.println("Violao Novo "+Violao12CordasNovo.exibirInformacao());
        System.out.println("Violao Usado"+Violao12CordasUsado.exibirInformacao());
    }
    
}
