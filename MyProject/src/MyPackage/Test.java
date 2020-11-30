package MyPackage;

public class Test {
    public static void main(String[] args) {
        Student[] students = getStudent();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        printStudent(students,"田七");

        calculateAvg(students);

        subName(students);
    }
    public static Student[] getStudent(){
        String message = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";
        String[] studentsInfo = message.split("\\*");
        Student[] students = new Student[studentsInfo.length];
        for (int i = 0; i < studentsInfo.length; i++) {
            students[i] = new Student(studentsInfo[i]);
        }
        return students;
    }

    public static void printStudent(Student[] students, String name){
        for (Student student : students) {
            if (student.getName().equals(name)){
                System.out.println("存在学生：" +student);
            }
        }
    }

    public static void calculateAvg(Student[] students){
        int sum = 0;
        int maxAge = -1;
        int minAge = 9999;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAge();
            maxAge = Math.max(maxAge,students[i].getAge());
            minAge = Math.min(minAge,students[i].getAge());
        }
        System.out.println(sum);
        double avg = sum / 5.0;
        System.out.println("平均年龄：" + avg);
        System.out.println("最大年龄：" + maxAge);
        System.out.println("最小年龄：" + minAge);
    }

    public static void subName(Student[] students){
        int index = 0;
        String name = "张三";
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)){
                students[i].setName("张兵");
                index = i;
            }
        }
        System.out.println(students[index]);
    }
}
