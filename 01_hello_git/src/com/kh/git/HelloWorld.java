package com.kh.git;

import com.kh.animal.Cat;
import com.kh.animal.Dog;
import com.kh.foo.Foo;

/**
 * 
 * push 관련 주석 추가
 *
 */

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello World~");
		System.out.println("Hello git~");
		System.out.println("Good luck~");
		
		new Foo().sayFoo();
		new Foo().sayFoo();
		System.out.println("Lucky you~"); // #master에서 추가
		new Cat().say();
		new Dog().say();
	}

}
