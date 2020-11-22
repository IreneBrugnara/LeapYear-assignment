package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String[] args) {

    }


    public Boolean isLeap(int year) {
        if(year%4 != 0)
            return false;
        else if(year%4 != 100 && year%4 != 400)
            return true;
        else
            return null;
    }
}
