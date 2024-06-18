
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gavae
 */
public class Producao {

    private static class Produtor {

        private final String nomeP;
        private int numPresentes;

        public Produtor(String nomeP, int numPresentes) {
            this.nomeP = nomeP;
            this.numPresentes = numPresentes;
        }

        public String getNomeP() {
            return nomeP;
        }

        public int getNumPresentes() {
            return numPresentes;
        }

        public void setNumPresentes(int numPresentes) {
            this.numPresentes = numPresentes;
        }

    }

    private void iniciarProducao() {
    }

    //a
    public static void somarPesos(ArrayList<Presente> presentes) {
        int pesoTotal = 0;

        for (Presente presente : presentes) {
            pesoTotal += presente.getGramas();
        }
        System.out.println("O total de pesos é " + pesoTotal + "gramas");

    }

    //b
    public static void maiorProdutor(ArrayList<Presente> presentes) {
        List<Produtor> produtores = new ArrayList();

        for (Presente presente : presentes) {
            if (presente instanceof Manufatura) {
                final String nomeProdutor = ((Manufatura) presente).getProdutor();
                boolean existe = false;
                for (Produtor produtor : produtores) {
                    if (nomeProdutor.equals(produtor.getNomeP())) {
                        produtor.numPresentes++;
                        existe = true;
                        break;
                    }

                }
                if (existe == true) {
                    Produtor produtor = new Produtor(nomeProdutor, 1);
                    produtores.add(produtor);
                }

            }

        }

        int maiorNumPresente = 0;
        for (Produtor produtor : produtores) {
            if (maiorNumPresente < produtor.numPresentes) {
                maiorNumPresente = produtor.numPresentes;
            }

        }

        List<Produtor> maioresProdutores = new ArrayList();

        for (Produtor produtor : produtores) {
            if (produtor.numPresentes == maiorNumPresente) {
                maioresProdutores.add(produtor);
            }
        }

        if (maioresProdutores.isEmpty()) {
            System.out.println("Não existem produtores de manufaturas.");
        } else if (maioresProdutores.size() == 1) {
            System.out.println(maioresProdutores.get(0).nomeP + "é o maior produtor de manufaturas. ");
        } else {
            String maioresNomes = "";
            for (int i = 0; i < maioresProdutores.size(); i++) {
                maioresNomes = maioresNomes.concat(maioresProdutores.get(i).getNomeP());
                if (i < maioresProdutores.size() - 1) {
                    maioresNomes = maioresNomes.concat(" e ");
                }
            }

            System.out.println(maioresNomes + "são os maiores produtores de manufaturas. ");
        }

    }

    //c
    public static void contagemDePresente(ArrayList<Presente> presentes) {
        int manufatura = 0;
        int eletronico = 0;
        for (Presente presente : presentes) {
            if (presente instanceof Manufatura) {
                manufatura ++;
            }else{
                eletronico ++;
            }
        }
        System.out.println("São produzidos " + eletronico + " presentes eletrônicos e " + manufatura + " manufaturas por dia.");
    }
    
    //d
    public static void imprimirDados(ArrayList<Presente> presentes, ArrayList<Produto> produtos){
        System.out.println("Estoque: \n");
        for (Produto produto : produtos) {
            System.out.println(produtos + "\n");
        }
        System.out.println("Presentes a serem produzidos: \n");
        for (Presente presente : presentes) {
            System.out.println(presentes + "\n");
        }
        
        
    }
    
    //e
    public static void duracaoEstoqueDias(ArrayList<Presente> presentes, ArrayList<Produto> produtos){
        
    }
    
}
