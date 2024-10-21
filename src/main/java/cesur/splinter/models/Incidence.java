package cesur.splinter.models;

import java.time.LocalDateTime;

import cesur.splinter.models.utils.enums.Priorities;
import cesur.splinter.models.utils.enums.Scopes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incidence")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Incidence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String category; //Category class

    @Column
    private String description; 

    @Column
    @Enumerated(EnumType.STRING)
    private Priorities priority; //Priority class

    @Column
    @Enumerated(EnumType.STRING)
    private Scopes scope; //Scope class

    @Column
    private LocalDateTime createdAt;

    @Column(nullable = true)    
    private LocalDateTime updateAt;

    @Column(name = "deletedAt", nullable = true)
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;

  
}
