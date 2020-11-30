package MyPackage;

public class Student {
    /**
     *    01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21
     * 1. 创建Student类，属性：学号 姓名 年龄
     * 2. 将这些Student对象放进数组中
     * 3. 查询里面有没有叫田七的学生如果存在则打印学生的具体信息（封装成方法，键盘输入姓名）
     * 4. 计算所有学生的平均年龄，最大年龄，最小年龄
     * 5. 如果存在名字叫张三的将名字改为张兵
     */
    private int id;
    private String name;
    private int age;

    public Student(String studentInfo){
        String[] allInfo = studentInfo.split("#");
        this.id = Integer.parseInt(allInfo[0]);
        this.name = allInfo[1];
        this.age = Integer.parseInt(allInfo[2]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

