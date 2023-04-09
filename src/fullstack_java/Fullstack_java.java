
package fullstack_java;

import java.util.ArrayList; //Para los arrays de abajo

public class Fullstack_java {
    public static void main(String[] args) {
        System.out.println("Mi primer programa Java");
        int i = 5;
        System.out.println("Antes del punto de ruptura");
        System.out.println("i=" +i);
        System.out.println("Después");
        System.out.println("FIN");
    }
     public static void arrays(String[] args) {
        ArrayList<String> v1 = new ArrayList<String>();

        v1.add("cadena añadida");

        ArrayList<String> v2 = (ArrayList<String>) v1.clone(); //Con esto clonamos la cadena v1
    }
    
}
