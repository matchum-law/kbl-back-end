package com.vjerksen.springwebservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// CRUD를 돕는다.
public interface KblPlayerRepository extends JpaRepository<KblPlayer, Long> {

}
