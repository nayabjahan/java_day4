public class AddPartTime {
    public static void main(String[] args) {
        int Is_present = 1;
        int Wage_Per_Hr = 20;
        int Full_Day_hr = 8;
        int employHr = 0;
        int Part_Time_Hr = 8;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_present) {
            Full_Day_hr = 8;
            System.out.println("Employ is present");
            int Employ_Daily_Wage = Wage_Per_Hr * Full_Day_hr + Part_Time_Hr * Wage_Per_Hr;
            System.out.println("daily wage of employ is " + Employ_Daily_Wage);

        } else {
            employHr = 0;
            System.out.println("Employ is absent");
        }
    }
}
