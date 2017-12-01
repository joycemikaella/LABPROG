/*
/*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
 
package projeto;

/**
 *
 * @author Joyce Mikaella
 */
/*Essa classe serve para calcular os tributos e verificar as despesas
e descontos oferecidos em cima desses tributos*/
public class Contribuinte {
    
   String nome;
   int numeroContribuinte=0;
   double valorBens, valorDescontos;
   boolean temCasa=false, temCarro= false;

   
   
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroContribuinte() {
        return numeroContribuinte;
    }

    public void setNumeroContribuinte(int numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
    }

    public double getValorBens() {
        return valorBens;
    }

    public void setValorBens(double valorBens) {
        this.valorBens = valorBens;
    }

    public double getValorDescontos() {
        return valorDescontos;
    }

    public void setValorDescontos(double valorDescontos) {
        this.valorDescontos = valorDescontos;
    }

    public boolean isTemCasa() {
        return temCasa;
    }

    public void setTemCasa(boolean temCasa) {
        this.temCasa = temCasa;
    }

    public boolean isTemCarro() {
        return temCarro;
    }

    public void setTemCarro(boolean temCarro) {
        this.temCarro = temCarro;
    }
   
   
   
    
}
