package org.wic.site.core.seminar.topic.domain;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Created by wic on 12/21/14.
 */
@Data
@Entity
@NoArgsConstructor
public class Topic {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String name;
  
  @Enumerated(EnumType.STRING)
  private TopicStatus progress = TopicStatus.QUEUED;
  
  @Temporal(TemporalType.DATE)
  private Date createdDate;
  
  @Temporal(TemporalType.DATE)
  private Date updatedDate;
  
  @Temporal(TemporalType.DATE)
  private Date deletedDate;

  public Topic(String name){

  }
}