package main.functions;
import java.util.ArrayList;

public  class Sort<T extends Comparable<T>>{

	public ArrayList<T> sort(T[] list) {
		ArrayList<T> array = new ArrayList<T>();
		for(T i: list){
			array.add(i);
		}
		return sort(array);
	}

	private int compare(T one, T two){
		return one.compareTo(two);
	}


	public ArrayList<T> sort(ArrayList<T> list) {
		//System.out.println("SYSTEM: Beginning sort...");
		ArrayList<T> temp = sortMerge(list);
		//System.out.println("SYSTEM: Sorting complete.");
		return temp;
	}

	private ArrayList<T> sortMerge(ArrayList<T> list) {
		ArrayList<T> left = new ArrayList<T>(), right = new ArrayList<T>();
		if (list.size() <= 1) return list;
		int mid = list.size() / 2;

		for(int i = 0; i < mid; i++) {
			left.add(list.get(i));
		}
		for(int i = mid; i < list.size(); i++) {
			right.add(list.get(i));
		}

		left = sortMerge(left);
		right = sortMerge(right);

		return merge(left, right);
	}

	private ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
		ArrayList<T> temp = new ArrayList<T>();
		
		if(left.size() > 0 && right.size() > 0 && compare(left.get(left.size() - 1), right.get(0)) < 0){
			temp.addAll(left);
			temp.addAll(right);
			return temp;
		}
		
		while(left.size() > 0 || right.size() > 0) {
			if (left.size() > 0 && right.size() > 0) {
				if(compare(left.get(0), right.get(0)) <= 0) {
					temp.add(left.get(0));
					left.remove(0);
				} else {
					temp.add(right.get(0));
					right.remove(0);
				}
			} else if(left.size() > 0) {
				temp.add(left.get(0));
				left.remove(0);
			} else if(right.size() > 0) {
				temp.add(right.get(0));
				right.remove(0);
			}
		}

		return temp;
	}

}
