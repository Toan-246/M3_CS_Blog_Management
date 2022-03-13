package com.codegym.service.user;

import com.codegym.model.SearchResult;
import com.codegym.model.User;
import com.codegym.service.IGeneralService;

import java.util.List;

public interface IUserService extends IGeneralService<User> {
    User findByUsername(String searchUsername);
    User findByEmail(String email);
    User findByPhone(String phone);
    List<SearchResult> searchKeyword(String q);
}
