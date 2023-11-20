package peaksoft.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_gen")
    @SequenceGenerator(name = "course_gen",
            sequenceName = "course_seq",
            allocationSize = 1)
    private long id;
    private String courseName;
    private int duration;
    private String description;
    @Column(length = 200000)
    private String image;
    @ManyToOne
    private Company company;
    @ManyToMany(mappedBy = "courses")
    private List<Group>groups;
    @OneToMany
    private List<Instructor>instructors;
    @OneToMany(mappedBy = "course")
    private List<Lesson>lessons;

    public Course(String courseName, int duration, String description, String image) {
        this.courseName = courseName;
        this.duration = duration;
        this.description = description;
        this.image = image;
    }
}
