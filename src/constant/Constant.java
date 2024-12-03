package constant;

public class Constant {
	public static String ENTER_NO="Enter number of";
	public static String FAN="Fan";
	public static String AC="Ac";
	public static String BULB="Bulb";
	public static String ENTER_VALID_IN="Enter Valid Input";
	public static String EXIT="Exit";
	public static String EnterDeviceno="Enter device number";
	public static String SWITCH="switch";
	public static String BACK="Back";
	public static String SELECT_STATE="Select State";
	public static String STATE_CHANGE="State Changed Successfully";
	public static String Off="Off";
	public static String On="On";
	public static String WHERECLAUSE="where id=";
	public static String COUNTQUERY="select count(*) as count from appliance";
	public static String STATEQUERY="select * from appliance where id=";
	public static String NAMEQUERY="select * from appliance where id=";
	public static String IDQUERY="select * from appliance where id=";
	public static String CONSOLEQUERY="select *,rank() over(PARTITION BY name order by id) as number from appliance group by name,id,state  order by name desc";
	public static String UPDATEQUERY="update appliance set state=";
	public static String INSERTQUERY="insert into Appliance(name,state) values('";
}
