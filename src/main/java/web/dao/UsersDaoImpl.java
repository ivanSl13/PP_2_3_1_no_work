package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UsersDaoImpl implements UsersDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> queue = entityManager.createQuery("SELECT users FROM User users", User.class);
        return queue.getResultList();
    }
}
