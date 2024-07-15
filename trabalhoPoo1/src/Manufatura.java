/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2022122760087
 */
public abstract class Manufatura extends Presente {
    private String produtor;

    public Manufatura(String produtor, int codigo, int gramas, int idadeMin) {
        super(codigo, gramas, idadeMin);
        this.produtor = produtor;
    }

    
  
    public String getProdutor() {
        return produtor;
    }
    

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
    
    
    
    @Override
    public String toString() {
        return   super.getCodigo() + " " + super.getGramas() + " " + produtor + "\n" ;
    }
 
    
}
