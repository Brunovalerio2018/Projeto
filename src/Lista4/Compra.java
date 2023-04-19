package Lista4;

public class Compra {
		
	private String produto;
	private float preco;
	private int parcelas;
	private float juros;
	private float frete;
	
	
	public Compra() {}
	
	public Compra(String produto, float preco, int parcelas, float juros, float frete) {
			super();
			this.produto = produto;
			this.preco = preco;
			this.parcelas = parcelas;
			this.juros = juros;
			this.frete = frete;
		
	}

		
	
	
	public float calculaFrete() {
		 return  frete = 50;
	}
	


	
	
	
	
	
	
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	public float getJuros() {
		return juros;
	}
	public void setJuros(float juros) {
		this.juros = juros;
	}
	public float getFrete() {
		return frete;
	}
	public void setFrete(float frete) {
		this.frete = frete;
	}
		
	
	
	
}
