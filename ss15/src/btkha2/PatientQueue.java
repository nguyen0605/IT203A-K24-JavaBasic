package btkha2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient p){
        queue.add(p);
    }

    public Patient callNextPatient(){
        return queue.poll();
    }

    public Patient peekNextPatient(){
        return queue.peek();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayQueue(){
        for (Patient p : queue){
            System.out.println(p);
        }
    }
}
