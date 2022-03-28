package io.jh.rest.repository;

import io.jh.rest.entity.UserJpaDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserJpaDto, Long> {

    public List<UserJpaDto> findById(String id);
}
