
import java.io.FileInputStream;
import java.io.FileNotFoundException;


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
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args){
        FileInputStream fil = null;
        try {
            fil = new FileInputStream("estoque.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(LerArquivo.lerProdutos(fil));
        try {
            fil = new FileInputStream("presentes.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(LerArquivo.lerPresentes(fil));

    }


}
