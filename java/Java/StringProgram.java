public class StringProgram{
	public static void main(String[] args){
        String name="Suju";
        String t=new String("Suju");
        name =name +" Daimary";
        System.out.println(name);
        String names="Suju, Daimary";
        String namesArray[]=names.split(",");
        for(String allnames:namesArray){
            System.out.println(allnames);
        }
        StringBuffer s=new StringBuffer("");
        s.append("Hello");
        s.setCharAt(0,'x');
        System.out.print(s);
	}
	public static void func(int []arr){
		arr[3]=2;
		int [] arrayCopy= arr.clone();
		arrayCopy[0]=1;
    }
}
