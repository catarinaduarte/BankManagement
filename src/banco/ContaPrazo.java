/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author 35196
 */

public class ContaPrazo extends Conta{
    
    public static float juroPrazo = 0.18f;
    public static int prazoNormal = 180;
    
    public static void obterJuro() {
        System.out.println("Juro: " + juroPrazo *100+"5");}

    int prazo;
    float juroEspecial;
    
public ContaPrazo (String titular, double saldo , int prazo, float juroEspecial ){    
    super(titular,saldo); 
    this.prazo=prazo;
    this.juroEspecial=juroEspecial;
        
}
    
public ContaPrazo (String titular, double saldo , int prazo ){
    this (titular, saldo, prazo, juroPrazo);
//    super(titular,saldo);
//    this.prazo=prazo;
//    this.juroEspecial=juroPrazo;
}    
    

public ContaPrazo (String titular, double saldo){
    this (titular, saldo, prazoNormal, juroPrazo);
//    super(titular, saldo);
//    this.prazo=prazoNormal;
//    this.juroEspecial=juroPrazo;
}


public ContaPrazo (String titular ){
    this (titular,50.0,prazoNormal, juroPrazo); 
//    this.prazo=prazoNormal;
//    this.juroEspecial=juroPrazo;
} 

public ContaPrazo (double saldo ){
    this ("Desconhecido",saldo, prazoNormal, juroPrazo); 
//    super(saldo);
//    this.prazo=prazoNormal;
//    this.juroEspecial=juroPrazo;
} 

public ContaPrazo (double saldo, int prazo, float juroEspecial ){
    this ("Desconhecido", saldo, prazo, juroEspecial); 
    }

public ContaPrazo () {
    
    super();
    this.prazo=prazoNormal;
    this.juroEspecial=juroPrazo;
        
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPrazo" + "prazo=" + prazo + ", juroEspecial=" + juroEspecial + '}';
    }

    @Override
    public void levantar(double quantidade) {
        int dias=Integer.parseInt(JOptionPane.showInputDialog("Qual o número de dias decorrido?"));
        if (dias > this.prazo)
        super.levantar(quantidade); //To change body of generated methods, choose Tools | Templates.
        else {
            System.out.println("O número decorrido não permite levantar o valor do depósito a prazo ");
        }
    }

    @Override
    public void depositar(double quantidade) {
        super.depositar(quantidade); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obterSaldo() {
        super.obterSaldo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Essa é a conta a prazo!");
    }


}    
    

