package br.unipe.mlpiii.exenota.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.unipe.mlpiii.exenota.modelo.Item;

public class Principal {
	public static void main(String[] args) {
		List<Item> itens = new ArrayList<>();
		
		Item i1 = new Item(1, "Parafuso", (double)3);
		i1.setCodigo(1);
		i1.setDescricao("Parafuso");
		i1.setPreco(3);
		Item i2 = new Item(2, "Martelo", (double)10);
		i2.setCodigo(2);
		i2.setDescricao("Martelo");
		i2.setPreco(10);
		Item i3 = new Item(3, "Prego", (double)2);
		i3.setCodigo(3);
		i3.setDescricao("Prego");
		i3.setPreco(2);
		Item i4 = new Item(4, "Broca", (double)1);
		i4.setCodigo(4);
		i4.setDescricao("Broca");
		i4.setPreco(1);
		
		itens.add(i3);
		itens.add(i2);
		itens.add(i1);
		itens.add(i4);
		
		
		
		for (Item item : itens) {
			System.out.println(item);
		}
		
		Collections.sort(itens);
		
		for (Item item : itens) {
			System.out.println(item);
		}
		
		Collections.reverse(itens);
		for (Item item : itens) {
			System.out.println(item);
		}
		
		
		
	}
}
