
package hasshmap;

import java.util.HashMap;
import java.util.Map;


public class HasshMap {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer,String> mapita = new HashMap<Integer,String>();
        
        mapita.put(1,"Tijuana");
        mapita.put(2, "Toluca");
        mapita.put(3, "Veracruz");
        mapita.put(4, "Santos");
        mapita.put(5, "Pachuca");
        
        for(Map.Entry<Integer,String> adquirir: mapita.entrySet()){
            int llave = adquirir.getKey();
            String valor = adquirir.getValue();
            
            System.out.println(llave+ ": "+valor);
        }
        
    }
    
}
