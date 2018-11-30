package sample;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Generator {
    private static final int STUDENT_MIN_AGE = 18;
    private static final int FIRST_CATEGORY_MAX_AGE = 22;
    private static final int GRAD_MIN_AGE = 21;
    private static final int PROFESSOR_MIN_AGE = 30;
    public static void main(String[] unused) {
        int numberOfStudents = 0;
        int numberOfGrads = 0;
        int numberOfProfessors = 0;
        Scanner scanner = new Scanner(System.in);
        //Training
        System.out.println("Enter number of students");
        while (true) {
            numberOfStudents = scanner.nextInt();
            if (numberOfStudents >= 0) {
                break;
            } else {
                System.out.println("there must be at least 0 students;");
            }
        }
        System.out.println("Enter number of grad students");
        while (true) {
            numberOfGrads = scanner.nextInt();
            if (numberOfGrads >= 0) {
                break;
            } else {
                System.out.println("there must be at least 0 grad students;");
            }
        }
        System.out.println("Enter number of professors");
        while (true) {
            numberOfProfessors = scanner.nextInt();
            if (numberOfProfessors >= 0) {
                break;
            } else {
                System.out.println("there must be at least 0 professors;");
            }
        }
        List<Person> inputs = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfStudents ; i++) {
            String setDegree = null;
            if (random.nextInt(10) < 9) {
                setDegree = "none";
            } else {
                setDegree = "bachelor";
            }
            inputs.add(new Undergrad(STUDENT_MIN_AGE + random.nextInt(4), setDegree));
        }
        for (int i = 0; i < numberOfGrads ; i++) {
            String setDegree = null;
            if (random.nextInt(4) < 3) {
                setDegree = "bachelor";
            } else {
                setDegree = "master";
            }
            inputs.add(new Grads(GRAD_MIN_AGE + random.nextInt(7), setDegree));
        }
        for (int i = 0; i < numberOfProfessors ; i++) {
            String setDegree = null;
            if (random.nextInt(5) < 4) {
                setDegree = "PhD";
            } else {
                setDegree = "master";
            }
            inputs.add(new Professor(PROFESSOR_MIN_AGE
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5)
                    + random.nextInt(5), setDegree));
        }
        double noPeople = inputs.size();
        Undergrad.setProportion((double) numberOfStudents / noPeople);
        Grads.setProportion((double) numberOfGrads / noPeople);
        Professor.setProportion((double) numberOfProfessors / noPeople);
        double noStudentsBelow22 = 0;
        double noStudents23to29 = 0;
        double noStudents30plus = 0;
        double noStudentsNoDegree = 0;
        double noStudentsBachelor = 0;
        double noStudentsMaster = 0;
        double noStudentsPhd = 0;
        double noGradsBelow22 = 0;
        double noGrads23to29 = 0;
        double noGrads30plus = 0;
        double noGradsNoDegree = 0;
        double noGradsBachelor = 0;
        double noGradsMaster = 0;
        double noGradsPhd = 0;
        double noProfessorsBelow22 = 0;
        double noProfessors23to29 = 0;
        double noProfessors30plus = 0;
        double noProfessorsNoDegree = 0;
        double noProfessorsBachelor = 0;
        double noProfessorsMaster = 0;
        double noProfessorsPhd = 0;

        for (int i = 0; i < noPeople; i++) {
            if (inputs.get(i) instanceof Undergrad) {
                if (inputs.get(i).getAge() <= FIRST_CATEGORY_MAX_AGE) {
                    noStudentsBelow22++;
                } else if (inputs.get(i).getAge() < PROFESSOR_MIN_AGE) {
                    noStudents23to29++;
                } else {
                    noStudents30plus++;
                }
            }
        }
    }
}
