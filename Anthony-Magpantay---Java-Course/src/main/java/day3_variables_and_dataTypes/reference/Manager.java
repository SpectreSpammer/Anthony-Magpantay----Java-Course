package day3_variables_and_dataTypes.reference;

public class Manager implements Employee{


    @Override
    public void work() {
        System.out.println("Manager is overseeing the projects..");
    }

    @Override
    public void lunch() {
        System.out.println("Manager is having his lunch in Max.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is facilitating the meeting");
    }
}
