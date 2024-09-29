package day3_variables_and_datatypes.reference;

public class Developer implements EmployeeReference{
    @Override
    public void work() {
        System.out.println("Developer is writing a code");
    }

    @Override
    public void takeBreak() {
        System.out.println("Developer is having his coffee break");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending a DSM meeting");
    }
}
