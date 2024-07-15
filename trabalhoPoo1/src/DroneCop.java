
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 2022122760087
 */
public class DroneCop extends Eletronico {

    public DroneCop(int codigo, int gramas) {
        super(100, codigo, gramas, 18);
    }

    @Override
    public Produto quantidadeProduto(ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            if (null != produto.getNomeP()) switch (produto.getNomeP()) {
                case "Madeira" -> {
                    if (produto.decremento(produtos, "Madeira", 100) == false) {
                        return produto;
                    }
                }
                case "Aco" -> {
                    if (produto.decremento(produtos, "Aco", 20) == false) {
                        return produto;
                    }
                }
                case "Aluminio" -> {
                    if (produto.decremento(produtos, "Aluminio", 100) == false) {
                        return produto;
                    }
                }
                case "Chumbo" -> {
                    if (produto.decremento(produtos, "Chumbo", 5) == false) {
                        return produto;
                    }
                }
                case "Cobre" -> {
                    if (produto.decremento(produtos, "Cobre", 20) == false) {
                        return produto;
                    }
                }
                case "Ouro" -> {
                    if (produto.decremento(produtos, "Ouro", 1) == false) {
                        return produto;
                    }
                }
                case "Prata" -> {
                    if (produto.decremento(produtos, "Prata", 2) == false) {
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
