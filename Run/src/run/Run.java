/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package run;

/**
 *
 * @author Rigo
 */
public class Run {
    public static void main(String[] args) {
        Doctor doctorObj = new Doctor();
	// treatPatient method in class Doctor will be executed
    doctorObj.treatPatient();
   
    Surgeon surgeonObj = new Surgeon();
    // treatPatient  method in class Surgeon  will be executed
    surgeonObj.treatPatient();
  }
}
