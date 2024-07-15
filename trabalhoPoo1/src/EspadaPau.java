
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class EspadaPau extends Manufatura {

    public EspadaPau(String produtor, int codigo, int gramas) {
        super(produtor, codigo, gramas, 12);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        for(Produto produto : produtos){
            if(null != produto.getNomeP())switch (produto.getNomeP()) {
                case "Madeira" -> {
                    if(produto.decremento(produtos, "Madeira", 200) == false){
                        return produto;
                    }
                }
                case "Couro" -> {
                    if(produto.decremento(produtos, "Couro", 20) == false){
                        return produto;
                    }
                }
                case "Pedra" -> {
                    if(produto.decremento(produtos, "Pedra", 20) == false){
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
