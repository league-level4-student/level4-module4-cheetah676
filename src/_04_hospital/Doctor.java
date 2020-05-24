package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor{
	ArrayList <Patient> patientList=new ArrayList<Patient>();
	public Object performsSurgery() {
		return false;
	}

	public Object makesHouseCalls() {
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if(patientList.size()>2) {
			throw new DoctorFullException();
		}
		patientList.add(patient);
		
	}

	public void doMedicine() {
for(int i=0; i<patientList.size(); i++) {
 patientList.get(i).checkPulse();
}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

}
