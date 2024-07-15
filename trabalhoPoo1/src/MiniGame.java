
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 2022122760087
 */
public class MiniGame extends Eletronico {

    public MiniGame(int codigo, int gramas) {
        super(25, codigo, gramas, 10);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        
        for (Produto produto : produtos) {
            if (null != produto.getNomeP()) switch (produto.getNomeP()) {
                case "Madeira" -> {
                    if(produto.decremento(produtos, "Madeira", 20) == false){
                        return produto;
                    }
                }
                case "Aco" -> {
                    if(produto.decremento(produtos, "Aco", 20) == false){
                        return produto;
                    }
                }
                case "Ferro" -> {
                    if(produto.decremento(produtos, "Ferro", 5) == false){
                        return produto;
                    }
                }
                case "Aluminio" -> {
                    if(produto.decremento(produtos, "Aluminio", 5) == false){
                        return produto;
                    }
                }
                case "Chumbo" -> {
                    if(produto.decremento(produtos, "Chumbo", 5) == false){
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
