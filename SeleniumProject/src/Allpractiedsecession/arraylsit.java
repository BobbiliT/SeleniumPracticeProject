package Allpractiedsecession;

import java.util.ArrayList;
import java.util.Collections;

public class arraylsit {
	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("tejesh");
		ar.add("ramu");
		ar.add("drona");
		ar.add("ganga");
		Collections.sort(ar);
		for(String ac:ar) {
			System.out.println(ac);
		}
	}
}
