package com.example.bms.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


/**
 * The base entity for all tables which contains the common fields.
 */
@MappedSuperclass
public abstract class BaseEntity {

    /**
     * Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    /**
     * CreatedAt.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, length = 19)
    @CreationTimestamp
    protected Date createdAt;

    /**
     * ModifiedAt.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_at", length = 19)
    @UpdateTimestamp
    protected Date modifiedAt;

    /**
     * SoftDeleted.
     */
    @Column(name = "soft_deleted", nullable = false)
    private Boolean softDeleted = false;
}