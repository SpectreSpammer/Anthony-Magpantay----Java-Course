package day9_exceptions.unchecked;

public class MainUncheckedException {
    public static void main(String[] args) {

        try{
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Null Pointer:" + e.getMessage());
        }

        System.out.println();
        try{
            int [] age = new int[5];
            System.out.println(age[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds: " + e.getMessage());
        }


    }
}
