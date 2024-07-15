/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public abstract class Eletronico extends Presente {

    private int consumoEnergia;

    public Eletronico(int consumoEnergia, int codigo, int gramas, int idadeMin) {
        super(codigo, gramas, idadeMin);
        this.consumoEnergia = consumoEnergia;
    }

    

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    @Override
    public String toString() {
        return super.getCodigo() +  " " + super.getGramas() +  "\n";
    }

    
    
    

}
