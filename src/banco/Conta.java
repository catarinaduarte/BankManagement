/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.Serializable;

/**
 *
 * @author 35196
 */
public class Conta implements Operacoes, Serializable {

    static long ultimoNumero = 0;
    private static float juro = 0.08f;

    public static void obterJuro() {
        System.out.println("Juro: " + getJuro());
    }

    public static void alterarJuro(float f) {
        setJuro(f);
        obterJuro();
    }

    private long numero;
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        //this
        numero = ++ultimoNumero;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Cria uma nova conta
    public Conta(String titular) {
        this(titular, 50.0);
//        numero = ++ultimoNumero;
//        this.titular = titular;
//        this.saldo=50.0;
    }

    public Conta(double saldo) {
        this("Sem nome vai ser chamado pelo construtor default", saldo);
//        numero = ++ultimoNumero;
//        this.saldo = saldo;
//        this.titular = "Desconhecido";

    }

    // o construtor default
    public Conta() {
        this(50.0);
        //  numero = ++ultimoNumero;
        //  saldo = 50.0;
        //  titular = "Desconhecido";

    }

    public Conta(double saldo, String titular) {
        this(titular, saldo);

    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

    /**
     *
     */
    @Override
    public void obterSaldo() {
        System.out.println("Numero: " + getNumero() + ", Titular: "
                + getTitular() + ", saldo: ");
        System.out.printf("%.2f \n", getSaldo());
    }

    /**
     *
     * @param quantidade
     */
    @Override
    public void depositar(double quantidade) {
        if (quantidade > 0) {
            setSaldo(getSaldo() + quantidade);
            System.out.println("Depósito de  " + quantidade + " efectuado com sucesso!");
            obterSaldo();
        }

    }

    /**
     *
     * @param quantidade
     */
    @Override
    public void levantar(double quantidade) {
        if (getSaldo() >= quantidade) {
            setSaldo(getSaldo() - quantidade);
            System.out.println("Levantamento de  " + quantidade + " efectuado com sucesso!");
            obterSaldo();
        } else {
            System.out.println("Saldo Insuficiente. Só pode levantar até " + getSaldo());
        }

    }

    /**
     * @return the juro
     */
    public static float getJuro() {
        return juro;
    }

    /**
     * @param aJuro the juro to set
     */
    public static void setJuro(float aJuro) {
        juro = aJuro;
    }

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(float quantia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
