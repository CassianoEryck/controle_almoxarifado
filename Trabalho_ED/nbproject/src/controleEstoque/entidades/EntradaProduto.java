package controleEstoque.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eduardo Lacerda
 * Data: May 28, 2012
 */
public class EntradaProduto {
    private Date data;
    private Fornecedor fornecedor;
    private String notaFiscal;

    public EntradaProduto() {
        this.data = new Date();
        this.fornecedor = new Fornecedor();
        this.notaFiscal = "";
    }
    
    public EntradaProduto(Date data, Fornecedor fornecedor, String notaFiscal){
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
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

    
    @Override
    public String toString() {
        
        return new SimpleDateFormat("dd/mm/yyyy").format(data) + "\n" + fornecedor.toString(false) + notaFiscal + "\n";
    }
    
    
    
    
    

}
