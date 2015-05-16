package main.classes;

import java.util.ArrayList;

public class Euler116RGBTiles {
	public static final int SIZE = 50;

	public static void run() {

		// one's case: 144
		// two's final: 20365011024
		//three's final: 122106048
		//fours: 5453713
	/*	long count = 0;

		ArrayList<Integer> twoTiles = new ArrayList<Integer>();
		twoTiles.add(0);
		twoTiles.add(4);
		while (twoTiles.size() <= 12) {
			while (twoTiles.get(0) < SIZE - twoTiles.size() * 4 + 1) {
				int lastIndex = twoTiles.size() - 1;
				int pos = twoTiles.get(lastIndex);
				count += SIZE - pos - 3;
				twoTiles.set(lastIndex, SIZE - 3);
				for (int i = twoTiles.size() - 1; i > 0; i--) {
					if (twoTiles.get(i) > SIZE - (twoTiles.size() - i) * 4) {
						twoTiles.set(i - 1, twoTiles.get(i - 1) + 1);
						for (int j = i; j < twoTiles.size(); j++) {
							twoTiles.set(j, twoTiles.get(i - 1) + 4
									* (j - (i - 1)));
						}
					} else {
						i = 0;
					}
				}

			}
			for (int l = 0; l < twoTiles.size(); l++) {
				twoTiles.set(l, l * 4);
			}
			int siz = twoTiles.size();
			twoTiles.add(siz * 4);
			System.out.println(count);

			long a = 144 + 20365011024L + 12210648 + 5453713;
			//System.out.println(a);
		}*/
		
		/*long count = 0; --THREES

		ArrayList<Integer> twoTiles = new ArrayList<Integer>();
		twoTiles.add(0);
		twoTiles.add(3);
		while (twoTiles.size() <= 16) {
			while (twoTiles.get(0) < SIZE - twoTiles.size() * 3 + 1) {
				int lastIndex = twoTiles.size() - 1;
				int pos = twoTiles.get(lastIndex);
				count += SIZE - pos - 2;
				twoTiles.set(lastIndex, SIZE - 2);
				for (int i = twoTiles.size() - 1; i > 0; i--) {
					if (twoTiles.get(i) > SIZE - (twoTiles.size() - i) * 3) {
						twoTiles.set(i - 1, twoTiles.get(i - 1) + 1);
						for (int j = i; j < twoTiles.size(); j++) {
							twoTiles.set(j, twoTiles.get(i - 1) + 3
									* (j - i + 1));
						}
					} else {
						i = 0;
					}
				}

			}
			for (int l = 0; l < twoTiles.size(); l++) {
				twoTiles.set(l, l * 3);
			}
			int siz = twoTiles.size();
			twoTiles.add(siz * 3);
			System.out.println(count);
		}*/
		
		
		long count = 0;

		ArrayList<Integer> twoTiles = new ArrayList<Integer>();
		twoTiles.add(0);
		twoTiles.add(2);
		while (twoTiles.size() <= 25) {
			while (twoTiles.get(0) < SIZE - twoTiles.size() * 2 + 1) {
				int lastIndex = twoTiles.size() - 1;
				int pos = twoTiles.get(lastIndex);
				count += SIZE - pos - 1;
				twoTiles.set(lastIndex, SIZE - 1);
				for (int i = twoTiles.size() - 1; i > 0; i--) {
					if (twoTiles.get(i) > SIZE - (twoTiles.size() - i) * 2) {
						twoTiles.set(i - 1, twoTiles.get(i - 1) + 1);
						for (int j = i; j < twoTiles.size(); j++) {
							twoTiles.set(j, twoTiles.get(i - 1) + 2
									* (j - i + 1));
						}
					} else {
						i = 0;
					}
				}

			}
			for (int l = 0; l < twoTiles.size(); l++) {
				twoTiles.set(l, l * 2);
			}
			int siz = twoTiles.size();
			twoTiles.add(siz * 2);
			System.out.println(count);
		}

	}
}
