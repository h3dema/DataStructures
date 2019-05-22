/* 
 * exemplo de busca em um array Java
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExemploBuscaArray {

    public static void main(String args[]) {
	// array que será utilizado de exemplo
	Integer[] array = {1, 3, 25, 12, 3, 4, 10, 25, 13, 33, 7, 21};
        System.out.println("Array exemplo: "+ Arrays.toString(array) );
        int numeroPesquisado = 3;
        System.out.println("Buscando número :" + numeroPesquisado );       
        /*
         * Exemplo 1: usando ArrayList
	 */
	// criamos um array numérico
        List<Integer> lista = Arrays.asList(array);

	// procuramos o número "3"
        if (lista.contains(numeroPesquisado)) {
            System.out.println("Elemento encontrado no array utilizando o método ArrayList.contains()");
        } else {
            System.out.println("Elemento não encontrado no array utilizando o método ArrayList.contains()");
	}


        /*
         * Exemplo 2: usando HashSet
	 */
        Set<Integer> arraySet = new HashSet<Integer>(lista);
        if (arraySet.contains(numeroPesquisado)) {
            System.out.println("Elemento encontrado no array utilizando o método HashSet.contains()");
        }

        /*
	 * Exemplo 3: procurando um elemento em um array ordenado
        */
        // usamos nosso array original de exemplo e criamos uma copia utilizando Arrays.copyOf
        // o novo array é ordenado usando Arrays.sort e armazenado
   	Integer[] arrayOrdenado = Arrays.copyOf( array,  array.length );
	Arrays.sort( arrayOrdenado );
        System.out.println("Array ordenado: "+ Arrays.toString(arrayOrdenado) );
	// utiliza busca binária para localizar o número desejado
	int posicao = Arrays.binarySearch(arrayOrdenado, numeroPesquisado);
        if(posicao >= 0 ){
            System.out.println("Elemento encontrado no array utilizando o método de busca binária na posição " + posicao);
        } else {
            System.out.println("Elemento não encontrado no array utilizando o método de busca binária");
	}
    
        /*
	 * Exemplo 4: força bruta --> realizando um loop para varrer os elementos do array
        */
        for(Integer valor: arrayOrdenado){
            if(valor.equals(numeroPesquisado)){
                System.out.println("Elemento encontrado no array utilizando loop");
		break; // para forçar a saída do loop
            }
        }
        
        /*
         * Exemplo 5: Utilizando org.apache.commons.lang3.ArrayUtils
         */
        CommonsArrayUtils.localiza(arrayOrdenado, numeroPesquisado);
        
        /*
         * Exemplo 6: Utilizando org.apache.commons.lang3.ArrayUtils
         */
        CommonsArrayUtils.localizaPosicao(arrayOrdenado, numeroPesquisado);
    }
}
