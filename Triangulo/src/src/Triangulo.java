package src;

public class Triangulo {
    public void createTriangleOfBase(int len)
    {
        for(int i = 1; i<= len; i++){
        	for(int x = i; x < (len); x++) {
        		System.out.print(" ");
        	}
            for(int j = 1; j <= i; j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void createInversedTriangleOfBase(int len)
    {
        for(int i = len; i>= 1; i--){
        	for(int x = i; x < (len); x++) {
        		System.out.print(" ");
        	}
            for(int j = i; j >= 1; j--){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
