
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class LanitaControladora extends Eletronico{

    public LanitaControladora(int codigo, int gramas) {
        super(10, codigo, gramas, 16);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        for(Produto produto : produtos){
            if(null != produto.getNomeP())switch (produto.getNomeP()) {
                case "Madeira" -> {
                    if(produto.decremento(produtos, "Madeira", 50) == false){
                        return produto;
                    }
                }
                case "Aco" -> {
                    if(produto.decremento(produtos, "Aco", 50) == false){
                        return produto;
                    }
                }
                case "Ferro" -> {
                    if(produto.decremento(produtos, "Ferro", 50) == false){
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
                    if(produto.decremento(produtos, "Ouro", 5) == false){
                        return produto;
                    }
                }
                case "Prata" -> {
                    if(produto.decremento(produtos, "Prata", 5) == false){
                        return produto;
                    }
                }
                case "Couro" -> {
                    if(produto.decremento(produtos, "Couro", 5) == false){
                        return produto;
                    }
                }
                case "Pedra" -> {
                    if(produto.decremento(produtos, "Pedra", 5) == false){
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
