package radar.Service;

public interface RadarService {

	Object[][] getRadarList(String id);

	String getType(String id);

	Object[][] countRadarList();

	Object[] getDataForRadarComboBox(Object[] params);
	
	Object[][] getRadars(Object[] params);
	
	Object[][] getRadarsByManagerId(Object[] params);

    

}
