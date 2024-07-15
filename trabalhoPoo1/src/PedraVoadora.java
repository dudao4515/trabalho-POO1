
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 2022122760087
 */
public class PedraVoadora extends Eletronico {

    public PedraVoadora(int codigo, int gramas) {
        super(40, codigo, gramas, 16);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (null != produto.getNomeP()) switch (produto.getNomeP()) {
                case "Aco" -> {
                    if(produto.decremento(produtos, "Aco", 100) == false){
                        return produto;
                    }
                }
                case "Ferro" -> {
                    if(produto.decremento(produtos, "Ferro", 100) == false){
                        return produto;
                    }
                }
                case "Aluminio" -> {
                    if(produto.decremento(produtos, "Aluminio", 100) == false){
                        return produto;
                    }
                }
                case "Chumbo" -> {
                    if(produto.decremento(produtos, "Chumbo", 70) == false){
                        return produto;
                    }
                }
                case "Cobre" -> {
                    if(produto.decremento(produtos, "Cobre", 10) == false){
                        return produto;
                    }
                }
                case "Ouro" -> {
                    if(produto.decremento(produtos, "Ouro", 8) == false){
                        return produto;
                    }
                }
                case "Prata" -> {
                    if(produto.decremento(produtos, "Prata", 12) == false){
                        return produto;
                    }
                }
                case "Couro" -> {
                    if(produto.decremento(produtos, "Couro", 50) == false){
                        return produto;
                    }
                }
                case "Pedra" -> {
                    if(produto.decremento(produtos, "Pedra", 50) == false){
                        return produto;
                    }
                }
                default -> {
                }
            }
        }
        return null;
    }

}
