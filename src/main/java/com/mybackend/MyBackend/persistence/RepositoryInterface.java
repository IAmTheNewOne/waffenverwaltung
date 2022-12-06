package com.mybackend.MyBackend.persistence;

public interface RepositoryInterface<K> {
	
	public int save(K object);
	
	public int update(K object);
	
	public K get(String id);
	
	public int delete(String id);

}
