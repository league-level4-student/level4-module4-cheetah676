package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	public int getItemsReceived(){
		return itemsReceived;
	}
	public int setItemsRecievedNegative(int item) {
		if(item<0) {
			item=0;
		}
		itemsReceived=item;
		return item;
	}
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	public float getDegreesTurned() {
		return degreesTurned;
	}
	public float setDegreesTurned(float degrees) {
		if(degrees<0.0) {
			degrees=0;
		}
		else if(degrees>360.0) {
			degrees=360;
		}
		degreesTurned=degrees;
		return degrees;
	}
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	public String getNomenclature() {
		return nomenclature;
	}
	public String setNomenclatureIfBlank(String name) {
		if(name=="") {
			name=" ";
		}
		nomenclature=name;
		return name;
	}
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	public Object getMemberObj() {
		return memberObj;
	}
	public Object setMemberObj(Object obj) {
		if(obj instanceof String) {
			obj=new Object();
		}
		memberObj=obj;
		return obj;
	}
	public static void main(String[] args) {
		EncapsulateTheData etd=new EncapsulateTheData();
		etd.setItemsRecievedNegative(5);
		assertTrue(5==etd.getItemsReceived());
		assertTrue(0==etd.setItemsRecievedNegative(-6));
		etd.setDegreesTurned(60);
		assertTrue(60==etd.getDegreesTurned());
		assertTrue(0==etd.setDegreesTurned(-5));
		assertTrue(360==etd.setDegreesTurned(361));
		etd.setNomenclatureIfBlank("Dog");
		assertTrue("Dog"==etd.getNomenclature());
		assertTrue(" "==etd.setNomenclatureIfBlank(""));
		etd.setMemberObj(new Object());
		System.out.println(etd.getMemberObj());
		assertTrue("java.lang.Object@60e53b93"==etd.getMemberObj());
	}
}
