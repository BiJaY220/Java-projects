package Productweb;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO<T> {//genetics type T
	public void connect() throws SQLException,ClassNotFoundException;
	public void disconnect() throws SQLException,ClassNotFoundException;
	public int save(T t) throws SQLException,ClassNotFoundException;
	public T getOne(long id) throws SQLException,ClassNotFoundException;
	public ArrayList<T> getAll() throws SQLException,ClassNotFoundException;
	public int update(T t) throws SQLException,ClassNotFoundException;
	public int delete(long id) throws SQLException,ClassNotFoundException;

}
