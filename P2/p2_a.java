
/*
 * Superclass --> Staff (Staffid , name , phone , salary)
 * Subclass --> 1. Teaching(domain , publications)
 * 2. Technical(skills)
 * 3. Contract( period )
 * 
 */
import java.util.*;

class Staff {
    String StaffId, Name, Phone;
    int Salary;

    Staff(String sid, String nm, String phn, int slry) {
        StaffId = sid;
        Name = nm;
        Phone = phn;
        Phone = phn;
        Salary = slry;
    }

    public void display() {
        System.out.println(StaffId + "\t\t" + Name + "\t\t" + Phone + "\t\t" + Salary + "\t\t");
    }
}

class Teaching extends Staff {
    String domain, publication;

    Teaching(String sid, String nm, String phn, int slry, String dm, String pub) {
        super(sid, nm, phn, slry);
        domain = dm;
        publication = pub;

    }

    

}

public class p2_a {
    public static void main(String[] args) {
        ;
    }

}














