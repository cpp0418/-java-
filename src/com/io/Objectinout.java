package com.io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objectinout {

	public static void main(String[] args) throws Exception {
	ObjectOutputStream  out=new	ObjectOutputStream(new FileOutputStream("d:\\obj.txt"));
	Person p1=new Person("mlike", 40);
	out.writeObject(p1);
	
	ObjectInputStream  inee=new	ObjectInputStream(new FileInputStream("d:\\obj.txt"));
	Person person= (Person) inee.readObject();
	System.out.println("name="+person.getName());
	System.out.println("age="+person.getAge());
	}

}
