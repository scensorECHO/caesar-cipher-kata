import java.util.List;
import java.util.ArrayList;

public class CaesarCipher {
  
  public static List<String>  movingShift(String s, int shift) {
		char[] ca = s.toCharArray();
    String ignore = "! ,";
    for(int i=0;i<ca.length;i++){ 
      if(ignore.indexOf(ca[i])<0){
        int c = ((int)ca[i])+shift%26;
        if(c>(int)'z')
          c-=26;
        ca[i]=(char)c;
      }
      shift++;
    }
    
    int n=0;
    int z = (int)Math.ceil(ca.length/5);
    int f = ca.length%(4*z);
    List<String> list = new ArrayList<>();
    for(int i=0;i<5;i++){
      if(i==4)
        list.add(new String(ca).substring(i*z));
      else
        list.add(new String(ca).substring(i*z,i*z+z));
    }
    return list;
	}
	
	public static String  demovingShift(List<String> s, int shift) {
		return "Not yet buddy";
	}

}
