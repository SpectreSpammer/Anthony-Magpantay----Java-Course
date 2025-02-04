package day5_controlFlow.loopSStatement;

public class MainWhile {
    public static void main(String[] args) {


        int yearsOfService = 3;
        int performanceRating = 8;
        boolean isPromotionEligible = false;


        while(!isPromotionEligible){
            if(yearsOfService >= 10 || (yearsOfService >=5 && performanceRating >=6 )){
                isPromotionEligible = true;
                System.out.println("Employee is now eligible for promotion");
            }else {
                yearsOfService++;
                System.out.println("Years of Service: " + yearsOfService);

            }
        }
    }
}
