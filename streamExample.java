package java8feature;
import java.util.ArrayList;
import java.util.List;






   public static void main(String[] args) {
        //create a collection
        List<String> names = new ArrayList<String>();
        {
        
        //add the elements to the list
        names.add("Ridhinaya");//0
        names.add("Sanjay");//1
        names.add("Mom");//2
        names.add("Dad");//3
        names.add("Shanmathi");//4
        
        // I would like to count the number of elements present in the list
        //without stream implementation
        int count=0;
        for(String ele: names) {
            if(ele.length()<6) {
                count++;
            }
        }
        System.out.println("String with length less than 6:"+count);
        
        // Lets apply stream now! - Using lambda Expression
        int number=(int)names.stream().filter(ele -> ele.length()<6).count();
        System.out.println("Strings with length less than 6:"+number);
        
    }



}

public class streamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
