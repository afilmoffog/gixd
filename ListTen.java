package listten;
import java.util.ArrayList;
import java.util.Collections;
public class ListTen 
{
    public static void main(String[] args)
    {
    String[] name=new String[] {"������","����","���������","�����������","����������","������","�����","�������","���������(�����)","�������(���)"};
        ArrayList<String> MADITeachers = new ArrayList<String>();
        Collections.addAll(MADITeachers,name);
        Collections.sort(MADITeachers);
        System.out.println("��������������� �������:");
        MADITeachers.forEach(System.out::println);
    }            
    }

