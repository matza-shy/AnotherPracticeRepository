import java.util.ArrayList;
import java.util.List;

/* My Class1 Is great !!!*/
class MyClass {
    int m_size;
    List<Integer> lst = null;

    MyClass(int v)
    {
        m_size = v;
        lst = new ArrayList<Integer>(m_size);

        for (int i = 0; i < m_size; i++)
        {
            lst.add(Integer.valueOf(i));
        }
    }

    @Override
    public String toString() {
        StringBuilder retval = new StringBuilder(1000);
        for (int i = 0; i < m_size; i++)
        {
            retval.append(">>>> " + lst.get(i).toString() + "\n");
        }

        return retval.toString();
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass(100);

        System.out.println(mc);
    }


}