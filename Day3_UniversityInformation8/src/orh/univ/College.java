package orh.univ;

public class College  extends University {
	public void ug() {
		System.out.println("override abstract Class UG");
	}

	public void pg() {
		System.out.println("Override abstract Class PG");
	}

	public static void main(String[] args) {
		College c = new College();
		c.ug();
		c.pg();
	}
}



