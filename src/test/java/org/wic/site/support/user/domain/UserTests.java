package org.wic.site.support.user.domain;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by wic on 12/21/14.
 */
public class UserTests {

    @Test
    public void testLombok() {
        String username = "izeye";

        User user = new User();
        user.setUsername(username);
        assertThat(user.getUsername(), is(username));
    }

}
