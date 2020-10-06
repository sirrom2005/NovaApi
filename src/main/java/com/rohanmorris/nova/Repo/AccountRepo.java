package com.rohanmorris.nova.Repo;

import java.util.List;

import javax.transaction.Transactional;

import com.rohanmorris.nova.Interface.IAccount;
import com.rohanmorris.nova.Model.Account;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.LongType;
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

    @Override
    public Account update(long id, Account account) {
        account.setAcconut_id(id);
        Account info = (Account) getDbSession().merge(account);
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @Override
    public Account findById(long id) {
        Account info = (Account) getDbSession().createQuery("FROM Account WHERE acconut_id = :id")
                .setParameter("id", id, LongType.INSTANCE).uniqueResult();
        if (info != null) {
            return info;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}