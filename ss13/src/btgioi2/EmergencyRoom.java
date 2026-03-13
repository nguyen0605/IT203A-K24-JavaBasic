package btgioi2;

import java.util.LinkedList;

public class EmergencyRoom{
    private LinkedList<Patient> patients = new LinkedList<>();

    public void patientCheckIn(String name){
        patients.addLast(new Patient(name, false));
        System.out.println("Đã thêm vào hàng đợi khám");
    }

    public void emergencyCheckIn(String name){
        patients.addFirst(new Patient(name, true));
        System.out.println("Ca cấp cứu " + name + " được ưu tiên");
    }

    public void treatPatient(){
        if (patients.isEmpty()){
            System.out.println("Không còn bệnh nhân!");
            return;
        }

        Patient p = patients.removeFirst();

        if (p.emergency){
            System.out.println("Đang cấp cứu " + p.name);
        } else {
            System.out.println("Đang khám " + p.name);
        }
    }
}
