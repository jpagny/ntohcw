package com.jpagny.ntohcw.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "hack_challenge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HackChallengeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private SiteEntity site;

    @ManyToOne(cascade = CascadeType.ALL)
    private LevelEntity level;

    @ManyToOne(cascade = CascadeType.ALL)
    private CategoryEntity category;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hackChallenge")
    private Set<PartyEntity> parties;



}
