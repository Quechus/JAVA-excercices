public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(Reverse(964632435));
		
	}
	
	public static int Reverse(int _numero) {
		int reverse = _numero;
		if( ( reverse > Math.pow(2,31) -1 ) && ( reverse < Math.pow(-2,31) ) ) {
			reverse = 0;
			return reverse;
		}
		
		int j = 0;
		int resultadoInt;
		String resultado = "";
		boolean isNegtive = false;
		
		if( reverse < 0 ) {
			reverse *= -1;
			isNegtive = true;
			System.out.println(reverse);
		}
		String numCadena=String.valueOf(reverse);
	
		char[] arr = numCadena.toCharArray();
		char[] aux = new char[arr.length];
		

		for (int i = arr.length-1;  i >= 0; i--) {
			aux[j] = arr[i];
			j++;
		}
		
		StringBuilder concatenador = new StringBuilder();
		
		for (int i = 0; i < aux.length; i++) {
			concatenador.append(aux[i]);
		}
		
		resultado = concatenador.toString();
		try {
			resultadoInt = Integer.parseInt(resultado);
		} catch (Exception e) {
			resultadoInt = 0;
		}
		
		
		if( isNegtive ) {
			resultadoInt *= -1;
		}
		
		return resultadoInt;
		
	}
}