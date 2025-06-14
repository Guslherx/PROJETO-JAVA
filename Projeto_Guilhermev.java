import java.util.*;
public class Projeto_Guilhermev {

	public static void main(String[] args) {
		//Variaveis
		
		String nome;
		int nota;
		char sexo;
		String nomeAprov[] = new String[50];
		int notaAprov[] = new int[50];	
		int aprovadoMas = 0;
		int reprovadoFem = 0;
		int somaNotasFem = 0;
		int mediaGeral = 0;
		int contAprov = 0;
		int contFem = 0;
		Scanner read = new Scanner(System.in);
		
		//Entrada de Dados
		for(int i = 0; i <= 6; i++) {
			
		
		System.out.println("Digite o Nome do Aluno: ");
		nome = read.nextLine();	
		do {	
		System.out.println("Digite o sexo do Aluno: ");
		sexo = read.next().charAt(0);
		
		if(sexo != 'M' && sexo != 'F') {
			System.out.println("Coloque apenas M para Masculino ou F para Feminino");
		}
		
		}while(sexo != 'M' && sexo != 'F');
		
		do {
			
		System.out.println("Digite a Nota do Aluno: ");
		nota = read.nextInt();
		if(nota < 0|| nota > 100) {
			System.out.println("A nota esta Incorreta, Digite uma Nota Correta!");
		}
		
		}while(nota > 100 || nota < 0); //Fim do Do/While
		
		//Calculos
		
		 if(nota >= 60) {
			System.out.println("Aluno Aprovado :) ");
			nomeAprov[contAprov] = nome;
			notaAprov[contAprov] = nota;
			contAprov++;
			if(sexo == 'M'){
				aprovadoMas++;
			}
		}else {
			System.out.println("Aluno Reprovado :( ");
			if(sexo == 'F') {
				contFem++;
			}
		}
		
		if(sexo == 'F') {
			somaNotasFem += nota;
			contFem++;
		}
		
		mediaGeral += nota;	
		read.nextLine();

		}//Fim do For
		
		System.out.println("Quantidade de Aprovados Do Sexo Masculino: " + aprovadoMas);
		System.out.println("Quantidade de Reprovados Do Sexo Feminino: " + reprovadoFem);
		if(contFem > 0) {
			System.out.println("Media notas sexo feminino: " + somaNotasFem / contFem);
		}
		System.out.println("Media geral das notas: " + mediaGeral / 6);
		System.out.println("RELATORIO DE APROVADOS");
		System.out.println(" NOME    NOTA");
		for(byte x = 0; x < contAprov; x++) {
			System.out.println(nomeAprov[x] + "   " + notaAprov[x]);
		}
		
		
		
	}

}
