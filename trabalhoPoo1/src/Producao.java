import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gavae
 */
public class Producao {
    private void iniciarProducao(){
    }
    
    
    //a
    public static void somarPesos(ArrayList<Presente> presentes) {
        int pesoTotal = 0;
        
        for(Presente presente : presentes){
            pesoTotal += presente.getGramas();
        }
        System.out.println("O total de pesos é " + pesoTotal +  "gramas");
        
              
    }
    
    //b
    public static void maiorProdutor(ArrayList<Presente> presentes){
        
        for(Presente presente : presentes){
            if(presente instanceof Manufatura){               
            ((Manufatura) presente).getProdutor();
            
            }
      
            
        }
    }
    
    //c
}
