class MedicalStaff {
  String name;

  MedicalStaff(String name) {
    this.name = name;
  }

  void performDuty() {
    System.out.println(name + " is on duty.");
  }

  void accessIDCard() {
    System.out.println(name + " accessed ID card.");
  }

  void processPayroll() {
    System.out.println(name + " payroll processed.");
  }
}

class Doctor extends MedicalStaff {
  Doctor(String name) {
    super(name);
  }

  void performDuty() {
    System.out.println(name + " (Doctor) diagnosing and performing surgery.");
  }
}

class Nurse extends MedicalStaff {
  Nurse(String name) {
    super(name);
  }

  void performDuty() {
    System.out.println(name + " (Nurse) administering medicine and monitoring patients.");
  }
}

class Technician extends MedicalStaff {
  Technician(String name) {
    super(name);
  }

  void performDuty() {
    System.out.println(name + " (Technician) operating equipment and running tests.");
  }
}

class Administrator extends MedicalStaff {
  Administrator(String name) {
    super(name);
  }

  void performDuty() {
    System.out.println(name + " (Administrator) scheduling appointments and managing records.");
  }
}

public class HospitalManagement {
  public static void main(String[] args) {
    MedicalStaff[] staff = {
        new Doctor("Dr. Alice"),
        new Nurse("Nurse Bob"),
        new Technician("Tech Carol"),
        new Administrator("Admin Dave")
    };

    for (MedicalStaff m : staff) {
      m.performDuty(); // Upcasting in action
      m.accessIDCard();
      m.processPayroll();
      System.out.println();
    }
  }
}
