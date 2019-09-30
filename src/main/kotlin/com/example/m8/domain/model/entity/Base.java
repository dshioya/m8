package com.example.m8.domain.model.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class Base {

    /**
     * ID。
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 登録日時。
     */
    @CreationTimestamp
    private Date createdDate;

    /**
     * 更新日時。
     */
    @UpdateTimestamp
    private Date updatedDate;

}