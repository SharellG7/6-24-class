package com.revature.c.flow;

public class FlowOfControl {
	public static void main(String[] args) {
//		ifDemo(5);
		switchDemo(3);
	}

	public static void switchDemo(int i) {
		switch (i) {
		case 1:
			System.out.println("case 1 do something");
			break;
		case 2: 
			System.out.println("case 2 do something else");
			break;
		case 3: 
			System.out.println("case 3 do another thing");
			break;
		default:
			System.out.println("idk what you are asking for");
			break;
		}
	}

	public static void ifDemo(int i) {
		if (i == 5 || i == 3) {
			System.out.println("i is 5 or 3");
		} else if (i > 100) {
			System.out.println(" i is over 100");
		} else {
			System.out.println("i is not 5 or 3 and less than 100");
		}
	}
}
