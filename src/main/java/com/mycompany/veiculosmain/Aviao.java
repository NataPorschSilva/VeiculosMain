
package com.mycompany.veiculosmain;

/**
 *
 * @author Natã
 */
public class Aviao extends VeiculoMae {
    
    public String aviao;
    public String locomocaoaviao;
    
    public String getAviao() {
        return aviao;
    }

    public void setAviao(String a) {
        this.aviao = a;
    }

    public String getLocomocaoaviao() {
        return locomocaoaviao;
    }

    public void setLocomocaoaviao(String locomocaoaviao) {
        this.locomocaoaviao = locomocaoaviao;
    }

    @Override
    public String toString() {
        return "Aviao " + aviao + ", locomocaoaviao= " + locomocaoaviao;
    }

    
    

    
    
    
    
    
}
