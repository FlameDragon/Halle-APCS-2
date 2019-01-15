class CruiseControl {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;
    public  static int accelerateSpeed= (int) (Math.random()*6+1);
	public static int decelerateSpeed = (int) (Math.random()*6+1);
	public static void main(String[] args) {
	toggleCruiseControl();
	accelerate(accelerateSpeed);		
    accelerate(accelerateSpeed);
    accelerate(accelerateSpeed);
    decelerate(decelerateSpeed);
	decelerate(decelerateSpeed);
	decelerate(decelerateSpeed);
	}

	public static  void toggleCruiseControl() {
		cruiseControlSet = !cruiseControlSet;

		if(cruiseControlSet) {
			System.out.println("Cruise Control Enabled");
		} else {
			System.out.println("Cruise Control Disabled");
			speed = 0;
		}	
	}

	public static void accelerate(int accelerateSpeed) {
		if (cruiseControlSet && speed + accelerateSpeed <= MAX_SPEED) {
			speed += accelerateSpeed;
		}
		else if (!cruiseControlSet) {
			System.out.println("Turn on Cruise Control first !!!") ;
		}
	else if (cruiseControlSet && speed + accelerateSpeed >= MAX_SPEED) {
		speed += MAX_SPEED ;
		System.out.println("Max Speed reached.");
	}
		else {
			System.out.println("Max speed reached.");
		}

		System.out.println("Current speed: \t" + speed + "mph");

		if(exceedsWarningThreshold(speed)) {
			alert(false);
		}
	}

	public static void decelerate(int decelerateSpeed) {
        if (cruiseControlSet && speed - decelerateSpeed > 0 ) {
			speed -= decelerateSpeed;
		}
        else if (!cruiseControlSet) {
			System.out.println("Turn on Cruise Control first !!!") ;
		}
		else if (cruiseControlSet && speed - decelerateSpeed <= 0) {
		speed = 0 ;
	}
		else {
			System.out.println("Cannot Decelerate .");
		}

		System.out.println("Current speed: \t" + speed + "mph");

		if(exceedsWarningThreshold(speed)) {
			alert(true);
		}

	}

	public static void reportSpeed() {
		System.out.println("current speed:" + speed);

	}

	public static void alert(Boolean isDecelerating) {
		if(isDecelerating) {
			System.out.println("Speed still exceeds the warning threshold.");
		}
		else {
			System.out.println("Speed exceeds the warning threshold.");			
		}

		System.out.println("Threshold: \t" + speed + "/" + warningSpeed + "mph");
	}

	public static Boolean exceedsWarningThreshold(int speed) {
		return speed > warningSpeed;
	}
}