package org.wic.site.support.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wic.site.support.user.domain.User;

/**
 * Created by wic on 12/21/14.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
