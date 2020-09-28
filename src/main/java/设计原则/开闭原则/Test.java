package 设计原则.开闭原则;

public class Test {

    public static void main(String[] args) {

        //在数字后面加上d表示Double
        ICourse javaCourse = new JavaCourse(12,"JAVA",348d);
        ICourse iCourse = new JavaDiscountCourse(12,"JAVA",348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;

        System.out.println(javaCourse.getClass().getName()+
                "\n课程Id: "+javaCourse.getId()+
                "\n课程名称: "+javaCourse.getName()+
                "\n课程价格: "+javaCourse.getPrice());

        System.out.println();
        System.out.println(javaDiscountCourse.getClass().getName()+
                "\n课程Id: "+javaDiscountCourse.getId()+
                "\n课程名称: "+javaDiscountCourse.getName()+
                "\n课程打折价格: "+javaDiscountCourse.getPrice().toString().substring(0, 5)+
                "\n课程原价: "+javaDiscountCourse.getOringinPrice());
    }
}
