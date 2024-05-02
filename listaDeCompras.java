import java.util.ArrayList;
import java.util.Scanner;

public class ComprasArrayList {
	public static void main(String[] args) {
		ArrayList<String> nomeProd = new ArrayList<String>();
		ArrayList<Integer> quantProd = new ArrayList<Integer>();
		ArrayList<Double> precoProd = new ArrayList<Double>();
		ArrayList<Double> totalCompr = new ArrayList<Double>();
		
		Scanner resposta = new Scanner(System.in);
		
		int repetidor = 0;
		while (repetidor < 4) {
			Scanner scan = new Scanner(System.in);
			repetidor = 1 + repetidor;
			
			System.out.println("Digite o " + repetidor+"º item da sua lista: ");
			String nomeP = scan.nextLine();
			nomeProd.add(nomeP);
			
			System.out.println("Digite a quantidade do " + repetidor+"º item da sua lista: ");
			int quantP = scan.nextInt();
			quantProd.add(quantP);
			
			System.out.println("Digite o preço do " + repetidor+"º item da sua lista: ");
			double precoP = scan.nextDouble();
			precoProd.add(precoP);
			
			totalCompr.add(quantP * precoP);
		}
		
		System.out.println("\nO QUE DESEJA FAZER AGORA?");
		System.out.println("1- Remover Item / 2- Exibir Total Parcial / 3- Verificar Compra");
		System.out.print(": ");
		
		int resp = resposta.nextInt();

		if (resp == 1) {
			Scanner remove = new Scanner(System.in);
			System.out.println("Qual o número do item da lista que quer remover?");
			System.out.print(": ");
			
			int respR = remove.nextInt();
			
			nomeProd.remove(nomeProd.get(respR-1));
			quantProd.remove(quantProd.get(respR-1));
			precoProd.remove(precoProd.get(respR-1));
			
			System.out.println("Ok, removido!");
			System.out.println("Suas novas listas: ");
			System.out.println("Produtos: " + nomeProd);
			System.out.println("Quantidades: " + quantProd);
			System.out.println("Preços: " + precoProd);
			
		} else if (resp == 2) {
			System.out.println("Aqui está o total de cada item de sua lista!");
			System.out.println(nomeProd.get(0)+ " no total ficou " + totalCompr.get(0));
			System.out.println(nomeProd.get(1)+ " no total ficou " + totalCompr.get(1));
			System.out.println(nomeProd.get(2)+ " no total ficou " + totalCompr.get(2));
			System.out.println(nomeProd.get(3)+ " no total ficou " + totalCompr.get(3));
			
		} else if (resp == 3) {
			Scanner buscar = new Scanner(System.in);
			System.out.println("Qual item você já comprou?");
			System.out.print(": ");
			String busca = buscar.nextLine();
			if (nomeProd.contains(busca)) {
				System.out.println("Status alterado para: Comprado!");
			} else {
				System.out.println("O item não existe na lista!");
			}
		}

		

	}
}
