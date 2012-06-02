/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleEstoque.tabelas;

import controleEstoque.entidades.Fornecedor;
import controleEstoque.entidades.Produto;
import controleEstoque.estruturaDados.ListaProdutos;
import controleEstoque.estruturaDados.No;

public class TabelaProduto {

    private int coluna = 3;
    private int linha;
    String[][] celulas;
    String[] nomeColunas;

    public String[][] getCelulas() {
        return celulas;
    }

    public String[] getNomeColunas() {
        return nomeColunas;
    }

    public TabelaProduto() {
        nomeColunas = new String[]{"", "Fornecedor", "Produto"};
        this.teste();
    }

    public void teste() {
        ListaProdutos listaProdutos = new ListaProdutos();

        for (int i = 0; i < 6; i++) {
            int mod = i%2;
            switch (mod) {
                case 0:
                    listaProdutos.adiciona(new Produto("Camisinha", "Jontex"));
                case 1:
                    listaProdutos.adiciona(new Produto("Sei lá", "Skype"));
            }
        }

        adicionaProdutos(listaProdutos);
    }

    public void adicionaProdutos(ListaProdutos listaProdutos) {
        No inicioLista = listaProdutos.getInicio();
        
        linha = listaProdutos.count();
        celulas = new String[linha][coluna];
        
        linha = 0;
        
        while (inicioLista != null) {

            for (int i = 0; i < coluna; i++) {

                Produto produto = (Produto) inicioLista.getObjeto();
                
                switch (i) {
                    case 0:
                        celulas[linha][i] = "check";
                        break;
                    case 1:
                        celulas[linha][i] = produto.getFornecedor().getNome();
                        break;
                    case 2:
                        celulas[linha][i] = produto.getNome();
                        break;
                }
            }
            
            linha++;
            inicioLista = inicioLista.getProx();

        }

        
    }
}
