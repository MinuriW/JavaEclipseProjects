import java.util.*;

public class Event {
	private Long id;
    private String name;
    private String detail;
    private Date startDate;
    private Date endDate;
	private String organizer;
    public Event(){}
    public Event(String name, String detail, Date startDate, Date endDate,String organizer){
        this.name=name;
        this.detail=detail;
        this.startDate=startDate;
        this.endDate=endDate;
        this.organizer=organizer;
    }
    public Event(Long id, String name, String detail, Date startDate,Date endDate, String organizer){
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.startDate=startDate;
        this.endDate=endDate;
        this.organizer=organizer;
    }
    public Long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDetail(){
        return this.detail;
    }
    public Date getStartDate(){
        return this.startDate;
    }
    public Date getEndDate(){
        return this.endDate;
    }
    public String getOrganizer(){
        return this.organizer;
    }
    public void setId(Long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
    public void setStartDate(Date startDate){
        this.startDate=startDate;
    }
    public void setEndDate(Date endDate){
        this.endDate=endDate;
    }
    public void setOrganizer(String organizer){
        this.organizer=organizer;
    }
}
