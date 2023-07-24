package io.soufianeodf.deployspringbootwithk8s.repository;

import io.soufianeodf.deployspringbootwithk8s.entity.GreetingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CrudRepository<GreetingEntity, Long> {
}
