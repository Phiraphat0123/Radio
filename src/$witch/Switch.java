
package $witch;

public class Switch {
 public String switc = null;
 public  boolean isOn ;
 
    public String Switch(String name) {
        return switc;
    }
    
    public boolean isOn(){
        
        return isOn;
       }    
    public void turnOn(){
        System.out.println("on");
    }
    
    public void turnOff(){
        System.out.println("off");
    }
    
    public void toggle(){
        if(isOn = true){
            this.isOn = false;
        }else{
            this.isOn = true ;
        }
        
        
        }

    @Override
    public String toString() {
        return "Switch{" + "switc=" + switc + ", isOn=" + isOn + '}';
    }
    }
        
           
       
        
    

  
    
    

