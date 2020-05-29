package ua.com.foxminded.carmanager;

public interface Serviceable {

	public boolean isReadyToService();
	
	public void addDistance(int additionalDistance);
	
	public void addDistance(double additionalDistance);
	
	public int getDistanceOnService();

	
}
