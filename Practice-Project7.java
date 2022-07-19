package pratice;
import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"sun");    
	      hm.put(2,"moon");    
	      hm.put(3,"sky");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     
	      
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(7,"ton");  
	      ht.put(5,"ceat");  
	      ht.put(6,"nike");  
	      ht.put(4,"ball");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	  
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"loin");    
	      map.put(9,"Cat");    
	      map.put(10,"dog");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

}
