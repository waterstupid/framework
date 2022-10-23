package com.xiaofu.jpa.oneToOne.bidirectional.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @Author Administrator
 * @Date 2022/10/22 22:37
 * @Version 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personnel")
public class PersonEntity {

    @Column(name = "id", updatable = false, insertable = false, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne(mappedBy = "person")
    private HeadEntity head;

}
