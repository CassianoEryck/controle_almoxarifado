package controleEstoque.controladores;

import controleEstoque.arquivos.ControlGravaArquivos;
import controleEstoque.entidades.EntradaProduto;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */


public class ControlEntradaProduto {

    ControlGravaArquivos controlGravaArquivos;
    
    public void registraEntrada(EntradaProduto entrada, int id){
        controlGravaArquivos = new ControlGravaArquivos(entrada, id);
    }
}
