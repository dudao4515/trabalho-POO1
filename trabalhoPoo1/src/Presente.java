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
    private int idadeMin;

    public Presente(int codigo, int gramas) {
        this.codigo = codigo;
        this.gramas = gramas;
    }
    
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
    @Override
    public String toString() {
        return "Presentes:" + "código =" + codigo + ", Gramas =" + gramas + "\n";
    }
    
}
