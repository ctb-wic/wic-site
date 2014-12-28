package org.wic.site.support.user.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.wic.site.Application;
import org.wic.site.support.user.domain.User;
import org.wic.site.support.user.repository.UserRepository;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

/**
 * Created by wic on 12/28/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTests {

  @Autowired
  UserRepository repository;

  @Test
  @Transactional
  public void findByUsername() {
    String username = "username";
    String password = "password";

    User foundUser = repository.findByUsername(username);
    assertThat(foundUser, is(nullValue()));

    User user = new User(username, password);
    repository.save(user);
    assertThat(repository.findByUsername(username), is(user));
  }

}
