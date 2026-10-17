package com.hibernate.caching.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.caching.entity.CachingEntity;
import com.hibernate.caching.repository.cachinginterface;
import com.hibernate.caching.service.CachingService;


@RestController 
public class CachingController 
{
    @Autowired 
    cachinginterface ci;

    @Autowired 
    CachingService cs;

   
    @PostMapping ("/save")
    public CachingEntity save(@RequestBody CachingEntity ce)
    {
        return ci.save(ce);
    }

    @GetMapping("/get/{flatno}")
public CachingEntity get(@PathVariable int flatno) {
    return cs.print(flatno);
}
}
