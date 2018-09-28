/**
 *
 * @author: weibo_li
 * @since: 2018-09-26 下午7:41
 */
/*
 * 这个是多行注释
 */
/**
 * 这个是文档注释，注意与多行注释的区别
 */
fun main(args: Array<String>) {
    //println("单行注释，不会被编译执行");

    /*
     * 外层多行注释
     * /*
     *  * 在kotlin中可以嵌套的多行注释
     * */
     */

    println("Hello, World!");

    /* 定义变量 */
    //定义变量时指定类型和初始值
    var str : String = "我是字符串类型" ;
    println("1")
    println(str);
    //定义变量时指定初始值
    var str2 = "我时字符串2" ;
    println("2")
    println(str2);

    //定义整形变量
    var i : Int = 10;
    //赋值为null的话直接编译不通过
//    var i0 : Int = null;
    //赋值为null的话，需要加上？不加？会映射成java中的基本类型；加上？会映射成为java中对应类型的包装类型
    var i1 : Int? = null;
    var i2 : Int = 200;
    var i3 : Int = 200;
    println(i2 === i3); //true 相当于两个java中的int进行比较
    println(i2 == i3); //true 相当于两个java中的int进行比较
    var i4 : Int? = 300;
    var i5 : Int? = 300;
    println(i4 === i5); //false 相当于两个java中的Integer进行 对象地址的比较
    println(i4 == i5); //true 相当于两个java中的Integer对应的int值进行比较
    var i6 : Int? = 100;
    var i7 : Int? = 100;
    println(i6 === i7); //和java中的 -127 ~ 128的效果一样 有常量池在做影响
    println(i6 == i7);
}