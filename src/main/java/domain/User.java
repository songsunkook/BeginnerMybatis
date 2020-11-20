package domain;

import java.sql.Timestamp;

public class User {
    protected Long id;
    protected String account;
    protected String password;
    protected String nick_name;
    protected Boolean deleted;
    protected Timestamp created_at;
    protected Timestamp updated_at;
}