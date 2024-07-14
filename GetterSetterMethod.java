import java.util.Scanner;

class Patient {
    private int id;
    private String name;
    private String doctor;
    private int age;
    private String address;
    private long contact;
    private String bloodgroup;
    private String gender;
    private String symptoms;
    private String visitingdate;
    private String medicine;

    Patient(int id, String name, String doctor, int age, String address, long contact, String bloodgroup, String gender, String symptoms, String visitingdate, String medicine) {
        this.id = id;
        this.name = name;
        this.doctor = doctor;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.bloodgroup = bloodgroup;
        this.gender = gender;
        this.symptoms = symptoms;
        this.visitingdate = visitingdate;
        this.medicine = medicine;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVisitingDate() {
        return visitingdate;
    }

    public void setVisitingDate(String visitingdate) {
        this.visitingdate = visitingdate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
}

class Hospital {
    private Patient obj;

    public void addPatient(int id, String name, String doctor, int age, String address, long contact, String bloodgroup, String gender, String symptoms, String visitingdate, String medicine) {
        if (obj == null) {
            obj = new Patient(id, name, doctor, age, address, contact, bloodgroup, gender, symptoms, visitingdate, medicine);
            System.out.println("Patient Added Successfully");
        } else {
            System.out.println("Patient Data Already Exists");
        }
    }

    public void removePatient() {
        if (obj != null) {
            obj = null;
            System.out.println("Patient Removed Successfully");
        } else {
            System.out.println("Add Patient First");
        }
    }

    public void displayPatient() {
        if (obj != null) {
            System.out.println("*********************** PATIENT DETAILS *********************");
            System.out.println("Patient ID: " + obj.getId());
            System.out.println("Patient Name: " + obj.getName());
            System.out.println("Doctor: " + obj.getDoctor());
            System.out.println("Age: " + obj.getAge());
            System.out.println("Contact: " + obj.getContact());
            System.out.println("Blood Group: " + obj.getBloodgroup());
            System.out.println("Gender: " + obj.getGender());
            System.out.println("Symptoms: " + obj.getSymptoms());
            System.out.println("Visiting Date: " + obj.getVisitingDate());
            System.out.println("Medicine: " + obj.getMedicine());
        } else {
            System.out.println("No Data Found");
        }
    }

    public void updatePatient() {
        if (obj == null) {
            System.out.println("No Patient Data Found to Update");
            return;
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("******************* Update Patient Details *******************");
            System.out.println("1. Update Name");
            System.out.println("2. Update Doctor");
            System.out.println("3. Update Age");
            System.out.println("4. Update Address");
            System.out.println("5. Update Contact");
            System.out.println("6. Update Blood Group");
            System.out.println("7. Update Gender");
            System.out.println("8. Update Symptoms");
            System.out.println("9. Update Visiting Date");
            System.out.println("10. Update Medicine");
            System.out.println("11. Exit Update Menu");
            System.out.println("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter new name: ");
                    String name = sc.nextLine();
                    obj.setName(name);
                    System.out.println("Name updated successfully.");
                    break;
                case 2:
                    System.out.println("Enter new doctor: ");
                    String doctor = sc.nextLine();
                    obj.setDoctor(doctor);
                    System.out.println("Doctor updated successfully.");
                    break;
                case 3:
                    System.out.println("Enter new age: ");
                    int age = sc.nextInt();
                    obj.setAge(age);
                    System.out.println("Age updated successfully.");
                    break;
                case 4:
                    System.out.println("Enter new address: ");
                    String address = sc.nextLine();
                    obj.setAddress(address);
                    System.out.println("Address updated successfully.");
                    break;
                case 5:
                    System.out.println("Enter new contact number: ");
                    long contact = sc.nextLong();
                    obj.setContact(contact);
                    System.out.println("Contact updated successfully.");
                    break;
                case 6:
                    System.out.println("Enter new blood group: ");
                    String bloodgroup = sc.nextLine();
                    obj.setBloodgroup(bloodgroup);
                    System.out.println("Blood Group updated successfully.");
                    break;
                case 7:
                    System.out.println("Enter new gender: ");
                    String gender = sc.nextLine();
                    obj.setGender(gender);
                    System.out.println("Gender updated successfully.");
                    break;
                case 8:
                    System.out.println("Enter new symptoms: ");
                    String symptoms = sc.nextLine();
                    obj.setSymptoms(symptoms);
                    System.out.println("Symptoms updated successfully.");
                    break;
                case 9:
                    System.out.println("Enter new visiting date: ");
                    String visitingdate = sc.nextLine();
                    obj.setVisitingDate(visitingdate);
                    System.out.println("Visiting Date updated successfully.");
                    break;
                case 10:
                    System.out.println("Enter new medicine: ");
                    String medicine = sc.nextLine();
                    obj.setMedicine(medicine);
                    System.out.println("Medicine updated successfully.");
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class GetterSetterMethod {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("***************** Welcome *******************");
            System.out.println("1. Add Patient");
            System.out.println("2. Remove Patient");
            System.out.println("3. Update Details");
            System.out.println("4. Display Patient");
            System.out.println("5. Exit");
            System.out.println("Enter An Option");

            int opt = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (opt) {
                case 1:
                    hospital.addPatient(1, "Abhishekh", "Dr.Zavare", 21, "Satara", 9874563210L, "A+", "Male", "Fever", "06/07/2024", "Dolo 100");
                    break;
                case 2:
                    hospital.removePatient();
                    break;
                case 3:
                    hospital.updatePatient();
                    break;
                case 4:
                    hospital.displayPatient();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("*********** Wrong Input ********");
                    break;
            }
        }
    }
}
