
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author 2022122760087
 */
 
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ArrayList<Presente> presentes = null;
        ArrayList<Produto> produtos = null;
        
        // Leitura
        FileInputStream fil = null;
        
         try {
            fil = new FileInputStream("estoque.txt");
            produtos = (ArrayList<Produto>) LerArquivo.lerProdutos(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Read "presentes.txt" file
        try {
            fil = new FileInputStream("presentes.txt");
            presentes = (ArrayList<Presente>) LerArquivo.lerPresentes(fil);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        Producao producao = new Producao();
            producao.iniciarProducao(presentes, produtos);
        
        
    
    }

}
