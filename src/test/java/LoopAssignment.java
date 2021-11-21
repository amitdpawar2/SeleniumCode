import com.sun.org.apache.xml.internal.utils.StringComparable;

public class LoopAssignment {
    public static void main(String[] args) {

        String names[]={"a","b","c","d"};

        for (String element : names)

              {
                  System.out.println(element);
                  if (element.equals("Abhijit"))
                  {
                     // System.out.println(element);
                      break;

                  }



        }
                

    }
}
