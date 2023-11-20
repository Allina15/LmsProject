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
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_gen")
    @SequenceGenerator(name = "group_gen",
            sequenceName = "group_seq",
            allocationSize = 1)
    private long id;
    private String groupName;
    private String dateOfStart;
    @Column(length = 200000)
    private String image;
    @ManyToMany
    private List<Course>courses;
    @OneToMany
    private List<Student>students;

    public Group(String groupName, String dateOfStart, String image) {
        this.groupName = groupName;
        this.dateOfStart = dateOfStart;
        this.image = image;
    }
}
