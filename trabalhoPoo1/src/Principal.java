
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


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
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fil = new FileInputStream("D:\\Users\\2022122760087\\Documents\\NetBeansProjects\\trabalho-POO1\\trabalhoPoo1\\src\\estoque.txt");
        System.out.println(LerArquivo.lerProdutos(fil));
        

    }

}
