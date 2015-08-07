package com.lh.java8Base;

public class ThreadTest$cc {

	int mutex = 100;
	boolean isRun = true;

	int i = 0;

	public static void main(String[] args) {

		Monkey m = new ThreadTest$cc().new Monkey();
		new Thread(m, "1").start();
		new Thread(m, "2").start();
		new Thread(m, "3").start();
	}

	class Monkey implements Runnable {

		@Override
		public void run() {

			getTao();

		}

		public void getTao() {

			while (isRun) {

				if (mutex % 2 == 0 && mutex != 0) {
					i = mutex;
					mutex = mutex / 2;
					System.out.println(Thread.currentThread().getName() + "   de"
							+ mutex);
					mutex = i - mutex;
				} else if (mutex % 2 != 0) {
					i = mutex;
					mutex = mutex / 2 + 1;
					System.out.println(Thread.currentThread().getName() + "   de"
							+ mutex);
					mutex = i - mutex;
				} else if (mutex == 0) {

					isRun = false;

				}
			}
		}
	}

}
