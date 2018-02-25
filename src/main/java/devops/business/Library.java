package devops.business;

import javax.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="library")
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(name="Title")
	private  String Title ;
	@Column(name="Artist")
	private String Artist ;
	@Column(name="Year_of_release")
	private Date Year_of_release ;
	@Column(name="Number_of_track")
	private int  Number_of_track ;
    @Column(name="Total_playing_time")
    private  Time Total_playing_time;
    
	public Library(){
		
	}
	public Library (String Title, String Artist, Date Year_of_release, int Number_of_track, Time Total_playing_time) {
		this.Title = Title;
		this.Artist =Artist ;
		this.Year_of_release=Year_of_release ;
		this.Number_of_track=Number_of_track;
		this.Total_playing_time = Total_playing_time ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title=Title;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String Artist) {
		this.Artist=Artist;
	}

	public Date getYear_of_release() {
		return Year_of_release;
	}
   
	public void setYear_of_release(Date Year_of_release){
     this.Year_of_release=Year_of_release;
	}
	public long getNumber_of_track() {
		return Number_of_track;
	}
	public void setNumber_of_track(int Number_of_track ) {
			this.Number_of_track=Number_of_track;
		}
    public Time getTotal_playing_time(){
    	return Total_playing_time;
    	
    }
    public void setTotal_playing_time(Time Total_playing_time){
    	this.Total_playing_time=Total_playing_time;
    }
	
	

	@Override
	public String toString() {
		return "Library [id=" + id + ", Title= "+ Title + ", Artist=" + Artist + ",Year_of_release=" + Year_of_release + ",Total_playing_time=" + Total_playing_time + "]";
	
	}


		
	}
