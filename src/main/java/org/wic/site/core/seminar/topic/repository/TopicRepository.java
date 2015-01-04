package org.wic.site.core.seminar.topic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wic.site.core.seminar.topic.domain.Topic;

/**
 * Created by wic on 12/21/14.
 */
public interface TopicRepository extends JpaRepository<Topic, Long> {
}