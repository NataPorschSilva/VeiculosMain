
package com.mycompany.veiculosmain;

/**
 *
 * @author Natã
 */
public class VeiculosMain {

    public static void main(String[] args) {
        VeiculoMae v1 = new VeiculoMae();
        Carro c = new Carro();
        Aviao a = new Aviao();
        
        /////////veículos////////////
         a.setAviao("Aircraft");
         a.setLocomocaoaviao("Áereo");
        // c.setCarro("maôe");
        
        
         c.setCarro("civic");
         c.setLocomocaocarro("Terrestre");

         v1.setMarca("honda");
         v1.setAno(2010);
       
        
        
        
       System.out.println(v1.toString());
       System.out.println(c.toString());
       System.out.println(a.toString());

        
        
    }
}
