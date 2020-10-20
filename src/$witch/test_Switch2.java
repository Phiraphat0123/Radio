
package $witch;


public class test_Switch2 {
    
    public static void main(String[] args) {
        
        Switch2 s = new Switch2("radiotesting");
        System.out.println(s);
        s.toggle(); //หมายความว่าเป็นการนำค่าการทำงานของ method toggle() มาแทนค่าลงใน object ที่ชื่อว่า Switch2
        System.out.println(s);
        s.isOn();
        System.out.println(s);
        System.out.println(s.toString());
    }
}
