package org.example.repository;

import org.example.entity.CitizenEntity;
import org.springframework.data.repository.CrudRepository;

public interface CitizenRepository extends CrudRepository<CitizenEntity ,Long> {

}
