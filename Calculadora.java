/*
Nome: Marcelo Felipe    c378216
Turma: DS3P30
Exercício: Calculadora 
*/

package calculadora;

public class Calculadora {

	public static void main(String [] args){
		double n1 = 0;
		double n2 = 0;
		double result = 0;
		char op = ' ';
		char esc = 's';
		
		while ((esc == 'S') || (esc == 's')){
			
			n1 = lerDouble("Digite o primeiro numero", 0 , 10);
			op = lerChar("Qual calculo desejado\n(+)Soma (-)Subtração (*)Multiplicação (/)Divisão");
			n2 = lerDouble("Digite o segundo numero", 0, 10);
			
			switch(op) {
				case '+':
					result = somar(n1, n2);
					break;
				case '-':
					result = subtrair(n1, n2);
					break;
				case '*':
					result= multiplicar(n1, n2);
					break;
				case '/':
					result = dividir(n1, n2);
					break;
				default:
					System.out.println("este operador nao existe, ou é invalido!");
			}
					
			System.out.println("resultado: " + ((op == '+' || op == '-' || op == '*' || op == '/')?result:"Inválido"));
			esc = lerChar("continuar?\n(s)Sim (n)Não");
		}
	}

	public static double lerDouble(String mensagem, double minimo, double maximo){
		double retorno = 0;		
		do{
			retorno = lerDouble(mensagem);
			if(retorno < minimo || retorno >maximo){
				System.out.println("valor não aceito");
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

	public static char lerChar(String mensagem){
		char retorno = ' ';
		System.out.println(mensagem);
		retorno = new java.util.Scanner(System.in).next().charAt(0);
		return retorno;
	}

	public static double somar(double n1, double n2){
		double result= 0;
		result = n1 + n2;
		return result;
	}

	public static double subtrair(double n1, double n2){
		double result = 0;
		result = n1 - n2;
		return result;
	}
	
	public static double multiplicar (double n1, double n2){
		double result = 0;
		result = n1 * n2;
		return result;
	}
	
	public static double dividir (double n1, double n2){
		double result = 0;
		result = n1 / n2;
		return result;
	}
	
}
