package com.vjerksen.springwebservice.web;


import com.vjerksen.springwebservice.domain.posts.KblPlayer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
public class KblSaveRequestDto {
    private Long id;
    private Long p_uni_num; // 1
    private String p_name;  // 2
    private String p_team;  // 16
    private Long p_game;  // 3
    private String p_time;  // 4
    private Long p_2p;  // 5
    private Long p_2pa;  // 6
    private Double p_2p_pct;  // 7
    private Long p_3p;  // 8
    private Long p_3pa;  // 9
    private Double p_3p_pct;  // 10
    private Double p_fg_pct;  // 11
    private Long p_ft;  // 12
    private Long p_fta;  // 13
    private Double p_ft_pct;  // 14
    private Double p_efg_pct;  // 15
    private Long p_orb;  // 17
    private Long p_drb;  // 18
    private Double p_rpg;  // 19
    private Long p_ast;  // 20
    private Double p_apg;  // 21
    private Long p_wft;  // 22
    private Long p_woft;  // 23
    private Long p_stl;  // 24
    private Long p_bs;  // 25
    private Long p_gd;  // 26
    private Long p_to;  // 27
    private Long p_dk;  // 28
    private Long p_dka;  // 29
    private Long p_pts;  // 30
    private Double p_ppg;  // 31


    public KblPlayer toEntity(){
        return KblPlayer.builder()
                .id(id)
                .p_uni_num(p_uni_num)
                .p_name(p_name)
                .p_team(p_team)
                .p_game(p_game)
                .p_time(p_time)
                .p_team(p_team)
                .p_2p(p_2p)
                .p_2pa(p_2pa)
                .p_2p_pct(p_2p_pct)
                .p_3p(p_3p)
                .p_3pa(p_3pa)
                .p_3p_pct(p_3p_pct)
                .p_fg_pct(p_fg_pct)
                .p_ft(p_ft)
                .p_fta(p_fta)
                .p_ft_pct(p_ft_pct)
                .p_efg_pct(p_efg_pct)
                .p_orb(p_orb)
                .p_drb(p_drb)
                .p_rpg(p_rpg)
                .p_ast(p_ast)
                .p_apg(p_apg)
                .p_wft(p_wft)
                .p_woft(p_woft)
                .p_stl(p_stl)
                .p_bs(p_bs)
                .p_gd(p_gd)
                .p_to(p_to)
                .p_dk(p_dk)
                .p_dka(p_dka)
                .p_pts(p_pts)
                .p_ppg(p_ppg)
                .build();
    }


}
