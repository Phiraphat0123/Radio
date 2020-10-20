
package $witch;


public class Switch2 {
    public final String name;
    public boolean state ;
   public Switch2 (String name){
    this.name = name;
    this.state=true;
   }
   public boolean isOn(){
      return state;
   }
   public void turnOn(){
       state = true;
   }
   public void turnOff(){
       state = false;
   }
   public void toggle(){
       state =! state;
   }
   @Override //เป็นการตั้งให้เป็น method หลักในการแสดงผลของ class
   public String toString(){
   return "switch+"+"{name:"+name+' '+"state:"+state+'}';
   }
   
}
