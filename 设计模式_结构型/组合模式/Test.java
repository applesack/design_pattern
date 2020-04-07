package 组合模式;

/**
 * @author : flutterdash@qq.com
 * @date : 2020年04月02日 10:38
 */
public class Test {

    public static void main(String[] args) {

        CatalogComponent linuxCource = new Course("Liunx课程", 11);
        CatalogComponent windowsCource = new Course("Windows课程", 12);

        CatalogComponent javaCourceCatelog = new CourseCatelog("Java课程目录", 2);

        CatalogComponent mmallCource1 = new Course("Java电商一期", 55);
        CatalogComponent mmallCource2 = new Course("Java电商二期", 66);
        CatalogComponent designPattern = new Course("Java设计模式", 77);

        javaCourceCatelog.add(mmallCource1);
        javaCourceCatelog.add(mmallCource2);
        javaCourceCatelog.add(designPattern);

        CatalogComponent imoocMainCourseCatalog = new CourseCatelog("慕课网课程主目录", 1);
        imoocMainCourseCatalog.add(linuxCource);
        imoocMainCourseCatalog.add(windowsCource);
        imoocMainCourseCatalog.add(javaCourceCatelog);

        imoocMainCourseCatalog.print();
    }
}
