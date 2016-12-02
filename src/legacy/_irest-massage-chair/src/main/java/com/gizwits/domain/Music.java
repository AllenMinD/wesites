package com.gizwits.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Marvel
 * 
 * 音乐
 */
@Entity
@Table(name = "Music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    // 名称
    private String name;
    
    protected Music() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
