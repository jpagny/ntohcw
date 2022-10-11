package com.jpagny.ntohcw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "party")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_at")
    private LocalDate startDate;

    @Column(name = "last_modified_at")
    @LastModifiedBy
    private LocalDate lastModifiedDate;

    @Column(name = "end_at")
    private LocalDate endDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private HackChallengeEntity hackChallenge;

    @ManyToOne(cascade = CascadeType.ALL)
    private StatusEntity status;






}
