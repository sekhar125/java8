package com;

public class MaxArrayExample {

	public static void main(String[] args) {
		int a[] = { 10, 5 };
		int b[] = { 30, 5, 5};
		int c[] = { 10, 20, 5 };
		int shortTemp[] = null, maxTemp1[] = null, maxTemp2[] = null;
		if (a.length < b.length && a.length < c.length) {
			shortTemp = a;
			maxTemp1 = b;
			maxTemp2 = c;
		} else if (b.length < a.length && b.length < c.length) {
			shortTemp = b;
			maxTemp1 = a;
			maxTemp2 = c;
		} else if (c.length < a.length && c.length < b.length) {
			shortTemp = c;
			maxTemp1 = b;
			maxTemp2 = c;
		} else if (a.length == b.length && b.length > c.length) {
			shortTemp = a;
			maxTemp1 = b;
			maxTemp2 = c;
		} else if (c.length == b.length && b.length > a.length) {
			shortTemp = b;
			maxTemp1 = a;
			maxTemp2 = c;
		} else {
			shortTemp = a;
			maxTemp1 = b;
			maxTemp2 = c;
		}
		for (int i = 0; i < shortTemp.length; i++) {
			boolean match1 = false,match2=false;
			for (int j = 0; j < maxTemp1.length; j++) {
				if (maxTemp1[j] == shortTemp[i]) {
					match1 = true;
				}
			}
			for (int k = 0; k < maxTemp1.length; k++) {
				if (maxTemp1[k] == shortTemp[i]) {
						match2 = true;
				}
			}
			if (match1&&match2) {
				System.out.print(shortTemp[i]);
			}
		}
	}

}
