package socket;

import javax.websocket.Session;

public class Beans {
	private Session se;
	private String id;
	
	Beans(Session se, String id) {
		this.se=se;
		this.id=id;
	}
	public Session getSe() {
		return se;
	}
	public void setSe(Session se) {
		this.se = se;
	}
	public String getId_count() {
		return id;
	}
	public void setId_count(String id_count) {
		this.id = id_count;
	}
	
	
}
