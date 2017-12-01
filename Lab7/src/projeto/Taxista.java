/*
/*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
package projeto;

/**
 *
 * @author Joyce Mikaella
 */
/*Essa classe calcula as tributações inferidas unicamente aos Taxistas e
permite contabilizar a quantidade de passageiros para poder dar descontos*/
public class Taxista extends Rodoviario {
    
    private int passageiros=0;
    private double tributacaoTaxista = passageiros*0.5;
   
    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public double getTributacaoTaxista() {
        return tributacaoTaxista;
    }

    public void setTributacaoTaxista(double tributacaoTaxista) {
        this.tributacaoTaxista = tributacaoTaxista;
    }

     @Override
    public int getQuilometrosRodados() {
        return quilometrosRodados;
    }

    @Override
    public void setQuilometrosRodados(int quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }


}