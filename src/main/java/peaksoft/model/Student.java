package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.enums.studyFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_gen",
            sequenceName = "student_seq",
            allocationSize = 1)
    private long id;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String email;
    private studyFormat studyFormat;
    @ManyToOne
    private Group group;

    public Student(String firstName, String lastName, int phoneNumber, String email, peaksoft.enums.studyFormat studyFormat) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studyFormat = studyFormat;
    }
}
