package controleEstoque.entidades;

import java.util.Date;

/**
 * @author Eduardo Lacerda
 * Data: May 26, 2012
 */
public class Estatisticas {
    private double vendaMediaMensal;
    private double tempoCobertura;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public double getTempoCobertura() {
        return tempoCobertura;
    }

    public void setTempoCobertura(double tempoCobertura) {
        this.tempoCobertura = tempoCobertura;
    }

    public double getVendaMediaMensal() {
        return vendaMediaMensal;
    }

    public void setVendaMediaMensal(double vendaMediaMensal) {
        this.vendaMediaMensal = vendaMediaMensal;
    }
    
    public void calculaVMM(int saidas, Date periodo){
        
    }
    
    public void defineTempoCobertura(){
        
    }
    
    
    public void calculaEstoqueMinimo(){
        
    }
    
    public void calculaEstoqueMaximo(){
        
    }
    

}
