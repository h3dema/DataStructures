import org.apache.commons.lang3.ArrayUtils;
/**
 *
 * @author Henrique
 */
public class CommonsArrayUtils {
  
    public static void localiza(Integer[] array, int e) {        
        if (ArrayUtils.contains(array, e)){
                System.out.println("Elemento encontrado no array utilizando ArrayUtils.contains");
        } else {
                System.out.println("Elemento não encontrado no array utilizando ArrayUtils.contains");
        }        
    }
    
    public static void localizaPosicao(Integer[] array, int e) {
        int posicao = ArrayUtils.indexOf(array, e);
        if (posicao >= 0){
                System.out.println("Elemento encontrado no array utilizando ArrayUtils.indexOf. Posição = "+posicao);
        } else {
                System.out.println("Elemento não encontrado no array utilizando ArrayUtils.indexOf");
        }
    }
}
