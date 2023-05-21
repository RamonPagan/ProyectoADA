package com.ramon.rest_api_rpg.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "observatory")
public class Observatory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "observatory_name", nullable = false)
    private String observatoryName;

    @Column(name = "observatory_country")
    private String observatoryCountry;

    @Column(name = "observatory_date_inauguration")
    private Date observatoryDateInauguration;

    @JsonIgnore
    @OneToMany(mappedBy = "observatory")
    private List<Discovery> discoveries;

}
