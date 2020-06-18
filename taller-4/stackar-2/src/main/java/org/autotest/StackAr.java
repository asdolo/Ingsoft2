package org.autotest;

public class StackAr {
	public int magicFunction(double k) {
		double[] array = { 5.0, 1.0, 3.0 };
		int c = 0;
		for (int i = 0; i < 3; i++) {
			if (array[i] + k == 0) {
				c++;
			}
		}
		return c;
	}
}
