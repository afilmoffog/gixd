package listten;
import java.util.ArrayList;
import java.util.Collections;
public class ListTen 
{
    public static void main(String[] args)
    {
    String[] name=new String[] {"Мышкис","Деза","Доткулова","Струсинский","Кутейников","Волков","Жуков","Неверов","Аноприева(тварь)","Морозов(рип)"};
        ArrayList<String> MADITeachers = new ArrayList<String>();
        Collections.addAll(MADITeachers,name);
        Collections.sort(MADITeachers);
        System.out.println("Отсортированные преподы:");
        MADITeachers.forEach(System.out::println);
    }            
    }

