package com.xiaofu.jpa.mapsId.composite.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:44
 * @Version 1.0
 */
@Entity
@Table(name = "phone")
@Getter
@Setter
public class Phone {

    @EmbeddedId
    private CompositeId id;

    /**
     * @MapsId
     * 当某一个实体中存在复合主键的时候,并且复合主键中有某个字段和引用实体主键相同，这个时候，没必要特别的生成一个用于
     * join的字段,可以将复合主键的某个字段用于join,那么@MapsId作用就是如此，它的作用就是告诉Hibernate,在复合主键中
     * 指定了一个字段，将这个字段用于表连接的字段即可
     * 另外，指定复合主键的字段名会变成:被引用实体的属性名 + ‘_’ + 被引用实体的主键名
     */
    @MapsId("sId")
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private Student student;

}

