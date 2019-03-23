package by.vasili.khalko.toss.model;

import java.time.LocalDate;

public abstract class AbstractPerson extends AbstractBaseEntity {

    private String firstName;

    private String secondName;

    private String middleName;

    private Enum gender;

    private LocalDate birthday;

    AbstractPerson(String firstName, String secondName, String middleName, Enum gender, LocalDate birthday) {
       this(null, firstName, secondName, middleName, gender,birthday);
    }

    AbstractPerson(Integer id, String firstName, String secondName, String middleName, Enum gender, LocalDate birthday) {
        super(id);
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthday = birthday;
    }

    public AbstractPerson() {

    }
}
