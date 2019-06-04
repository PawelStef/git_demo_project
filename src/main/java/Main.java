import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(100200L,"Leszek","Możdzer");
        Student student2 = new Student(122212L, "sdf","adsdfa");
        Student student3 = new Student(100400L, "sdfsergs","wwwww");
        Student student4 = new Student(5346567L, "sfafsa", "ksdygbdh");
        System.out.println(student1);

        Map<Long , Student> mapaStudentow = new TreeMap<Long, Student>();
        mapaStudentow.put(student1.getNumerIndeksu(), student1);
        mapaStudentow.put(student2.getNumerIndeksu(), student2);
        mapaStudentow.put(student3.getNumerIndeksu(), student3);
        mapaStudentow.put(student4.getNumerIndeksu(), student4);

        if(mapaStudentow.containsKey(100200L)){
            System.out.println("Jest student o indeksie 100200");
            System.out.println(mapaStudentow.get(100200L));
        }else{
            System.out.println("Brak");
        }

        System.out.println(mapaStudentow.size());
        if(mapaStudentow.containsKey(100400L)){
            System.out.println("Jest student o indeksie 100400");
            System.out.println(mapaStudentow.get(100400L));
        }else{
            System.out.println("Brak");
        }

        System.out.println(mapaStudentow);



    }
}
