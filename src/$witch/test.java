/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package $witch;

/**
 *
 * @author ASUS
 */
public class test {
    public static void main(String[] args) {
        Switch1 s = new Switch1 ("RadioNoOff");
        System.out.println(s);  
        s.toggle();
        System.out.println(s);  
       s.turnOff();
       System.out.println(s);
       s.turnOn();
       System.out.println(s);
         s.isOn();
        System.out.println(s);
       System.out.println("is on ?:"+s.toString());
        
    }
}
