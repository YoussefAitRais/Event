package org.event.event.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String location;

    private LocalDate date;

    private String category;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Reservation> reservations;
}
