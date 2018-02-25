package devops.integration;

import java.sql.*;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import devops.business.Library;

public class LibraryDAOTests {
	private static LibraryDAO dao ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new LibraryDAOImpl() ;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close() ;
	}

	@Test
	public void addNewLibraryItem() {
		Library library = new Library();
		library.setTitle( "Horro2" ) ;
		library.setArtist("new_Artist");
		library.setYear_of_release(Date.valueOf("2013-03-20"));
		library.setNumber_of_track(25);
		library.setTotal_playing_time(Time.valueOf("0:20:30"));
		List<Library> items=dao.findAll();
		int nextId = items.get( items.size() - 1 ).getId() + 1 ;
		Assert.assertEquals( "Save", nextId, dao.save( library ).intValue() ) ;
	}
}
