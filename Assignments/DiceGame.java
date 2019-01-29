class DiceGame {
	
	public static int n= 0;
	public static int dice4= (int) (Math.random()*4+1);
    public static int dice6= (int) (Math.random()*6+1);
	public static int dice20 = (int) (Math.random()*20+1);
	public static void main(String[] args) {
	while(n<10) {
     getD4(dice4);
	 System.out.println(dice4);
	 n++;
	}
	
	getD6(dice6);
    getD20(dice20);
    
    
    }

	public static  int getD4(int dice4) {
	return(dice4);
	}

	

	public static int getD6(int dice6) {
     return(dice6);  
	}
		

	

	public static int getD20(int d20) {
	return(dice20);

	}

	
}