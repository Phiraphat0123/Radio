package slider;

public class Radio {
	private final String name;
	private final double min;
	private double stepSize = 1;
	private final double maxstep;
	private final boolean circle;
	double currentStep;
	
	
	
	
 public Radio(String name , double min,double stepSize,int maxstep,boolean circle) {
	 this.name = name ;
	 this.min = min;
	 this.stepSize = stepSize;
	 this.maxstep = maxstep;
	 this.circle = circle;
	
 }
 public Radio up(){
	 currentStep++;

	 //if (currentStep > maxStep) currentStep = circular ? 0 : maxStep;

	 if (currentStep > maxstep) {

	 if (circle==true) {

	 currentStep = 0;

	 } else {

	 currentStep = maxstep;
		}
	}
	 return this;
 }
 
 public Radio down() {
	 currentStep--;

	 //if (currentStep < 0) currentStep = circular ? maxStep : 0;

	 if (currentStep < 0) {

	 if (circle==true) {

	 currentStep = maxstep;

	 } else {

	 currentStep = 0;
			}
	 }return this;
 }
 public double getValue() {
	return min+currentStep * stepSize;
 }
 @Override
public String toString() {
	return name + "(" + getValue() + ")";
}
 
}
