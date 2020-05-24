package _04_hospital;

public class Patient{
boolean pulseChecked=false;
	public Object feelsCaredFor() {
		if(pulseChecked==true) {
			return true;
		}
		else {
		return false;
		}
	}
	public void checkPulse() {
		pulseChecked=true;
	}
}
