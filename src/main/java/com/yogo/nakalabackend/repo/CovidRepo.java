package com.yogo.nakalabackend.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

import com.yogo.nakalabackend.domain.Covid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface CovidRepo extends PagingAndSortingRepository<Covid, String> {
    Slice<Covid> findAllByLocation(String location, Pageable pageable);

    List<Covid> findAll();

}