package com.xiaofu.jpa.mapsId.composite.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @Author Administrator
 * @Date 2022/10/23 20:44
 * @Version 1.0
 */
@Embeddable
@Getter
@Setter
public class CompositeId implements Serializable {

    private static final long serialVersionUID = 1062539936317195313L;

    private String name;

    private Long sId;

}
