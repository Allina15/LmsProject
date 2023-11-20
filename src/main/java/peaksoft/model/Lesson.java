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
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lesson_gen")
    @SequenceGenerator(name = "lesson_gen",
            sequenceName = "lesson_seq",
            allocationSize = 1)
    private long id;
    private String name;
    @Column(length = 200000)
    private String image;
    @ManyToOne
    private Course course;
    @OneToMany
    private List<Task>tasks;

    public Lesson(String name, String image) {
        this.name = name;
        this.image = image;
    }
}
