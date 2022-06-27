public class IsEmployPresent {
    public static void main(String[] args){
        int Is_present = 1;
        double empCheck = Math.floor(Math.random() *10) %2;
        if(empCheck==Is_present)
        {
            System.out.println("Employ is present");
        }
        else{
            System.out.println("Employ is absent");
        }
    }

}
