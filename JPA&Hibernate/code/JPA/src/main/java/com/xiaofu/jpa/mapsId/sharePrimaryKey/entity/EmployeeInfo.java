package com.xiaofu.jpa.mapsId.sharePrimaryKey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:17
 * @Version 1.0
 */
@Entity
@Table(name = "employee_info")
@Setter
@Getter
public class EmployeeInfo {

    @Id
    @Column(name = "id", nullable = false, insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "information", nullable = false)
    private String information;

}
