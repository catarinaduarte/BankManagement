/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import static banco.Conta.alterarJuro;
import static banco.Conta.obterJuro;
import static banco.Conta.ultimoNumero;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

/**
 *
 * @author 35196
 */
public class Banco {

     /**
     * *
     * @param args the command line argments
     */
    public static void main(String[] args) {
//        obterJuro();
//        alterarJuro(0.05f);
//        System.out.println("Ultimo número: " + ultimoNumero);
//        Conta conta1 = new Conta();
//        conta1.setNumero(1);
//        ultimoNumero = conta1.getNumero();
//        conta1.setTitular("Maria Leal");
//        conta1.setSaldo(1000f);
//        conta1.obterSaldo();
//        conta1.depositar(100.0);
//        System.out.println("Ultimo número: " + ultimoNumero);
//        Conta conta2 = new Conta("Teresa Silva", 2500.0);
//        conta2.obterSaldo();
//        conta2.depositar(90.0);
//        conta2.obterSaldo();
//        conta2.levantar(200.0);
//        Conta conta3 = new Conta("Sara Silva", 5000.0);
//        conta3.obterSaldo();
//        conta3.depositar(100.0);
//        conta3.obterSaldo();
//        conta3.levantar(200.0);
//        Conta conta4 = new Conta("Um Milionário");
//        conta4.depositar(10000000000.0);
//        conta4.obterSaldo();
//        Conta conta5 = new Conta();
//        conta5.obterSaldo();
//        Conta conta6 = new Conta(9000.0, "Titular da Conta 6");
//        conta6.obterSaldo();
        ContaOrdem co1 = new ContaOrdem();
        co1.obterSaldo();
//        ContaOrdem co2 = new ContaOrdem(" co2- Titular passado para o contrutor de super classe", 90090900000.0);
//        co2.obterSaldo();
        
        
    //conta prazo
    
        ContaPrazo cp1=new ContaPrazo();
        cp1.obterSaldo();
        
//        ContaPrazo cp2=new ContaPrazo( "Maria da Fonte", 1000.0,360,0.09f);
//        cp2.obterSaldo();    
//        
//        ContaPrazo cp3=new ContaPrazo(600.0,120,0.06f);
//        cp3.obterSaldo();
        



        ContaPrazo cp4=new ContaPrazo();
        javax.swing.JOptionPane.showMessageDialog(null,cp4.toString());
        double quantia=0.0;
        do {            
            try {
                quantia = (Double.parseDouble(JOptionPane.showInputDialog(
                        "Insira o valor a levantar: ")));
            } catch (HeadlessException headlessException) {
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Formato de numero inválido. Insira um novo");
            }
        } while (quantia <=0); 
            cp4.levantar(quantia);
            ContaPrazo.obterJuro();
       
        
        
        
        
        
        
        Conta cn1 = new ContaOrdem("Jorge Manteigas",1000.0);
        Conta cn2 = new ContaPrazo();
        Conta cn3 = new ContaPrazo("Isto é uma conta normal");
//        cn1.obterSaldo();
//        cn2.obterSaldo();
        ArrayList<Conta> listaContas= new ArrayList <>();
        listaContas.add(cn1);
        listaContas.add(cn2);
        listaContas.add(cn3);
        listaContas.add(co1);
        listaContas.add(cp1);
        
        try {
            for (int i = 0; i < listaContas.size(); i++) {
                listaContas.get(i).obterSaldo();
            }
        } catch (Exception e) {
            System.out.println("Já foram exibidos todos os elementos da lista");
        }
    }
    
}