package web.service;

import org.springframework.stereotype.Service;
import web.dao.UsersDao;
import web.dao.UsersDaoImpl;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{


    private final UsersDao userDao;

    public UsersServiceImpl(UsersDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
