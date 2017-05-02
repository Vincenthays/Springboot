package com.vincent.Service;

import com.vincent.Entity.User;
import com.vincent.Service.LDAP.LDAPAccess;
import com.vincent.Service.LDAP.LDAPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LDAPService {

    @Autowired
    UserService userService;

    public boolean loginCheck(String login, String password) {

        LDAPAccess access = new LDAPAccess();
        try {
            LDAPObject test = access.LDAPget(login, password);

            if (test == null) {
                return false;
            }

            System.out.println(test.toString());

            int user_id = Integer.parseInt(test.getNumber());

            if (!userService.exists(user_id)) {

                User user = new User();

                user.setId(user_id);
                user.setName(test.getNomFamille());
                user.setFirst_name(test.getPrenom());

                System.out.println(user);

                userService.save(user);
            }

            return true;

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
