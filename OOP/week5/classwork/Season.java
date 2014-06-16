package OOP.week5.classwork;

public enum Season {
	
	WINTER(120), SPRING(90), SUMMER(500), AUTUMN(10);
	
	private int days;
	
	private Season(int days){
		this.days = days;
	}
	
	public int getDays(){
		return days;
	}
	
	
	
}
