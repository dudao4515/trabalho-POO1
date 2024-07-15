
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public abstract class Presente {
    private int codigo;
    private int gramas;
    private final int idadeMin;
    private int serial;

    public Presente(int codigo, int gramas, int idadeMin) {
        this.codigo = codigo;
        this.gramas = gramas;
        this.idadeMin = idadeMin;
    }

    public abstract Produto quantidadeProduto(ArrayList<Produto> produtos);
    
    public int getCodigo() {
        return codigo;
    }

    public int getGramas() {
        return gramas;
    }

    public int getIdadeMin() {
        return idadeMin;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
    
    /*@Override
    public String toString() {
        return " " + codigo + gramas ;
    }
    */
}
