package org.wic.site.core.seminar.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wic.site.core.seminar.event.domain.Seminar;

public interface SeminarRepository extends JpaRepository<Seminar, Long> {

}