package day5_controlFlow.loopSStatement;

public class MainDoWhile {
    public static void main(String[] args) {

        int trainingModule = 6;

        System.out.println("Training modules: ");
        do {
            trainingModule++;
            System.out.println("Completed Module: " + trainingModule);
        }while(trainingModule < 5);

        System.out.println("All training modules has been completed");
    }
}
