/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public class Eletronico extends Presente {

    private int consumoEnergia;

    public Eletronico(int idadeMin, int consumoEnergia) {
        super(idadeMin);
        this.consumoEnergia = consumoEnergia;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

}
