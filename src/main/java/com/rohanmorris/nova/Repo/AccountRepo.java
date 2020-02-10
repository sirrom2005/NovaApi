package com.rohanmorris.nova.Repo;

import java.util.List;

import javax.transaction.Transactional;

import com.rohanmorris.nova.Interface.IAccount;
import com.rohanmorris.nova.Model.Account;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

@Transactional
@Repository
public class AccountRepo implements IAccount {

    private SessionFactory sessionFactory;

    public Session getDbSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public AccountRepo(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public long create(Account account) {

        Session session = getDbSession();
        String fname = account.getFirstname().trim().equals("") ? "A"
                : account.getFirstname().replaceAll("[^A-Za-z]+", "").substring(0, 1).toLowerCase();
        String lname = account.getLastname().trim().equals("") ? "B"
                : account.getLastname().replaceAll("[^A-Za-z]+", "").toLowerCase();

        String username = fname.concat(lname).concat(String.valueOf((int) (9999 * Math.random())));
        account.setUsername(username);

        Object id = session.save(account);

        if (id != null) {
            return Long.parseLong(String.valueOf(id));
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Account> read() {
        List<Account> info = getDbSession().createQuery("FROM Account").list();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}