package controleEstoque;
import controleEstoque.arquivos.ControlDiretorios;
import controleEstoque.controladores.ControlMain;
/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */

/**
 * 
 * @author Lacerda
 * <b> Classe Controladora Principal do Programa </b>
 * @version  1.0
 */
public class Main {
    
    
    /**
     * Método main que irá gerar um novo Formulário de Login.
     * @param args 
     */
    public static void main(String args[]){
       ControlDiretorios.verificaDiretorios();
       ControlMain controlMain = new ControlMain();
       controlMain.criaFormularioLogin();
    }

}
