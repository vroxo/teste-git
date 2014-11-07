package br.com.caelum.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void deveSetarAsVariaveis(){
		Produto bala = new Produto("bala", 15.30);
		assertEquals(15.30,bala.getPreco(),0.0);
		assertEquals("bala", bala.getNome());
	}

}
