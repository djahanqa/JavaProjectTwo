package basic;

public class IfElseStatementThree {
    public static void main(String[]args){
    int glasses=600;
    int sunglasses=400;
    int lipstics= 100;
    if(sunglasses==glasses) {
        System.out.println(lipstics);
    }else if(lipstics>glasses) {
        System.out.println(sunglasses);
    }else if(glasses<lipstics+sunglasses) {
        System.out.println(glasses);
    }else{
        System.out.println("nothing");
    }

    }
}



