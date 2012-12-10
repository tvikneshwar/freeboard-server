package nz.co.fortytwo.freeboard.server;

public class Constants {
	/** version */
	public static final String VER = "VER";
	/** Roll degrees */
	public static final String RLL = "RLL";
	/** Pitch degrees */
	public static final String PCH = "PCH";
	/** Yaw degrees*/
	public static final String YAW = "YAW";
	/** IMU Health?*/
	public static final String IMUH = "IMUH";
	/** Mag X - roll*/
	public static final String MGX = "MGX";
	/** Mag Y - pitch*/
	public static final String MGY = "MGY";
	/** Mag Z - heading */
	public static final String MGZ = "MGZ";
	/** Mag Heading */
	public static final String MGH = "MGH";
	/** Latitude*/
	public static final String LAT = "LAT";
	/** Longitude*/
	public static final String LON = "LON";
	/**Altitude */
	public static final String ALT = "ALT";
	/**CourseOverGround - true*/
	public static final String COG = "COG";
	
	/** Speed over ground */
	public static final String SOG = "SOG";
	/** GPS fix true/false*/
	public static final String FIX = "FIX"; 
	/** satellites*/
	public static final String SAT = "SAT"; 
	/** Time of week*/
	public static final String TOW = "TOW"; 
	/**mag declination*/
	public static final String DEC = "DEC";
	/**Wind speed apparent*/
	public static final String WSA = "WSA";
	/**Wind speed true*/
	public static final String WST = "WST";
	/**Wind dir apparent*/
	public static final String WDA = "WDA";
	/**Wind dir true*/
	public static final String WDT = "WDT";
	/**Wind speed units*/
	public static final String WSU = "WSU";
	/**Wind alarm speed (knots) */
	public static final String WSK = "WSK";
	/**Wind speed alarm state */
	public static final String WSX = "WSX";
	
	/** Autopilot state (on/off)*/
	public static final String APX = "APX"; //0=off, 1=on
	/** Autopilot offset from source*/
	public static final String APT = "APT"; //offset from source +/- deg
	/** Autopilot source*/
	public static final String APS = "APS"; //W wind or C compass	
	
	/**Anchor alarm state*/
	public static final String AAX = "AAX";
	/**Anchor alarm radius*/
	public static final String AAR = "AAR";
	/**Anchor alarm Lat*/
	public static final String AAN = "AAN";
	/**Anchor alarm Lon*/
	public static final String AAE = "AAE";

	//attached device types
	public static final String UID = "UID";
	public static final String IMU = "IMU";
	public static final String MEGA = "MEGA";
	
	//Commands
	public static final String VERSION = "#VER";
	public static final String AUTOPILOT_STATE = "#APX"; //0=off, 1=on
	public static final String AUTOPILOT_TARGET = "#APT"; //offset from source +/- deg
	public static final String AUTOPILOT_ADJUST = "#APJ" ;//adjust +/- deg
	public static final String AUTOPILOT_SOURCE = "#APS"; //wind or compass

	public static final String ANCHOR_ALARM_STATE = "#AAX";
	public static final String ANCHOR_ALARM_RADIUS = "#AAR";
	public static final String ANCHOR_ALARM_LAT = "#AAN";
	public static final String ANCHOR_ALARM_LON = "#AAE";
	
	public static final String WIND_SPEED_ALARM_STATE = "#WSX";
	public static final String WIND_ALARM_KNOTS = "#WSK";
	
	public Constants() {
		// TODO Auto-generated constructor stub
	}

}
