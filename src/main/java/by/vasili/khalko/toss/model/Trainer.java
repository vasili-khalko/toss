package by.vasili.khalko.toss.model;

import java.time.LocalDate;

public class Trainer extends AbstractPerson {

    private String phoneNumber;

    public Trainer(String firstName, String secondName, String middleName, Enum gender, LocalDate birthday, String phoneNumber) {
        super(firstName, secondName, middleName, gender, birthday);
        this.phoneNumber = phoneNumber;
    }

    public Trainer(Integer id, String firstName, String secondName, String middleName, Enum gender, LocalDate birthday, String phoneNumber) {
        super(id, firstName, secondName, middleName, gender, birthday);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
