
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
        int i = 10;
        while(i != 1){
            FileInputStream fil = new FileInputStream("D:\\Users\\2022122760087\\Desktop\\trabalhoPoo1\\trabalhoPoo1\\src\\estoque.txt");
            Scanner scan = new Scanner(fil);
            String produto = scan.next();
            int num1 = scan.nextInt();
            System.out.print(produto +"  "+ num1);
            i--;
            if(i == 1){
                scan.close();
            }
            
        }
        

    }

}
