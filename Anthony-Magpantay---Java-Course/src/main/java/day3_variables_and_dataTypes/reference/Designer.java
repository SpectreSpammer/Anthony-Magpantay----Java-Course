package day3_variables_and_dataTypes.reference;

public class Designer implements Employee{


    @Override
    public void work() {
        System.out.println("Designer is creating a UI design..");
    }

    @Override
    public void lunch() {
        System.out.println("Designer is having his short walk.");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting the design");
    }
}
