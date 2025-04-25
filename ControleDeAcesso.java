package estruturarepetitiva;

import java.util.Scanner;

public class ControleDeAcesso {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int x, tentativas = 1;
			String msg = "SENHA INVÁLIDA!";
			
			System.out.print("DIGITE SUA SENHA NUMÉRICA DE 4 DÍGITOS: ");
			x = sc.nextInt();
			
			while (x != 2025 && tentativas < 3) {
				System.out.println(msg);
				System.out.print("DIGITE NOVAMENTE: ");
				x = sc.nextInt();
				tentativas++;
				
			}
			
			if (x == 2025) {
				msg = "ACESSO PERMITIDO!";
				System.out.println(msg);
			
			} else if (tentativas >= 3) {
				msg = "NÚMERO DE TENTATIVAS EXCEDIDO!";
				System.out.println(msg);
			}
			
			sc.close();

		}

	}

