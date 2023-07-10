package com.example.study.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString(exclude = "team") // 무한루프에 방지하기 위해 (exclude="변수명") 설정
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "tbl_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String userName;

    private int age;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

}
