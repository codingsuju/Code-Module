public class Arrays{
	public static void main(String[] args){
		int[] arr;
		arr =new int[4];
		func(arr);
		for(int i=0;i<4;i++){
			System.out.println(arr[i]);
		}
	}
	public static void func(int []arr){
		arr[3]=2;
		int [] arrayCopy= arr.clone();
		arrayCopy[0]=1;
	}
}
