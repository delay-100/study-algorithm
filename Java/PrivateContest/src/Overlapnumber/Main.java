package Overlapnumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws Exception {
		
//		int[] a = {1, 2, 3, 3, 3, 3, 4, 4};
//		int[] a = {3, 2, 4, 4, 2, 5, 2, 5, 5};
		int[] a = {3, 5, 7, 9, 1};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(it.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) it.next();
			if(entry.getValue()>1) {
				al.add(entry.getValue());
			}
		}

		int[] list;
		if(al.size()>0) {
			list = new int[al.size()];
			for(int i=0; i<al.size(); i++) {
				list[i] = al.get(i);
	
				System.out.print(list[i]+" ");
			}
		}
		else {
			list = new int[1];
			list[0] = -1;
			System.out.println(-1);
		}
		
	}
}
