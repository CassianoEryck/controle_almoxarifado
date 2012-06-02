package controleEstoque.arquivos;

import java.io.File;

/**
 * @author Eduardo Lacerda
 * Data: Jun 2, 2012
 */
public class ControlDiretorios {
    
    /**
     * Verifica e cria os diretórios padrão do sistema
     */
    public static void verificaDiretorios(){
        File file = new File("Produtos");
        
        if(!file.exists()){
            file.mkdir();
            file = new File("Produtos/EntradaProdutos");
            file.mkdir();
            file = new File("Produtos/SaidaProdutos");
            file.mkdir();
        }
        
         file = new File("Login");
         if(!file.exists())
             file.mkdir();
         
         file = new File("Funcionario");
         if(!file.exists())
             file.mkdir();
         
         file = new File("Fornecedor");
         if(!file.exists())
             file.mkdir();
    }

}
