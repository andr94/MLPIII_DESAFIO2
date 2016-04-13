package br.unipe.mlpiii.exenota.modelo;

public class Item implements Comparable<Item>{
	
	private int codigo;
	private String descricao;
	private double preco;
	
	public String toString (){
		return codigo + ":" + descricao;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public int compareTo(Item item){
		if (this.codigo > item.getCodigo())
			return 1;
		if (this.codigo < item.getCodigo())
			return -1;
		return 0;
	}
	
	public Item(int codigo, String nome, double preco){
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

}
