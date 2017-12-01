/*
 /*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
package projeto;

/**
 *
 * @author Joyce Mikaella
 */
/*Essa classe calcula as tributações inferidas unicamente aos Professores, calculando seus tribulos em cima de
um valor de salário base já pré definido e contabilizando despesas didáticas para poder realizar os descontos*/
public class Professor extends Contribuinte{
    
    private int quantSalarios;
    private double salarioMinimo=920.70;
    private double tributacaoProfessor;
    private double despesasDidaticas;
    private double descontoProfessor = despesasDidaticas*0.50;
    
    
    /*Esse método é utilizado para calcular melhor os tributos de acordo com a quantidade de salários.
    O laço foi criado com 3 condições e cada uma com seu retorno que já havia sido definido no roteiro do LAB.*/
    public double Tributos (){
    
      if(  quantSalarios <= 1) {
           return tributacaoProfessor=salarioMinimo*0.05;
          
      } if(quantSalarios > 1 || quantSalarios <= 5) {
          
           return tributacaoProfessor=salarioMinimo*0.10;
          
      }
      if(  quantSalarios > 5) {
           return tributacaoProfessor=salarioMinimo*0.20;    
      }    
         return 0;
    }
 
    
    
}