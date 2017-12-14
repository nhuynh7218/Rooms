import java.util.Scanner;
public class BossRoom extends Room {




	public BossRoom(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	
		System.out.println("You found a mini-boss");
		System.out.println("Solve his math questions to beat him");



