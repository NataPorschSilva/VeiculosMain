
package com.mycompany.veiculosmain;

/**
 *
 * @author Natã
 */
public class Carro extends VeiculoMae {
    
    public String carro;
    public String locomocaocarro;

    public String getCarro() {
        return carro;
    }

    public void setCarro(String c) {
        this.carro = c;
    }

    public String getLocomocaocarro() {
        return locomocaocarro;
    }

    public void setLocomocaocarro(String locomocaocarro) {
        this.locomocaocarro = locomocaocarro;
    }

    @Override
    public String toString() {
        return "Carro " + carro + ", locomocaocarro= " + locomocaocarro;
    }

    
  

    
}
