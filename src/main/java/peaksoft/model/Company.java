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
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_gen")
    @SequenceGenerator(name = "company_gen",
            sequenceName = "company_seq",
            allocationSize = 1)
    private long id;
    private String companyName;
    private String locatedCountry;
    @Column(length = 200000)
    private String image;
    @OneToMany(mappedBy = "company")
    private List<Course> courses;

    public Company(String companyName, String locatedCountry, String image) {
        this.companyName = companyName;
        this.locatedCountry = locatedCountry;
        this.image = image;
    }
}
