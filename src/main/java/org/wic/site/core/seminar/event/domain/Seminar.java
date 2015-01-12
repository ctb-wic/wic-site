package org.wic.site.core.seminar.event.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.wic.site.support.common.SeminarStatus;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wic on 1/12/15.
 */
@Data
@Entity
@NoArgsConstructor
public class Seminar {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
 
  @Enumerated(EnumType.STRING)
  private SeminarStatus status = SeminarStatus.CREATED;
  
  @Temporal(TemporalType.DATE)
  private Date meetingDate;
  
  private String location;
  
  @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
  private List<Attendance> attendances = new ArrayList<Attendance>();
  
  @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
  private List<TopicCandidate> topicCandidates = new ArrayList<TopicCandidate>();
  
}