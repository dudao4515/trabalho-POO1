
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class MegaCao extends Manufatura {

    public MegaCao(String produtor, int codigo, int gramas) {
        super(produtor, codigo, gramas, 8);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        for(Produto produto : produtos){
            if(null != produto.getNomeP())switch (produto.getNomeP()) {
                case "Aco" -> {
                    if(produto.decremento(produtos, "Aco", 50) == false){
                        return produto;
                    }
                }
                case "Aluminio" -> {
                    if(produto.decremento(produtos, "Aluminio", 50) == false){
                        return produto;
                    }
                }
                case "Chumbo" -> {
                    if(produto.decremento(produtos, "Chumbo", 50) == false){
                        return produto;
                    }
                }
                case "Cobre" -> {
                    if(produto.decremento(produtos, "Cobre", 50) == false){
                        return produto;
                    }
                }
                case "Ouro" -> {
                    if(produto.decremento(produtos, "Ouro", 10) == false){
                        return produto;
                    }
                }
                case "Prata" -> {
                    if(produto.decremento(produtos, "Prata", 10) == false){
                        return produto;
                    }
                }
                case "Couro" -> {
                    if(produto.decremento(produtos, "Couro", 10) == false){
                        return produto;
                    }
                }
                case "Pedra" -> {
                    if(produto.decremento(produtos, "Pedra", 10) == false){
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
