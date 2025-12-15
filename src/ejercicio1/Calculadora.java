/**
 * 
 */
package ejercicio1;

/**
 * 
 */
public class Calculadora {

	private int num1;
	private int num2;
	
	
	
	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}


	
	public boolean resta2() {
		boolean go;
		if (num1>=num2) {
			go=true;
		}
		else {go=false;}
		return go;
	}
	
	
	public int resta() {
		int result;
		if (resta2()) {
			result= num1-num2;
		}
		else {result=num2-num1;}
		return result;
	}
	
	public Integer divide2() {
		Object result;
		if(num2==0) {
			result= null;
		}
		else {result= num1/num2;}
		return (Integer) result;
	}
}
