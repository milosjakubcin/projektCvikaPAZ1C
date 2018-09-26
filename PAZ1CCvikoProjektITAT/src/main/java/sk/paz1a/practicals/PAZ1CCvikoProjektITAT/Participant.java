package sk.paz1a.practicals.PAZ1CCvikoProjektITAT;

import java.time.LocalDateTime;
import java.util.List;

public class Participant {
	private String name;
	private String surname;
	private String email;
	private String organization;
	private String address;
	private Long Ico;							//ak je to nepovinny typ, musim dat objektovy typ premennej aby som tam mohol dat null
	private String Dic;
	private Tshirt tshirt;
	private boolean early;
	private boolean student;
	private boolean singleRoom;
	private LocalDateTime start;
	private LocalDateTime end;
	private List<Companion> companions;
	private WorkShop workshop;
	private boolean cash;
	
	
	
	

}
