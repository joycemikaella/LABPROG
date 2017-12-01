/*
 /*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
package projeto;

/**
 *
 * @author Joyce Mikaella
 */

/*Essa classe serve para cadadstrar os contribuintes, recebendo o nome e inserindo seu número de contribuinte*/
public class MeuSistemaSimplesDeTributacao extends Contribuinte {
    
    
    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int getNumeroContribuinte() {
        return numeroContribuinte;
    }
@Override
    public void setNumeroContribuinte(int numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
}
@Override
    public boolean isTemCasa() {
        return temCasa;
    }
@Override
    public void setTemCasa(boolean temCasa) {
        this.temCasa = temCasa;
    }
@Override
    public boolean isTemCarro() {
        return temCarro;
    }
@Override
    public void setTemCarro(boolean temCarro) {
        this.temCarro = temCarro;
    }
    
   
}
