
package $witch;

public class Switch1 {
    private  final String name;
    private  boolean state ;
 
    public Switch1(String name){
        this.name = name ;
        this.state = false ;
        
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

    @Override
    public String toString() {
        return "Switch1{" + "name=" + name + ", state=" + state + '}';
    }

   
        
        }


        
           
       
        
    

  
    
    

