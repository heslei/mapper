package mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Criar um método que recebe uma lista e a mapeia (função map de programação
 * funcional) para uma outra lista.
 */

public class Mapeado {

	public List<String> mapeia(List<Integer> lista,	Mapper<Integer, String> mapper) {

		List<String> resultado = new ArrayList<String>();

		for (Integer from : lista) {
			resultado.add(mapper.map(from));
		}

		return resultado;
	}

}
