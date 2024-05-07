
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 2022122760087
 */
public class LerArquivo {

    public static List<Produto> lerProdutos(FileInputStream fil) {
        List<Produto> produtos = new ArrayList();

        Scanner scan = new Scanner(fil);
        while (scan.hasNext()) {
            String nome = scan.next();
            int num = scan.nextInt();

            Produto produto = new Produto(nome, num);
            produtos.add(produto);
        }
        scan.close();

        return produtos;
    }

    
    //lembrar pra q caralhis eh isso
    public static List<Presente> lerPresentes(FileInputStream fil) {
        List<Presente> presentes = new ArrayList();

        Scanner scan = new Scanner(fil);
        while (scan.hasNext()) {
            int codigo = scan.nextInt();
            int grama = scan.nextInt();
            Presente presente;
            if (codigo < 6) {
                switch(codigo){
                    case 1:
                        presente = new MiniGame(codigo, grama);
                        break;
                }
            } else {
                String produtor = scan.next();
                switch(codigo){
                    case 6:
                        presente = new BolinhaPuff( produtor, codigo, grama);
                        break;}
            }
            
            presentes.add(presente);
        }
        scan.close();

        return presentes;
    }

    //public verificaProduto(){

    //}

}
