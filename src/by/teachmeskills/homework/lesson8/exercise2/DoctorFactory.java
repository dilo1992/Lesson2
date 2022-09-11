package by.teachmeskills.homework.lesson8.exercise2;

public class DoctorFactory {
    public static Doctor getDoctorByMedicalPlan(MedicalPlan medicalPlan) {
        if (medicalPlan.getCode()==2) {
            return new Dentist();
        }
        if (medicalPlan.getCode() > 2) {
            return new Terapevt();
        } else return new Surgeon();
    }
}
