package com.example.memo2.database;




@Dao
public interface MemoDao {
    @Query("SELECT * FROM memo")
    List<Memo> getAll();

    @Query("INSERT INTO memo (content) VALUES(content)")
    void insertAll(String content);

    @Query("UPDATE memo SET content=:content, WHERE mid=:mid")
    void update(int mid, String content);

    @Query("SELECT * FROM memo WHERE mid=:mid")
    User get(int mid);

    @Delete
    void delete(Memo memo);
}
