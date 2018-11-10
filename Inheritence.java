

class Bicycle{
	public int gear;
	public int speed;

	public Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrakes(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increment){
		speed += increment;
	}
	public String toString()
	{
		return ("No of gears are "+gear
				+"\n"
				+"speed of bicycle is "+speed);
	}
}

class MountainBike extends Bicycle
{
	public int seatHeight;
	public MountainBike(int gear, int speed, int seatHeight)
	{
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public void setHeight(int newValue)
	{
		seatHeight = newValue;
	}
	//override toString method
	@Override
	public String toString(){
		return (super.toString()+"\nseat height is "+seatHeight);
	}
}

public class Inheritence
{
	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3, 100, 25);
		mb.speedUp(200);
		System.out.println(mb.toString());
	}
}