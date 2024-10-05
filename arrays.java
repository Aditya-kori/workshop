public class arrays{
	public static void main(String[] args){
	byte[] costOfChocolates = {50,100,85,65,20,10,55,70,90,120};
	
	short[] noOfWordsInEachSentence = {7452,8297,21940,4337,12736,1528,5738,23527,13384,2480};
	System.out.println(noOfWordsInEachSentence[6]);
	int[] observedValues = {-18273,23846,-13132,11234,3252,76573,236272,547346,23356,267732};
	System.out.println(observedValues[2]);
	long[] pinCodeCollection = {584103l,564193l,584101l,52371l,65712l,14432l,62345l,23226l,54573l,57332l};
	System.out.println(pinCodeCollection[8]);
	float[] cgpaCalculation = {9.14f,6.24f,8.36f,9.14f,6.44f,5.32f,6.25f,6.45f,8.45f,9.32f};
	
	double[] executionSpeed = {234.342131d,124.12432d,134.4352d,134.341214d,243.2314d,1.24334d,323.12342d,234.234223d,45.2534d,4.2341d};
	System.out.println(cgpaCalculation[6]);
	System.out.println(executionSpeed[8]);
	char[] consanantsCollection = {'B','C','D','F','G','H','J','k','L','M'};
	System.out.println(consanantsCollection[0]);
	boolean[] probabilityOfCoinShowingHeads = {true,false,false,true,false,true,false,false,true,true};
	System.out.println(probabilityOfCoinShowingHeads[9]);
	

	for(byte i=9;i>0;i--){
	System.out.println(costOfChocolates[i]);
}
for(byte j=9;j>0;j--){
	System.out.println(noOfWordsInEachSentence[j]);
}
for(byte k=9;k>0;k--){
	System.out.println(observedValues[k]);
}
for(byte l=9;l>0;l--){
	System.out.println(pinCodeCollection[l]);
}
for(byte m=9;m>0;m--){
	System.out.println(cgpaCalculation[m]);
}
for(byte n=9;n>0;n--){
	System.out.println(executionSpeed[n]);
}
for(byte o=9;o>0;o--){
	System.out.println(consanantsCollection[o]);
}
for(byte p=9;p>0;p--){
	System.out.println(probabilityOfCoinShowingHeads[p]);
}



	}
}