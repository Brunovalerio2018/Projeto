package Lista4;

public class Produto {
	
	private String nome;
	private float preco;
	private int codigo;
	private int quantidade;
	
	
	
	public boolean verificaEstoqueProduto() {
 		if(quantidade > 0) {
 			
 			return true;
 		
 		} else 
 			
 			return false;
 
 	
 	};
	
	 	public Produto() {
	 		
	 	}
	 	
	
		public Produto(String nome, float preco, int codigo, int quantidade) {
			super();
			this.nome = nome;
			this.preco = preco;
			this.codigo = codigo;
			this.quantidade = quantidade;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

}
