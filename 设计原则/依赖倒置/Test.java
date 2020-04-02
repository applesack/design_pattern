package 依赖倒置;

public class Test {

    public static void main(String[] args) {


//        v1    这种策略, 应用层依赖实现, 当需求需要更改的时候要对基类进行修改,耦合度高不易维护
//        Scootaloo scootaloo = new Scootaloo();
//        scootaloo.studyJava();
//        scootaloo.studyPython();

//        v2 依赖注入 应用层依赖接口
//        Scootaloo scootaloo = new Scootaloo();
//        scootaloo.study(new FECourse());
//        scootaloo.study(new JavaCourse());
//        scootaloo.study(new PythonCourse());

//        v3 通过构造器的方式
//        Scootaloo scootaloo = new Scootaloo(new JavaCourse());
//        scootaloo.study();

        Scootaloo scootaloo = new Scootaloo();
        scootaloo.setiCourse(new JavaCourse());
        scootaloo.study();

        scootaloo.setiCourse(new PythonCourse());
        scootaloo.study();

    }
}
