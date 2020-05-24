package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
//ArrayList <Hospital> hospitalList=new ArrayList<Hospital>();
ArrayList <Doctor> doctor=new ArrayList<Doctor>();
ArrayList <Patient> patient=new ArrayList<Patient>();
	public void addDoctor(GeneralPractitioner generalPractitioner) {
	doctor.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
	doctor.add(surgeon);
	}

	public void addPatient(Patient patient) {
	this.patient.add(patient);
	}

	public List<Doctor> getDoctors() {
		return doctor;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patient;
	}

}
