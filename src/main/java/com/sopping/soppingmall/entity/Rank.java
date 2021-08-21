package com.sopping.soppingmall.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Rank {
    @Id
    @GeneratedValue
    private String pk;
    private String rank_name;
    private String delete;
}
