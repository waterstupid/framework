package com.xiaofu.jpa.oneToOne.bidirectional.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @Author Administrator
 * @Date 2022/10/22 22:40
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "wife")
public class HeadEntity {

    @Column(name = "id", updatable = false, insertable = false, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn
    private PersonEntity person;


}
