package com.yoggo.dleandroidclient.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.yoggo.dleandroidclient.database.Commentaries;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table COMMENTARIES.
*/
public class CommentariesDao extends AbstractDao<Commentaries, Long> {

    public static final String TABLENAME = "COMMENTARIES";

    /**
     * Properties of entity Commentaries.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property NewsId = new Property(1, Long.class, "NewsId", false, "NEWS_ID");
        public final static Property Content = new Property(2, String.class, "Content", false, "CONTENT");
        public final static Property Author = new Property(3, String.class, "Author", false, "AUTHOR");
        public final static Property Date = new Property(4, String.class, "Date", false, "DATE");
        public final static Property UserId = new Property(5, String.class, "UserId", false, "USER_ID");
    };


    public CommentariesDao(DaoConfig config) {
        super(config);
    }
    
    public CommentariesDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'COMMENTARIES' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NEWS_ID' INTEGER," + // 1: NewsId
                "'CONTENT' TEXT," + // 2: Content
                "'AUTHOR' TEXT," + // 3: Author
                "'DATE' TEXT," + // 4: Date
                "'USER_ID' TEXT);"); // 5: UserId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'COMMENTARIES'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Commentaries entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long NewsId = entity.getNewsId();
        if (NewsId != null) {
            stmt.bindLong(2, NewsId);
        }
 
        String Content = entity.getContent();
        if (Content != null) {
            stmt.bindString(3, Content);
        }
 
        String Author = entity.getAuthor();
        if (Author != null) {
            stmt.bindString(4, Author);
        }
 
        String Date = entity.getDate();
        if (Date != null) {
            stmt.bindString(5, Date);
        }
 
        String UserId = entity.getUserId();
        if (UserId != null) {
            stmt.bindString(6, UserId);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Commentaries readEntity(Cursor cursor, int offset) {
        Commentaries entity = new Commentaries( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // NewsId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // Content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // Author
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // Date
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5) // UserId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Commentaries entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setNewsId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAuthor(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setUserId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Commentaries entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Commentaries entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
