package controleEstoque.entidades;

import java.util.Date;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class EntradaProduto {
    private Date data;
    private String fornecedor;
    private String notaFiscal;

    public EntradaProduto() {
        
    }
    
    public EntradaProduto(Date data, String fornecedor, String notaFiscal){
        this.data = data;
        this.fornecedor = fornecedor;
        this.notaFiscal = notaFiscal;
    }
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
    public int obtemTempoCobertura(Produto produto){
        return 0;
    }
    
    public void registrarEntrada(){
        
    }
    
    
    
    

}
