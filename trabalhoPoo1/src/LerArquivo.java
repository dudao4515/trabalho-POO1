
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

        try (Scanner scan = new Scanner(fil)) {
            while (scan.hasNext()) {
                int codigo = scan.nextInt();
                int grama = scan.nextInt();
                Presente presente;
                if (codigo < 6) {
                    switch(codigo){
                        case 1 -> {
                            presente = new MiniGame(codigo, grama);
                            presentes.add(presente);
                        }
                        case 2 -> {
                            presente = new DroneCop(codigo, grama);
                            presentes.add(presente);
                        }
                        case 3 -> {
                            presente = new RoboX(codigo, grama);
                            presentes.add(presente);
                        }
                        case 4 -> {
                            presente = new PedraVoadora(codigo, grama);
                            presentes.add(presente);
                        }
                    }
                } else {
                    String produtor = scan.next();
                    switch(codigo){
                        case 6 -> {
                            presente = new BolinhaPuff( produtor, codigo, grama);
                            presentes.add(presente);
                        }
                        case 7 -> {
                            presente = new EspadaPau( produtor, codigo, grama);
                            presentes.add(presente);
                        }
                        case 8 -> {
                            presente = new LaraLarinha( produtor, codigo, grama);
                            presentes.add(presente);
                        }
                        case 9 -> {
                            presente = new MegaCao( produtor, codigo, grama);
                            presentes.add(presente);
                        }
                        case 10 -> {
                            presente = new LiliAlegre( produtor, codigo, grama);
                            presentes.add(presente);
                        }
                        
                    }
                }
                
                
            }
        }

        return presentes;
    }

}
