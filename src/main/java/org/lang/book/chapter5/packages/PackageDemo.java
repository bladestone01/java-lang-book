package org.lang.book.chapter5.packages;

import org.lang.book.chapter5.superdemo.Animal;
import org.lang.book.chapter5.superdemo.Mammal;

import static java.lang.Math.abs;;

/**
 * Package Demo.
 * 
 * @author tonychen
 *
 */
public class PackageDemo {
    public PackageDemo() {}
    
	public static void main(String[] args) {
        Animal animal = new Mammal("My Mammal");
        animal.sayHello();
        
        System.out.println("absolute number:" + abs(-0.23));
	}

}
