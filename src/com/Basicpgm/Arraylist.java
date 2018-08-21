package com.Basicpgm;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List <String> a= new ArrayList <>();
		a.add("selenium");
		a.add("selenium");
		a.add("selenium");
		//System.out.println(a.get(0));
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
