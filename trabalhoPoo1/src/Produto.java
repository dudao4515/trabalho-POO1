
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class Produto {
    private String nomeP;
    private int quantidadeP;

    public Produto(String nomeP, int quantidadeP) {
        this.nomeP = nomeP;
        this.quantidadeP = quantidadeP;
    }

    public String getNomeP() {
        return nomeP;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }

    public void setQuantidadeP(int quantidadeP) {
        this.quantidadeP = quantidadeP;
    }
    
    public boolean decremento(ArrayList<Produto> produtos, String material, int qtMaterial){
         for (Produto produto : produtos) {
        if (material.equals(produto.getNomeP())) {
            if (qtMaterial <= produto.getQuantidadeP()) {
                produto.setQuantidadeP(produto.getQuantidadeP() - qtMaterial);
                return true;
            } else {
                return false;
            }
        }
    }
    return false;
}

    @Override
    public String toString() {
        return "Produto{" + "nomeP=" + nomeP + ", quantidadeP=" + quantidadeP + '}';
    }

    
    
    
}

