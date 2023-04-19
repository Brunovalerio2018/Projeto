package Lista4;

import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Compra cliente1 = new Compra();	
		Produto produto = new Produto();
		
		
		cliente1.setProduto("Poltrona");
		cliente1.setPreco(455.00);
		cliente1.setFrete(50);
		cliente1.setJuros(10);
		cliente1.setParcelas(12);
		
		System.out.println("Cliente Comprou: "   + cliente1.getProduto() 
								   + "\nPreco: " + cliente1.getFrete() 
								   + "\nFrete: " + cliente1.getJuros()
								   + "\nJuros: " + cliente1.getJuros()
								+   "Parcelas: " + cliente1.getParcelas()
								);	
		
		

	}

}
