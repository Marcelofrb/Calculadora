/*
Nome: Marcelo Felipe   c378216
Turma: DS3P30
Exercício: Calculadora o peso do usuário no planeta escolhido
*/
package Calculadorapeso;

public class Calculadorapeso {
	public static void main(String [] args){
		double peso=0;
		int planeta=0;
		double pesoF=0;
		
		peso = lerDouble("digite seu peso:", 0, 200);
		
		do{
			planeta = lerInt("digite o numero para saber o seu peso no planeta correspondente :\n(1)Mercúrio  (2)Vênus  (3)Marte  (4)Júpter  (5)Saturno  (6)Urano");
			switch(planeta) {
				case 1:
					pesoF = calculaPeso(peso,0.37);
					break;
				case 2:
					pesoF = calculaPeso(peso,0.88);
					break;
				case 3:
					pesoF = calculaPeso(peso,0.38);
					break;
				case 4:
					peso = calculaPeso(peso,2.64);
					break;
				case 5:
					pesoF = calculaPeso(peso,1.15);
					break;
				case 6:
					pesoF = calculaPeso(peso,1.17);
					break;
				default:
					System.out.println("numero de planeta invalido !");
			}
		}while(planeta < 1 || planeta >6);
		System.out.println("Seu peso no planeta escolhido e: " + pesoF + "Kg");
	}
	
	
	public static double lerDouble(String mensagem, double minimo, double maximo){
		double retorno = 0;		
		do{
			retorno = lerDouble(mensagem);
			if(retorno < minimo || retorno >maximo){
				System.out.println("Valor não aceito ");
			}
		}while(retorno < minimo || retorno >maximo);

		return retorno;
	}

	public static double lerDouble(String mensagem){
		double retorno = 0;
		System.out.println(mensagem);
		retorno = new java.util.Scanner(System.in).nextDouble();
		return retorno;
	}
	
	public static int lerInt(String mensagem){
		int retorno = 0;
		System.out.println(mensagem);
		retorno = new java.util.Scanner(System.in).nextInt();
		return retorno;
	}
	
	public static double calculaPeso (double a, double b){
		double result = 0;
		result = a/10*b;
		return result;
	}

}
