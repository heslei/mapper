import java.util.ArrayList;
import java.util.List;

import mapper.Mapeado;
import mapper.Mapper;

import org.junit.Assert;
import org.junit.Test;


public class MapperTest {

	@Test
	public void mapeiaLista1Elemento(){
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		
		List<String> resultado = new Mapeado().mapeia(lista, new M());
		
		Assert.assertEquals("Quantidade: 10", resultado.get(0));
	}
	
	@Test
	public void mapeiaLista10Elemento(){
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		
		List<String> resultado = new Mapeado().mapeia(lista, new M());
		
		Assert.assertEquals("Quantidade: 1", resultado.get(0));
		Assert.assertEquals("Quantidade: 2", resultado.get(1));
		Assert.assertEquals("Quantidade: 3", resultado.get(2));
		Assert.assertEquals("Quantidade: 4", resultado.get(3));
		Assert.assertEquals("Quantidade: 5", resultado.get(4));
		Assert.assertEquals("Quantidade: 6", resultado.get(5));
		Assert.assertEquals("Quantidade: 7", resultado.get(6));
		Assert.assertEquals("Quantidade: 8", resultado.get(7));
		Assert.assertEquals("Quantidade: 9", resultado.get(8));
		Assert.assertEquals("Quantidade: 10", resultado.get(9));
	}
	
	@Test
	public void mapeiaListaVazia(){
		List<Integer> lista = new ArrayList<Integer>();
		
		List<String> resultado = new Mapeado().mapeia(lista, new M());
		
		Assert.assertTrue("Lista vazia", resultado.isEmpty());
	}
	
}

class M implements Mapper<Integer, String>{

	@Override
	public String map(Integer from) {
		return "Quantidade: " + from ;
	}
	
}
