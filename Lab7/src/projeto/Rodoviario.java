//*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
 
package projeto;

/**
 *
 * @author Joyce Mikaella
 * 
 */
/*Essa classe serve para calcular os descontos para profissionais rodoviários (Taxistas e Caminhoneiros)e 
um desconto que é dado para os mesmos de acordo com a kilometragem rodada*/
public class Rodoviario extends Contribuinte{
    
      int quilometrosRodados ;
      double descontoRodoviario = quilometrosRodados*0.01;

    /*Essas funções servem para receber e inserir na variavel criada os valores dos kilometros rodados*/  
    public int getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(int quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

       
    

    
}
