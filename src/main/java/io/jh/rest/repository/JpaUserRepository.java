package io.jh.rest.repository;

import javax.persistence.EntityManager;
import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public class JpaUserRepository implements UserRepository {

    private final EntityManager em;

    // 생성자를 통한 주입
    public JpaUserRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        Member member = em.find(Member.class, id);
        return Optional.ofNullable(member);
    }

    @Override
    public Optional<Member> findByName(String name) {
        List<Member> result = em.createQuery("select m from Member m  where m.name = :name", Member.class)
                .setParameter("name",name)
                .getResultList();
        return  result.stream().findAny();
    }

    @Override
    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList(); //JPQL 엔티티 대상으로 쿼리 날림
    }
}
