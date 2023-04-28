/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelanjutan;

/**
 *
 * @author acer
 */
public class MyClass implements MyInterface1, MyInterface2 {
    @Override
    public void myMethod1(){
        System.out.println("Hello World");
    }

    @Override
    public void mymethod2() {
        System.out.println("hello java");
    }

    @Override
    public void myMethod3() {
        System.out.println("hallo indonesia");
    }
}
