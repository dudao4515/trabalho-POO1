
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gavae
 */
public class Producao {

    void iniciarProducao(ArrayList<Presente> presentes, ArrayList<Produto> produtos) {
        somarPesos(presentes);
        maiorProdutor(presentes);
        contagemDePresente(presentes);
        imprimirDados(presentes, produtos);
        produzir(presentes, produtos);
    }

    //a
    public void somarPesos(ArrayList<Presente> presentes) {
        int pesoTotal = 0;

        for (Presente presente : presentes) {
            pesoTotal += presente.getGramas();
        }
        System.out.println("O total de pesos é " + pesoTotal + "gramas. \n");

    }

    //b
    public static void maiorProdutor(ArrayList<Presente> presentes) {
        Map<String, Integer> produtorCt = new HashMap<>();
        String produtorAtual = "";
        for (Presente presente : presentes) {
            if (presente instanceof Manufatura manufatura) {
                produtorAtual = manufatura.getProdutor();
                produtorCt.put(produtorAtual, produtorCt.getOrDefault(produtorAtual, 0) + 1);
            }
        }
        int valorMax = Collections.max(produtorCt.values());
        List<String> maioresProdutores = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : produtorCt.entrySet()) {
            if (entry.getValue() == valorMax) {
                maioresProdutores.add(entry.getKey());
            }
        }
        if (maioresProdutores.size() == 1) {
            System.out.println(maioresProdutores.get(0) + " é o maior produtor de manufaturas.");
        } else {
            System.out.print(maioresProdutores.get(0) + " e " + maioresProdutores.get(1) + 
            " são os maiores produtores de manufaturas.");
            System.out.println("\n");
        }

    }

    //c
    public void contagemDePresente(ArrayList<Presente> presentes) {
        int manufatura = 0;
        int eletronico = 0;
        for (Presente presente : presentes) {
            if (presente instanceof Manufatura) {
                manufatura++;
            } else {
                eletronico++;
            }
        }
        System.out.println("São produzidos " + eletronico + " presentes eletrônicos e " + manufatura + " manufaturas por dia.\n");
    }

    //d 
    public void imprimirDados(ArrayList<Presente> presentes, ArrayList<Produto> produtos) {
        System.out.println("Estoque: ");
        for (Produto produto : produtos) {
            System.out.println(produto.getNomeP() + " " + produto.getQuantidadeP());
        }
        System.out.println("\n");
        System.out.println("Presentes a serem produzidos: ");
        for (Presente presente : presentes) {
            if (presente instanceof Manufatura) {
                System.out.println(presente.getCodigo() + " " + presente.getGramas() + " " + ((Manufatura) presente).getProdutor());
            } else {
                System.out.println(presente.getCodigo() + " " + presente.getGramas());
            }

        }

    }

    //e
    public void produzir(ArrayList<Presente> presentes, ArrayList<Produto> produtos) {
        System.out.println("\n");
        int dia = 0;
        int numPresente = 0;
        boolean i = true;
        while (i) {
            for (Presente presente : presentes) {
                if (presente.quantidadeProduto(produtos) == null) {
                    numPresente++;
                    presente.setSerial(numPresente);
                    i = true;
                } else {
                    numPresente++;
                    presente.setSerial(numPresente);
                    System.out.println("O estoque dura " + dia + " dia(s). \n");
                    printarPresente(presente);
                    printarProduto(presente.quantidadeProduto(produtos), presente);
                    i = false;
                    break;
                }
            }
            dia++;
        }

    }

    //f
    public void printarPresente(Presente presente) {
        if (presente instanceof Manufatura manufatura) {
            System.out.println("O presente de serial " + presente.getSerial() + " não pode ser produzido. Esse presente é uma \n"
                    + presente.getClass().getSimpleName() + " com " + presente.getGramas() + " gramas, idade mínima " + presente.getIdadeMin() + " e produtor "
                    + manufatura.getProdutor() + ".\n");
        } else if (presente instanceof Eletronico eletronico) {
            System.out.println("O presente de serial " + presente.getSerial() + " não pode ser produzido. Esse presente é um(a) \n"
                    + presente.getClass().getSimpleName() + " com " + presente.getGramas() + " gramas, idade mínima " + presente.getIdadeMin() + " e consumo de energia\n"
                    + eletronico.getConsumoEnergia() + ".\n");
        }
    }

    //g
    public void printarProduto(Produto produto, Presente presente) {
        System.out.println("Faltou " + produto.getNomeP() + " para produzir a "
                + presente.getClass().getSimpleName() + " de serial " + presente.getSerial() + ".");
    }
}
