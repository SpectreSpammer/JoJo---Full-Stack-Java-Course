package day3_variables_and_datatypes.reference;

public class MainReference {
    public static void main(String[] args) {
        EmployeeReference manager = new Manager();
        EmployeeReference developer = new Developer();
        EmployeeReference designer = new Designer();

        //arrays
        EmployeeReference[] employees = { manager, developer, designer};

        //foreach loop for employees
        for(EmployeeReference employeeReference : employees ){
            employeeReference.work();
            employeeReference.takeBreak();
            employeeReference.attendMeeting();
            System.out.println();
        }

    }
}
