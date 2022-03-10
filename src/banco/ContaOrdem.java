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
public class ContaOrdem extends Conta
        implements Operacoes {

    //extend ContaBancaria
    private static float juroOrdem = 0.02f;

    private float plafond;

    public ContaOrdem(String titular, double saldo, float plafond) {
        super(titular, saldo);
        this.plafond = plafond;
    }

    public ContaOrdem(String titular, double saldo) {
        super(titular, saldo);
        this.plafond = 250.0f;
    }

    public ContaOrdem() {
        super();
        this.plafond = 250.0f;
    }

    @Override
    public String toString() {
        return "ContaOrdem{" + "plafond=" + getPlafond() + '}';
    }

    @Override
    public void obterSaldo() {
        super.obterSaldo();
        System.out.println("Plafond " + this.getPlafond());
    }

    /**
     * @return the juroOrdem
     */
    public static float getJuroOrdem() {
        return juroOrdem;
    }

    /**
     * @param aJuroOrdem the juroOrdem to set
     */
    public static void setJuroOrdem(float aJuroOrdem) {
        juroOrdem = aJuroOrdem;
    }

    /**
     * @return the plafond
     */
    public float getPlafond() {
        return plafond;
    }

    /**
     * @param plafond the plafond to set
     */
    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

}
