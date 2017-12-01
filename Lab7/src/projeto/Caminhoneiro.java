/*
/*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
package projeto;

/**
 *
 * @author Joyce Mikaella
 */
/*Essa classe calcula as tributações inferidas unicamente aos Caminhoneiros
e recebe a quantidade de toneladas para calcular os tributos de acordo*/
public class Caminhoneiro extends Rodoviario {

     private int toneladas;
     private double tributacaoCaminhoneiro=500;
    
     
      /*Esse método foi criado para poder retornar o valor de quanto seria tributado em cima da quantidade
     de toneladas. Como era um valor variável e possuíam duas condições, foi criado um laço para poder atender
     melhor a ambas*/
    public double Tributos (){
   
      if(  toneladas <= 10) {
           return tributacaoCaminhoneiro;
          
      } else {
			double toneladasExtras = toneladas - 10;
			return tributacaoCaminhoneiro + (toneladasExtras * 100);
		}

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
