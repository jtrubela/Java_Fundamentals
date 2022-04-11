//https://stackoverflow.com/questions/34325303/monetarycoin-inheritance

public class MonetaryCoin extends Coin{
	private int value;
	
	public int getMonetaryCoin(int value){
		return value;
	}
	public String toString(){
		return super.toString() + " " + value;
	}
	public static void main(String[] args) {
		int MonetaryCoin [] = {1,5,10,25,50,100,100};
	
		for(int i=0;i<MonetaryCoin.length;i++){
			
			
		}
	}
}
