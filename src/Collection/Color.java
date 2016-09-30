package Collection;

public class Color {
	private String color;
	
	public Color(String color){
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString(){
		return getColor();
	}
}
