import java.util.regex.*;;
public class Regex {
public static void main(String[] args) {
String line="abc@gmail.com";
String patt="(.*)([@])(.*)(\\.)(.*)";
Pattern p=Pattern.compile(patt);
Matcher m=p.matcher(line);

if(m.find()) {
	for(int i=0;i<6;i++) {
	System.out.println("Found value:"+m.group(i));
	}
}
else {
	System.out.println("Match notfound");
}
}
}