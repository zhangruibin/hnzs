package com.hnzs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ClassName SysRole
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/20 15:11
 * @Version
 */
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

