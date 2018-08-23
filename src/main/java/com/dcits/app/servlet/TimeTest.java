package com.dcits.app.servlet;

import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;

public class TimeTest {
	public static void main(String[] args) {
		/*Timer timer = new Timer();
		timer.schedule(new MyTask(),1000,2000);*/
		int[] a = {10, 2, 7, 5, 68, 8675, 8};

		int max = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int c = 0; c < a.length -1 - i; c++) {
				if (a[c] > a[c + 1]) {
					max = a[c];
					a[c] = a[c + 1];
					a[c + 1] = max;
				}
			}
		}
		for (int d = 0; d < a.length; d++) {
			System.out.println(a[d]);
		}
	}
}
