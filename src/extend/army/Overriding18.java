package extend.army;

public class Overriding18 {
	public static void main(String[] args) {
		// 육군
		Army16 army = new Army16("육군");
		army.attack();
		army.tank();
		System.out.println("--------------");
		
		// 해군
		Navy17 navy = new Navy17("해군");
		navy.attack();
		navy.nucleus();
		System.out.println("--------------");
		
		// 공군
		AirForce15 af = new AirForce15("공군");
		af.attack();
		af.bombing();
		System.out.println("--------------");
	}

}
