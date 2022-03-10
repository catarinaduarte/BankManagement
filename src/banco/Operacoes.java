/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 35196
 */
public interface Operacoes {
    public void obterSaldo(); 
    public void depositar (double quantidade);
    public void levantar  (double quantidade);
    
}
