package by.vasili.khalko.toss.model;

import java.time.LocalDate;

public class Sportsman extends AbstractPerson {

    private int weight;

    private String qualification;

    private int rating;

    public Sportsman(String firstName, String secondName, String middleName, Enum gender, LocalDate birthday, int weight, String qualification, int rating) {
        this(null,firstName, secondName, middleName, gender, birthday, weight, qualification, rating);
    }

    public Sportsman(Integer id, String firstName, String secondName, String middleName, Enum gender, LocalDate birthday, int weight, String qualification, int rating) {
        super(id, firstName, secondName, middleName, gender, birthday);
        this.weight = weight;
        this.qualification = qualification;
        this.rating = rating;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
