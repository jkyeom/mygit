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
	/**
	* 원격 저장소에서 수정된 내용
	*/
	public void hello(){
		System.out.println("저를 fetch해주세요");	
	}
	/**
	* 원격 저장소에서 수정된 내용
	*/
	public void world(){
		System.out.println("저를 pull해주세요");	
	}

}
