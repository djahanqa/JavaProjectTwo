package basic;
//nested if else practice

public class PracticeNested1 {
    public static void main(String[]args){
        int dollhouse=12;
        int playhouse=11;
        if(dollhouse>playhouse){
            if(playhouse<dollhouse);
            System.out.println("i will buy a playhouse");
            if(playhouse==dollhouse);
            System.out.println("i will not buy a dollhouse");
            if(playhouse>dollhouse);
            System.out.println("i might not buy either one");
        }else{
            System.out.println("i will buy the cheaper one");
        }
    }
}
