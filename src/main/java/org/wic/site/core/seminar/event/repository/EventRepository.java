package org.wic.site.core.seminar.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wic.site.core.seminar.event.domain.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}