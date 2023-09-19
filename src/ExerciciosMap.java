import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosMap {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("\n..Imprima todos os elementos dessa lista de String:\n..");
       /* numerosAleatorios.stream().forEach(new Consumer<String>() {
                        
            @Override
            public void accept(String s) {
                // TODO Auto-generated method stub
                System.out.println(s);

                
            }
        });
*/
//      System.out.println("\n..Imprima todos os elementos dessa lista de String:\n..");
//           numerosAleatorios.stream().forEach(s-> System.out.println(s));

        System.out.println("\n..Imprima todos os elementos dessa lista de String:\n..");
//          numerosAleatorios.stream().forEach(System.out::println);
            numerosAleatorios.forEach(System.out::println);    
            
        System.out.println("\nPegue os 5 primeiros numeros e coloque dentro de um set: ");      
        
//            numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

             numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
             
  

    }
}
