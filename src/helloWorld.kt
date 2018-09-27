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
}