package org.bca.bcabe.repository;

import org.bca.bcabe.entity.Amico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AmicoRepository extends JpaRepository<Amico, Integer> {
}
