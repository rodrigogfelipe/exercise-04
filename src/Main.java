import java.util.Scanner;

/*eia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, 
 * e informe-o expresso no formato horas:minutos:segundos.EntradaO arquivo de entrada cont�m um valor inteiro N.
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, resto, horas, minutos, segundos;
		n= sc.nextInt();
		
		horas= n / 3600;
		resto= n % 3600;
		
		minutos= resto / 60;
		segundos= resto % 60;
		System.out.println(horas + ":" + minutos + ":"+ segundos);
		

	}

}
