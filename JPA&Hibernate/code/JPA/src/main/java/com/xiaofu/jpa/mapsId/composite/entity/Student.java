package com.xiaofu.jpa.mapsId.composite.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:42
 * @Version 1.0
 */
@Entity
@Table(name = "student")
@Getter
@Setter
public class Student {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name", nullable = false)
    private String name;

}
