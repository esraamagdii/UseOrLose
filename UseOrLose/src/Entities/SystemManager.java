package Entities;

import Entities.GameData;
import java.util.ArrayList;

public class SystemManager {
	public ArrayList<GameData>Math = new ArrayList<>();
	public ArrayList<GameData>Science = new ArrayList<>();
	public ArrayList<GameData>programmingCode = new ArrayList<>();
	public ArrayList<GameData>IgnoredGames = new ArrayList<>();
	
	
	
	public ArrayList<GameData> getMath() {
		return Math;
	}
	public void setMath(ArrayList<GameData> math) {
		Math = math;
	}
	public ArrayList<GameData> getScience() {
		return Science;
	}
	public void setScience(ArrayList<GameData> science) {
		Science = science;
	}
	public ArrayList<GameData> getProgrammingCode() {
		return programmingCode;
	}
	public void setProgrammingCode(ArrayList<GameData> programmingCode) {
		this.programmingCode = programmingCode;
	}

}
