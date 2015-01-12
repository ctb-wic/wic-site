package org.wic.site.core.seminar.seminar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wic.site.core.seminar.seminar.domain.Seminar;

public interface SeminarRepository extends JpaRepository<Seminar, Long> {

}