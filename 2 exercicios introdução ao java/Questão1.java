public class Main
{
    public static int calcMedia(int v1, int v2, int v3) {
        return ((v1+v2+v3)/3);
    }
    
	public static void main(String[] args) {
	    int v1 = 70;  
	    int v2 = 80;
	    int v3 = 75;
        int var = calcMedia(v1, v2, v3);
        System.out.println("v1: " + v1 + " v2: " + v2 + " v3: " + v3 + " média: " + var);
	}
}
