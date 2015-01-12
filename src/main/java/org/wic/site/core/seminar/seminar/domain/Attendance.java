package org.wic.site.core.seminar.seminar.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.wic.site.support.common.AttendanceStatus;
import org.wic.site.support.user.domain.User;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by wic on 1/12/15.
 */
@Data
@Entity
@NoArgsConstructor
public class Attendance {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;	

  @OneToOne(optional=false)
  private User user;
  
  @Enumerated(EnumType.STRING)
  private AttendanceStatus status = AttendanceStatus.APPLIED;
  
  public Attendance(User user){ 
	  
  }
  
}