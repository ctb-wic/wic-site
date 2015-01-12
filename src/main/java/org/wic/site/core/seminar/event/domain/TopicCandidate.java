package org.wic.site.core.seminar.event.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.wic.site.core.seminar.topic.domain.Topic;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wic on 1/12/15.
 */
@Data
@Entity
@NoArgsConstructor
public class TopicCandidate {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;	

  @OneToOne(optional=false)
  private Topic topic;
  
  private Integer votes;
  
  public TopicCandidate(Topic topic){
	  
  }
  
}
