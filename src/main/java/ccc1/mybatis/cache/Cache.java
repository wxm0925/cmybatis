package ccc1.mybatis.cache;

import java.util.concurrent.locks.ReadWriteLock;

/**
 * 缓存接口
 * @author issuser
 *
 */
public interface Cache {
	
	String getId();
	
	void putObject(Object key, Object value);
	
	Object getObject(Object key);
	
	Object removeKey(Object key);
	
	void clear();
	
	int getSize();
	
	ReadWriteLock getReadWriteLock();
}
