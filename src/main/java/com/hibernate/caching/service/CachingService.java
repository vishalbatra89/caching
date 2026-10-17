package com.hibernate.caching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.hibernate.caching.entity.CachingEntity;
import com.hibernate.caching.repository.cachinginterface;

@Service 
public class CachingService 
{
    
    @Autowired 
    cachinginterface ci;
    
    
    @Cacheable(value = "flats", key = "#flatno")
public CachingEntity print(int flatno) {
    System.out.println("Fetching data from database");
    return ci.findById(flatno).orElse(null);
}

}
