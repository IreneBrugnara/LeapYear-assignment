package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) {

    }


    public Boolean isLeap(int year) {
        if(year%4 != 0)
            return false;
        else {
            if(year%100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
    }
}
