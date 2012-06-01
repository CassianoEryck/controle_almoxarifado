package controleEstoque.estruturaDados;

/**
 * @author Eduardo Lacerda
 * Data: May 30, 2012
 */
public class No {    

    Object objeto;
    No prox;
    
    public No(Object objeto){
        this.objeto = objeto;
        prox = null;
    }
    
    public No getProx(){
        return prox;
    }
    
     public Object getObjeto(){
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
     
    

}
