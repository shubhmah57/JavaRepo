package JavaPrograms.Collections.HashingBasedDS;/*package whatever //do not write package name here */

import java.util.*;

class GFG {
    
    public static String findMax(List <String> listItem,List <String> listNum){
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        for(String s : listItem){
                hmap.put(s,0);
        }
        for(String s : listNum){
            String []sa = s.split(" ");
            for(String se : sa){
                if(hmap.containsKey(se))
                    hmap.put(se,hmap.get(se)+1);
            }
        }
        
        System.out.println(hmap);
        
        hmap = sort(hmap);
		
		System.out.println(hmap);
        
        return "ss";
    }
    
    public static HashMap<String,Integer> sort (HashMap<String,Integer> hmap){ 
        List<Map.Entry<String, Integer>> list = 
               new LinkedList<Map.Entry<String, Integer> >(hmap.entrySet()); 

        Collections.sort(list,new Comparator <Map.Entry<String,Integer>>(){
		    public int compare (Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2){
				if(o1.getValue() >= o2.getValue())
					return -1;
				else
					return 1;
		    } 
		});
		
		LinkedHashMap<String,Integer> temp = new LinkedHashMap<String,Integer>();
		
		for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        }
        
        return temp;
    }
        
            
	public static void main (String[] args) {
		System.out.println("GfG!");
		List <String> listItem = new ArrayList<String>();
		listItem.add("bell");
		listItem.add("switch");
		listItem.add("bulb");
		listItem.add("rings");
		
		List <String> listNum = new ArrayList<String>();
		listNum.add("bulb is coming");
		listNum.add("switch is red");
		listNum.add("Red bulb and blue switch");
		listNum.add("New bell and  old watch");
		listNum.add("buy rings not bell");
		
		System.out.println(findMax(listItem ,listNum));
		
		
	}
}