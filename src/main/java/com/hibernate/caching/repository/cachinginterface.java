package com.hibernate.caching.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.caching.entity.CachingEntity;

public interface cachinginterface extends JpaRepository <CachingEntity, Integer>{

}
