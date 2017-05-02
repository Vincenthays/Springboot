package com.vincent.Service;

import com.vincent.Service.LDAP.LDAPAccess;
import com.vincent.Service.LDAP.LDAPObject;
import org.springframework.stereotype.Service;

@Service
public class LDAPService {

    public boolean loginCheck(String login, String password) {

        LDAPAccess access = new LDAPAccess();
        try {
            LDAPObject test = access.LDAPget(login, password);

            if (test == null) {
                return false;
            }

            return true;

        } catch(Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
