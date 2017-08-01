package level1;

public class MovieArray {
public static void main(String[] args) {
	
	
	String[]movieList={
			"Moana","Wonder Woman ","Forest Gump", "Gardians of the Galaxy"
	};
	
	String[]otherList=new String[5];
	otherList[0]="Duck";
	
	
	for (int i = 0; i < movieList.length; i++) {
		System.out.println(movieList[i]);
	}
	
	
	for (String other : otherList) {
		System.out.println(other);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
