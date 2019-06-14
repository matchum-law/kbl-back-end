package com.vjerksen.springwebservice.domain.posts;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "KBL_PLAYER", schema = "hackerton_project")
public class KblPlayer {
    @Id
    private Long id;

    @Column
    private Long p_uni_num; // 1

    @Column(length = 500)
    private String p_name;  // 2

    @Column(length = 500)
    private String p_team;  // 16

    @Column
    private Long p_game;  // 3

    @Column
    private String p_time;  // 4

    @Column
    private Long p_2p;  // 5

    @Column
    private Long p_2pa;  // 6

    @Column
    private Double p_2p_pct;  // 7

    @Column
    private Long p_3p;  // 8

    @Column
    private Long p_3pa;  // 9

    @Column
    private Double p_3p_pct;  // 10

    @Column
    private Double p_fg_pct;  // 11

    @Column
    private Long p_ft;  // 12

    @Column
    private Long p_fta;  // 13

    @Column
    private Double p_ft_pct;  // 14

    @Column
    private Double p_efg_pct;  // 15

    @Column
    private Long p_orb;  // 17

    @Column
    private Long p_drb;  // 18

    @Column
    private Double p_rpg;  // 19

    @Column
    private Long p_ast;  // 20

    @Column
    private Double p_apg;  // 21

    @Column
    private Long p_wft;  // 22

    @Column
    private Long p_woft;  // 23

    @Column
    private Long p_stl;  // 24

    @Column
    private Long p_bs;  // 25

    @Column
    private Long p_gd;  // 26

    @Column
    private Long p_to;  // 27

    @Column
    private Long p_dk;  // 28

    @Column
    private Long p_dka;  // 29

    @Column
    private Long p_pts;  // 30

    @Column
    private Double p_ppg;  // 31


    @Builder
    public KblPlayer(Long id, Long p_uni_num, String p_name, String p_team, Long p_game, String p_time, Long p_2p, Long p_2pa, Double p_2p_pct, Long p_3p, Long p_3pa, Double p_3p_pct, Double p_fg_pct, Long p_ft, Long p_fta, Double p_ft_pct, Double p_efg_pct, Long p_orb, Long p_drb, Double p_rpg, Long p_ast, Double p_apg, Long p_wft, Long p_woft, Long p_stl, Long p_bs, Long p_gd, Long p_to, Long p_dk, Long p_dka, Long p_pts, Double p_ppg) {
        this.id = id;
        this.p_uni_num = p_uni_num;
        this.p_name = p_name;
        this.p_team = p_team;
        this.p_game = p_game;
        this.p_time = p_time;
        this.p_2p = p_2p;
        this.p_2pa = p_2pa;
        this.p_2p_pct = p_2p_pct;
        this.p_3p = p_3p;
        this.p_3pa = p_3pa;
        this.p_3p_pct = p_3p_pct;
        this.p_fg_pct = p_fg_pct;
        this.p_ft = p_ft;
        this.p_fta = p_fta;
        this.p_ft_pct = p_ft_pct;
        this.p_efg_pct = p_efg_pct;
        this.p_orb = p_orb;
        this.p_drb = p_drb;
        this.p_rpg = p_rpg;
        this.p_ast = p_ast;
        this.p_apg = p_apg;
        this.p_wft = p_wft;
        this.p_woft = p_woft;
        this.p_stl = p_stl;
        this.p_bs = p_bs;
        this.p_gd = p_gd;
        this.p_to = p_to;
        this.p_dk = p_dk;
        this.p_dka = p_dka;
        this.p_pts = p_pts;
        this.p_ppg = p_ppg;
    }
}
