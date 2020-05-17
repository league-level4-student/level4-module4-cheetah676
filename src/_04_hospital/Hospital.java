package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList <Hospital> hospitalList=new ArrayList<Hospital>();
ArrayList <Doctor> doctor=new ArrayList<Doctor>();
	public void addDoctor(GeneralPractitioner generalPractitioner) {
	hospitalList.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
	hospitalList.add(surgeon);
	}

	public void addPatient(Patient patient) {
	hospitalList.add(patient);
	}

	public List<Doctor> getDoctors() {
		return doctor;
	}

}
