package com.xiaofu.jpa.mapsId.sharePrimaryKey.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:16
 * @Version 1.0
 */
@Entity
@Table(name = "employee")
@Getter
@Setter
public class Employee {

    @Id
    @Column(name = "id", nullable = false, insertable = false)
    private Long id;

    /**
     * 如果是单向关系的@OneToOne,请注意,就算不加@JoinColumn这个注解，那么系统也会在该表中生成一个用于join的字段,并且为其
     * 创建一个外键，其字段名称就是被引用的Entity属性+ ‘_’ + 被引用实体的主键
     *
     * 那么@MapsId这个注解的作用类似,该注解有两个作用:
     * 1.和目标实体公用一个主键,主键名称默认为被引用实体Entity属性 + '_' + 目标实体的主键，并且该字段即是主键又是外键
     * 另外在保存该实体的时候,需要先设置被引用实体的值,然后数据库才会先保存被引用实体,然后再保存源实体
     */
    @MapsId
    @OneToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private EmployeeInfo info;

    @Column(name = "name", nullable = false)
    private String name;

}
