package S10;

import java.util.ArrayList;
import java.util.List;

public class Stack {
        private List<Object> list = new ArrayList<>();

        public void push(Object s) {
            list.add(s);
        }
        public Object pop() {
            Object r = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return r;
        }
        public int getCount() {
            return list.size()- 1;
        }


        public static void main(String[] args) {
            Stack s = new Stack();
            s.push("Ciao");
            s.push("Arrivederci!");
            String x;
            x = (String) s.pop();
            System.out.println(x);
            x = (String) s.pop();
            System.out.println(x);
        }
}
