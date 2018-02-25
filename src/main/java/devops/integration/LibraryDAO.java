package devops.integration;

import java.util.List;

import devops.business.Library;

public interface LibraryDAO {
	public Integer save( Library library ) ;
	public void delete( Library library ) ;
	public List<Library> getDockerData();
	public List<Library> findAll() ;
	public void close();
	
	
}
