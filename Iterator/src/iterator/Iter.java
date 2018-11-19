
package iterator;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Iter {

    public static void main(String[] args) {
     
        List<Integer> list = new ArrayList();
        
        for(int i=10; i>=0; i--){
            list.add(i);
        }
        
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(list);
    }
    
}
