
public class NewBase extends Enemy{
	public NewBase(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
	}
	public void draw(MyFrame f) {
		f.setColor(128, 0, 128);
		f.fillOval(x, y, 5, 20);
		f.setColor(33, 33, 33);
		f.fillOval(x+3, y+15, 18, 18);
		f.setColor(128, 0, 128);
		f.fillOval(x+20, y, 5, 20);
		f.setColor(333, 0, 0);
		f.fillOval(x+6, y+18, 12, 12);
		f.setColor(333, 333, 333);
		f.fillOval(x+9, y+22, 6, 6);
	}
	
	}



