
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class LiliAlegre extends Manufatura {

    public LiliAlegre(String produtor, int codigo, int gramas) {
        super(produtor, codigo, gramas, 7);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
      for(Produto produto : produtos){
            if(null != produto.getNomeP())switch (produto.getNomeP()) {
              case "Ouro" -> {
                  if(produto.decremento(produtos, "Ouro", 50) == false){
                      return produto;
                  }
                }
              case "Prata" -> {
                  if(produto.decremento(produtos, "Prata", 50) == false){
                      return produto;
                  }
                }
              case "Couro" -> {
                  if(produto.decremento(produtos, "Couro", 200) == false){
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
