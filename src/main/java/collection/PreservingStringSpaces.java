package collection;

public class PreservingStringSpaces {

	static void findSpaces(String originalValue) {
		char[] orginalArray = originalValue.toCharArray();
		char[] copyArrayValue = new char[orginalArray.length];
		
		for(int i = 0; i< orginalArray.length; i++){
			if(orginalArray[i] == ' '){
				copyArrayValue[i] = ' ';
			}
		}
		
		for(int i = orginalArray.length-1; i > orginalArray.length ; i--){
			
		}

	}
	
	public static void main(String[] args) {
		
		findSpaces("i am in chennai");
	}
}
