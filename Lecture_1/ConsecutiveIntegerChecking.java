class ConsecutiveIntegerChecking {
	public static void main (String[] args){
	int a, b;
	boolean solved = false;
	a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[1]);
	int t = Math.min(a, b);
	while (!solved){
		if (a%t == 0){
			if (b%t == 0){

				solved = true;}
				
		else {
			t = t-1;

			}}
			else {
				t = t-1;
				}
}
	System.out.println(t);
	}
}
