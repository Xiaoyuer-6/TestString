import java.util.Arrays;
import java.lang.reflect.Field;
import java.util.Arrays;

public class TestString {
    /*
    public static void main(String[] args) {
        byte[] bytes = {97,98,99,100};
        String str = new String(bytes,1,2);
        System.out.println(str);

        String str2 = "abcde";
        byte[] bytes2 = str2.getBytes();
        System.out.println(Arrays.toString(bytes2));


        String str3 = "gaobo";
        try {
            byte[] bytes3 = str3.getBytes("gbk");
            System.out.println(Arrays.toString(bytes3));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


     */

    /*
    public static String reverse(String string,int left,int right) {
        //字符串转为数组
        char[] chars = string.toCharArray();
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }


    public static String reverseK(String str,int k) {
        if(str == null || k <= 0 || k>str.length()) {
            return null;
        }

        str = reverse(str,0,k-1);
        str = reverse(str,k,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String str = scan.next();
        String ret = reverseK(str,k);
        System.out.println(ret);
    }

     */
    public static String reverse(String string) {//字符串逆置（先转换成数组在进行逆置后输出字符串）
        //字符串转为数组
        char[] chars = string.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while (i < j) {
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i++;
            j--;
        }
        //return chars;
        //数组转化为字符串
        //①return new String(chars);
        //②return String.copyValueOf(chars);
        return String.valueOf(chars);
    }

    public static void main12(String[] args) {
        String str = "abcdef";
        //逆置
        String ret = reverse(str);
        System.out.println(ret);
    }


    public static void main11(String[] args) {
        char[] value = {'h','e','l','l','o'};//将部分数组中的内容变为字符串
        String str3 = new String(value,1,2);
        System.out.println(str3);

        String str = "abcdef";//取得指定索引位置。索引从0开始
        char ch = str.charAt(1);
        System.out.println(ch);

        char[] chars = str.toCharArray();//将字符串变为字符数组并返回
        System.out.println(Arrays.toString(chars));
    }



    public static void main9(String[] args) {//这样的尽量不要写，创建大量临时变量；
        String str1 = "abc";
        for(int i = 0;i <= 10;i++) {
            str1 += i;
        }
        System.out.println(str1);
    }

    public static void main8(String[] args) {//同上main9
        String str1 = "abc";
        str1 = str1+"de";
        str1 = str1 +"fg";
        System.out.println(str1);
    }


    public static void main7(String[] args) {//String类提供的equals方法进行比较；
        // 比较的是字符串的内容
        String str1 = null;
        String str3 = "abcde";

        //boolean flg = str1.equals("abcde");
        boolean flg2 = "abcde".equals(str1);//点号前面应该为具体的字符串，这样可以避免发生异常；

        System.out.println(flg2);
    }


    public static void main6(String[] args) {//str2指向str1指向的对象，修改str1指向的对象，不影响str2的值，因为
        //修改str1时，让str1这个引用指向了一个新的String对象
        String str1 = "Hello";
        String str2 = str1;
        str1 = "hello";
        System.out.println(str2);
        System.out.println(str1);
    }

    public static void main5(String[] args) {//指向堆中字符串常量池中的同一个；
        String str1 = "Hello";
        //str2指向了str1指向的对象
        String str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str2 == str1);
    }

    public static void main4(String[] args) {//不加intern时，指向的对象不一样，加上之后，让str1直接在对
        // 堆中常量池中找出现过的相同的引用
        String str2 = new String("abcde").intern();
        String str1 = "abcde";
        System.out.println(str1 == str2);
    }


    public static void main3(String[] args) {
        String str1 = "abcde";

        String str2 = new String("abcde");

        System.out.println(str1 == str2);//false，和创建字符串时内存布局一样，他们引用的对象不同；

        String str3 = "abc"+"de";//编译时 就进行了拼接，拼接相当于 "abcde"
        //相当于String str3 = "abcde";
        System.out.println(str3 == str1);//true，字符串常量池中有str1的abcde。所以str3直接指向str1所指向的地址

        String str4 = new String("abc")+new String("de");
        System.out.println(str1 == str4);//false，引用的对象不同


        String str5 = new String("abc")+"de";
        System.out.println(str1 == str5);//false同上；

        System.out.println(str4 == str5);//false同上；

    }




    public static void main2(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(value);
        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false
    }

    public static void main1(String[] args) {
        //方式一
        String str1 = "hello";
        System.out.println(str1);
        //方式二
        String str2 = new String("hello");
        System.out.println(str2);
        //方式三
        char [] value = {'h','e','l','l','o'};
        String str3 = new String(value);
        System.out.println(str3);
    }

}
