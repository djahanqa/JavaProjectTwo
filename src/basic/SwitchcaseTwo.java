package basic;

public class SwitchcaseTwo {
    public static void main(String[]args){

        int thomasTrain=2000;
        switch (thomasTrain){
            case 500:
                System.out.println("thomasTrain is less than 500");
                break;
            case 1000:
                System.out.println("thomasTrain in equal to 1000");
                break;
            case 1999:
                System.out.println("thomasTrain more than  1999");
            break;
            default:
                System.out.println("i will not buy it");


        }
    }
}
