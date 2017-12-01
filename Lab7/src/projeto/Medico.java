/*
 /*Aluno: Adenou Dantas de Farias Júnior*/
/*Aluno 2: Joyce Mikaella das Mercês Aciole*/
package projeto;

/**
 *
 * @author Joyce Mikaella
 */
/*Essa classe calcula as tributações inferidas unicamente aos Medicos
contabilizando a quantidade de pacientes para poder fazer esse cálculo e recebendo valores de despesas */
public class Medico extends Contribuinte {

    private int pacientes=0;
    private double tributacaoMedicos = pacientes*10;
    private int quantCongressos;
    private double despesasCongressos=500; /*valor foi suposto como fixo para facilitar o programa*/
    
}
