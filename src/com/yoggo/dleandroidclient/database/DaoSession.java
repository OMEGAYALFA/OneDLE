package com.yoggo.dleandroidclient.database;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.yoggo.dleandroidclient.database.News;
import com.yoggo.dleandroidclient.database.Commentaries;
import com.yoggo.dleandroidclient.database.Categories;
import com.yoggo.dleandroidclient.database.Groups;

import com.yoggo.dleandroidclient.database.NewsDao;
import com.yoggo.dleandroidclient.database.CommentariesDao;
import com.yoggo.dleandroidclient.database.CategoriesDao;
import com.yoggo.dleandroidclient.database.GroupsDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig newsDaoConfig;
    private final DaoConfig commentariesDaoConfig;
    private final DaoConfig categoriesDaoConfig;
    private final DaoConfig groupsDaoConfig;

    private final NewsDao newsDao;
    private final CommentariesDao commentariesDao;
    private final CategoriesDao categoriesDao;
    private final GroupsDao groupsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        newsDaoConfig = daoConfigMap.get(NewsDao.class).clone();
        newsDaoConfig.initIdentityScope(type);

        commentariesDaoConfig = daoConfigMap.get(CommentariesDao.class).clone();
        commentariesDaoConfig.initIdentityScope(type);

        categoriesDaoConfig = daoConfigMap.get(CategoriesDao.class).clone();
        categoriesDaoConfig.initIdentityScope(type);

        groupsDaoConfig = daoConfigMap.get(GroupsDao.class).clone();
        groupsDaoConfig.initIdentityScope(type);

        newsDao = new NewsDao(newsDaoConfig, this);
        commentariesDao = new CommentariesDao(commentariesDaoConfig, this);
        categoriesDao = new CategoriesDao(categoriesDaoConfig, this);
        groupsDao = new GroupsDao(groupsDaoConfig, this);

        registerDao(News.class, newsDao);
        registerDao(Commentaries.class, commentariesDao);
        registerDao(Categories.class, categoriesDao);
        registerDao(Groups.class, groupsDao);
    }
    
    public void clear() {
        newsDaoConfig.getIdentityScope().clear();
        commentariesDaoConfig.getIdentityScope().clear();
        categoriesDaoConfig.getIdentityScope().clear();
        groupsDaoConfig.getIdentityScope().clear();
    }

    public NewsDao getNewsDao() {
        return newsDao;
    }

    public CommentariesDao getCommentariesDao() {
        return commentariesDao;
    }

    public CategoriesDao getCategoriesDao() {
        return categoriesDao;
    }

    public GroupsDao getGroupsDao() {
        return groupsDao;
    }

}
