
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

    public static List<Presente> lerPresentes(FileInputStream fil) {
        List<Presente> presentes = new ArrayList();

        Scanner scan = new Scanner(fil);
        while (scan.hasNext()) {
            int codigo = scan.nextInt();
            int grama = scan.nextInt();
            if (codigo >= 6) {
                String produtor = scan.next();
                Presente presentes = new Presente(codigo, grama, produtor);
            } else {
                Presente presentes = new Presente(codigo, grama);

            }
            
            produtos.add(produto);
        }
        scan.close();

        return produtos;
    }

    public verificaProduto(){

    }

}
