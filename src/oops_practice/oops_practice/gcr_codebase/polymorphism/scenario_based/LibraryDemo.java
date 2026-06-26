package oops_practice.oops_practice.gcr_codebase.polymorphism.scenario_based;

class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println("Name : " + memberName);
        System.out.println("ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Aman", "S101"),
                new FacultyMember("Dr. Sharma", "F201"),
                new GuestMember("Rahul", "G301")
        };

        int overdueDays = 4;

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine = " + m.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "F201";

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("Member Found:");
                m.printDetails();
            }
        }
    }
}