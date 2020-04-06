package com.api.covidapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.covidapi.model.Statistics;

@Repository
public interface StatisticRepository extends CrudRepository<Statistics, Long> {

}
