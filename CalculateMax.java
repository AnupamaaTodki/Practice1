package com.practice.demo;

import org.junit.Test;

import junit.framework.Assert;

public class CalculateMax {

	public static int CheckMax(int[] arr) {
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	}

	public static int cube(int n) {
		int result = n * n * n;
		return result;
	}

	@Test
	public void CheckTest() {
		Assert.assertEquals(88, CheckMax(new int[] { 2, 3, 67, 88 }));
		Assert.assertEquals(27, cube(3));
	}

}
