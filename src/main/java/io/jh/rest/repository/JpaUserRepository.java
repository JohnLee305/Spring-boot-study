package io.jh.rest.repository;

import io.jh.rest.entity.UserJpaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class JpaUserRepository implements UserRepository {

    @Autowired
    private final EntityManager em;

    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<UserJpaDto> findById(String id) {
        return null;
    }

    @Override
    public List<UserJpaDto> findAll() {
        return null;
    }

    @Override
    public List<UserJpaDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserJpaDto> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<UserJpaDto> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(UserJpaDto entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserJpaDto> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UserJpaDto> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UserJpaDto> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserJpaDto> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserJpaDto> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserJpaDto> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<UserJpaDto> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserJpaDto getOne(Long aLong) {
        return null;
    }

    @Override
    public UserJpaDto getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserJpaDto> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserJpaDto> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserJpaDto> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserJpaDto> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserJpaDto> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserJpaDto> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserJpaDto, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
