package Models;

import java.util.Date;

public class Student extends Person {
    private String schoolName;
    private int startYear;
    private Double avgScore;

    public Student(String name, Date birthDate, String address, Double height, Double weight, String schoolName, int startYear, Double avgScore) {
        super(name, birthDate, address, height, weight);
        this.startYear = startYear;
        this.schoolName = schoolName;
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return super.toString() + "schoolName='" + schoolName + '\'' +
                ", startYear=" + startYear +
                ", avgScore=" + avgScore +
                '}';
    }
}
