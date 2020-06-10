package com.capgemini.rtp.practice;

public class Cat extends Animal {
		void run() {
			System.out.println("overrided method");
		}

		public static void main(String[] args) {
			Animal a = new Cat();
			a.run();
		}

	}

