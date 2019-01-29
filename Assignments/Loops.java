class Loops {
		public static void main(String[] args) {
	

     int n = 1;
    while(n < 100) {
        System.out.println(n);
        n += n;        
    }
    

	 Boolean shouldLoop = true;
    int v = 0;
    while(shouldLoop) {
        if(v == 20) {
            shouldLoop = false;
        }
        System.out.println(n);
        v++;
    }
    int x = 0;
    while(true) {
        System.out.println("Hello World");
        x++;
        if(x == 10){
            break;
        }
    }
    int t = 1;
    while(t < 10) {
        System.out.println(n);
        t++;
    }
    Boolean newLoop = true;
    int u = 1;
    while(newLoop) {
        if(u == 100) {
            newLoop = false ;
            System.out.println("100 loop passes occured.");
        }
        u++;
int a = 100;
    while(true) {
        System.out.println(a);
        a--;
        if(a == -101){
            break;
        }
    }
int b = 3
;
    while(true) {
        System.out.println(b);
        b+=3;
        if(b == 123){
            break;
        }
    }
    char alpha = 'a';
    while(true) {
        System.out.println(alpha);
        alpha++;
        if(alpha == 'z'){
            break;
        }
    }
System.out.println("z");

  for(int i = 0; i > -100; i--) {
        System.out.println(i);
    }
    for(int i = 0; i <= 20; i += 2) {
        System.out.println(i);
    }

    for(int i = 0; i < 100; i+=3) {
        System.out.println(i);
    }
    for(int i = 1; i <= 1024; i*=2) {
        System.out.println(i);
    }



    }
}
	
}