package day3_variables_and_dataTypes.reference;

public class Developer implements Employee{


    @Override
    public void work() {
        System.out.println("Developer is writing some codes.");
    }

    @Override
    public void lunch() {
        System.out.println("Developer is having his coffee.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer is attending the meeting");
    }
}
