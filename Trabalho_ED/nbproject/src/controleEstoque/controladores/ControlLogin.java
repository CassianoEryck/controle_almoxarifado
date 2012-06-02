package controleEstoque.controladores;

import controleEstoque.arquivos.Arquivo;
import controleEstoque.arquivos.ControlCarregaArquivos;
import controleEstoque.entidades.Login;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class ControlLogin {
    
    public boolean validaAcesso(Login login){
        Login[] vetLogin = carregaArquivo();
        boolean valida = false;
        
        if(vetLogin != null){
            int i = 0;
            while(i < vetLogin.length){
                valida = vetLogin[i].validaAcesso(login.getUsuario(), login.getSenha());               
                if(valida)
                    break;
                i++;
            }
        }
        return valida;
    }
    
    private Login[] carregaArquivo(){
        
        ControlCarregaArquivos carregaArquivos = new ControlCarregaArquivos(Arquivo.LOGIN);
        String[] linhas = carregaArquivos.retornaStringArquivo();
        Login[] login = null;
        
        if(linhas != null){
            login = new Login[linhas.length/3];
            int i = 0, j = 0, h = 0;
            while(i < linhas.length){
                switch(h){
                    case 0:
                        login[j] = new Login();
                        login[j].setUsuario(linhas[i]);
                        h++;
                    break;
                    
                    case 1:
                        login[j].setSenha(linhas[i].toCharArray());                      
                        h++;
                    break;
                    
                    case 2:
                        login[j].setPermission(linhas[i]);
                        h = 0;
                        j++;
                    break;                
                }               
                i++;                
            }
        }
        
        return login;
        
    }
    
   
}
