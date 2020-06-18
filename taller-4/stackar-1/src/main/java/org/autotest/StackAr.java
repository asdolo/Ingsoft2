package org.autotest;

public class StackAr {
	public int triangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return 4; // invalid
		}
		if (!(a + b > c && a + c > b && b + c > a)) {
			return 4; // invalid
		}
		if (a == b && b == c) {
			return 1; // equilateral
		}
		if (a == b || b == c || a == c) {
			return 2; // isosceles
		}
		return 3; // scalene
	}
}
