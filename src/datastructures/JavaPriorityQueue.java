package datastructures;

import java.util.*;

class Priorities {

    /**
     * @param events ENTER name CGPA id
     *               SERVED
     * @return
     */
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(events.size(), Comparator
                .comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparing(Student::getId));
        for (String event : events) {
            String[] eArr = event.split("\\s");
            String op = eArr[0];
            if (op.equals("ENTER")) {
                String name = eArr[1];
                double cgpa = Double.parseDouble(eArr[2]);
                int id = Integer.parseInt(eArr[3]);
                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);
            }
            if (op.equals("SERVED")) {
                priorityQueue.poll();
            }
        }
        List<Student> students = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            students.add(priorityQueue.poll());
        }
        return students;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getFname());
            }
        }
    }
}
