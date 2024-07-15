
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class LaraLarinha extends Manufatura {

    public LaraLarinha(String produtor, int codigo, int gramas) {
        super(produtor, codigo, gramas, 6);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        //se retornar  prouto acabou a produção 
        for(Produto produto : produtos){
            if(null != produto.getNomeP())switch (produto.getNomeP()) {
                case "Madeira" -> {
                    if(produto.decremento(produtos, "Madeira", 10) == false){
                        return produto;
                    }
                }
                case "Aco" -> {
                    if(produto.decremento(produtos, "Aco", 10) == false){
                        return produto;
                    }
                }
                case "Aluminio" -> {
                    if(produto.decremento(produtos, "Aluminio", 20) == false){
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
                    if(produto.decremento(produtos, "Couro", 30) == false){
                        return produto;
                    }
                }
                case "Pedra" -> {
                    if(produto.decremento(produtos, "Pedra", 30) == false){
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
