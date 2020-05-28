package testone;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by YuZhenni on2020/5/12.
 */
public class one {
    public static void main(String[] args) {
        //这是一个注释

      /*  int avg1=48;
        double rise=5.43;
        double avg2=avg1+rise;
        System.out.println(avg1);
        System.out.println(avg2);

        final String People="一个人";

        System.out.println(People);


        int age1=1;
        int age2=2;
        int age3=3;
        int age4=4;

        int age5=age1+age2;
        System.out.println(age5);
        age5+=age1;
        System.out.println(age5);
        age5-=age2;
        System.out.println(age5);


       int a=33;
       double b=3.22;
       String a1="hee";
       String b1="ddd";
        System.out.println("a等于b?"+(a==b));
        System.out.println("a大于b?"+(a1=b1));
        System.out.println("a小于等于b?"+(a<=b));
        System.out.println("a1等于b1?"+(a1==b1));


        boolean a=true;
        boolean b=false;
        boolean c=false;
        boolean d=true;

        System.out.println("未通过"+(a&&b));
        System.out.println("通过"+(a||b));
        System.out.println("通过"+(c^d));
        System.out.println("通过"+(!c));

        int score = 44;
       // String a=(score>44)? "对":"不对";

        if (score%4==6) {
            System.out.println(score);
        }
        else if (score*1==44){
        System.out.println("ddddd");
    }
        else {
            System.out.println("不对啊");
        }
    }*/


      /*int age=22;
        if (age >60) {
            System.out.println("老年");
        }
        else if (age>40){
            System.out.println("中年");
        }

        else{
            System.out.println("童年");
        }*/

    /*  int score =99;
      String sex="女";
        if (score>=90) {
            if(sex.equals("女")) {
                System.out.println("进入女子决赛");
            }
             else{
                    System.out.println("男子决赛");
             }
        }
        else{
            System.out.println("分数太低");
        }*/



        /*char today='一';
        switch(today){
            case '一':
            case '三':
            case '五':
                System.out.println("包子");
                //break;
            case '二':
            case '四':
            case '六':
                System.out.println("油条");
                break;
            case '日':
                System.out.println("套餐");

        }*/


/*

            int i=1;
            while (i<=5){
                i++;
                System.out.println(i);

            }
*/
       /*
            int num=2;
            int sum=0;
            do {

            sum=sum+num;
            num=num+2;
            System.out.println("偶数只和："+sum);
           }
           while (num<=50);*/

       /*  int sum=0;//保存不能被3整除的数之和
       // 循环变量 i 初始值为 1 ,每执行一次对变量加 1，只要小于等于 10 就重复执行循环
        for (int i = 1; i <=10; i++) {
            // 变量 i 与 3 进行求模（取余），如果不等于 0 ，则表示不能被 3 整除
            if(i%3!=0) {
                sum = sum + i;

            }
            System.out.println(sum);
        }*/
/*
        int i = 1;
        for (; i <=10 ; i++) {
            if((i>2)&&(i%3==0)){

                break;
            }

            System.out.println("结束");

        }

        System.out.println(i);*/

         /*int sum=0;
        for (int i = 1; i <=10 ; i++) {
            //每次循环累加求和
            sum=sum+i;
            //判断累加值是否大于20，大于20就打印出sum的值并且推出循环
            if(sum>20){
                System.out.println(sum);
                //退出循环
                break;
            }
        }*/


        /* int sum=0;
        int i = 1;
        for (; i <=10 ; i++) {

            if(i%2!=0){
                continue;
            }
            sum=sum+i;
            System.out.println(i);

        }

        System.out.println(sum);*/

     /*  //外层循环控制打印行数
        for (int i = 1; i <3 ; i++) {
            //内层循环控制每行打印的*号数
            for (int j = 1; j <4 ; j++) {
                System.out.print("*");
            }
            //每行打印完成换行
          System.out.println();
        }*/


        /*for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


       /*    int a =0, b=0;
       do{
           System.out.println();
           a++;
           b=0;
           //b的值比a小时就输出一个*号
          do{
            System.out.print("*");
            b++;
             }while(b<a);

        }while(a<=5);*/


       /*
       //把控制台输入的值获取存到“shuru"里
        Scanner shuru=new Scanner(System.in);

        System.out.println("输入");
        //把“shuru"里的值赋值给num
        int num=shuru.nextInt();
        int changdu=0;


        if(num>=0){
            while(num!=0){
                //当数字不为0时，长度+1
                changdu++;
                //把数字除以10用于缩减一位
                num/=10;
            }
            System.out.println(changdu);
        }
*/

        /*Scanner shuru=new Scanner(System.in);
        System.out.println("输入成绩");
        int chengji = shuru.nextInt();
        int cishu = 0;
        System.out.println("加分前成绩"+chengji);
       while(chengji <=60) {
           chengji++;
           cishu++;
           *//*System.out.println("加分后成绩"+chengji);
           System.out.println(cishu);*//*
        }
        System.out.println("加分后成绩"+chengji);
        System.out.println(cishu);*/



      /*  int banji=3;
        int student=4;
        int sum=0;
        int avg=0;
        Scanner input=new Scanner(System.in);
        for (int i = 1; i <=banji ; i++) {

            //每次循环完一个班级就把总分清0，否则就会继续算到下一个班级的总分里去
            sum=0;
            System.out.println("输入班级号");
            for (int j = 1; j <=student ; j++) {
                System.out.println("输入第"+j+"个学生成绩");
                int score=input.nextInt();
                //算出当前班级所有学生分数的总和
                sum=sum+score;
            }
            //当初当前班级的学生平均分
            avg=sum/4;
            System.out.println("平均分"+avg);
        }*/

     /*  String[] hobbys={"ddd","fff","ssss"};
        for (int i = 0; i < hobbys.length ; i++) {
            System.out.println(hobbys[i]);
        }*/


    /* int[] num={61,23,4,74,13,148,20};
     int maxnum=num[0];
     int mixnum=num[0];
     double sum=0;
     double avg=0;
        for (int i = 0; i <num.length ; i++) {
            //假如当前数字比最小值还小，就替换mixnum的值
            if (num[i] <mixnum) {
                mixnum=num[i];
            }
            //假如当前数字比最大值还大，就替换maxnum的值
            if (num[i] >maxnum) {
                maxnum=num[i];
            }
            //循环数组中每个数字时，算出和
            sum=sum+num[i];
        }
        //算数组平均数，除以整个数组的长度
     avg=sum/num.length;
        System.out.println("最小值"+mixnum);
        System.out.println("最大值"+maxnum);
        System.out.println("和"+sum);
        System.out.println("平均值"+avg);*/

    /*String[] a={"sss","aaa","bbbbbb"};
    //使用Arrays类的sour()方法对数组进行排序
        Arrays.sort(a);
        //使用Arrays类的toString（）方法将数组转化为字符串
        System.out.println(Arrays.toString(a));*/



   /* int inputArr[]=new int[5];  //定义数组长度为5
        Scanner input=new Scanner(System.in);
        System.out.println("输入值");
        for (int i = 0; i <inputArr.length ; i++) {
            //把每次输入的值存在数组中的对应位置，不能超过5个
            inputArr[i]=input.nextInt();

        }
        //把输入的值升序排序
        Arrays.sort(inputArr);
        //用for循环从数组最后面开始遍历取最大的值，依次取到最前面一个，就变成降序
       int i;
        for ( i = 4; i >=0 ; i--) {
          System.out.println(inputArr[i]);
        }
        //转化为字符串的形式输出
       // System.out.println(Arrays.toString(inputArr));
       */



   /*int[][] num={{1,2,3},{4,5,6}};
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                System.out.print(num[i][j]);
            }
            System.out.println();
        }*/


   /*int[][] num=new int[3][];
   num[0]=new int[2];
   num[1]=new int[3];
   num[2]=new int[4];
   num[0][0]=1;
   num[0][1]=2;
   //num[0][2]=3;
   num[1][0]=1;
   num[1][1]=2;
   num[1][2]=3;
   num[2][0]=1;
   num[2][1]=2;
   num[2][2]=3;
   num[2][3]=4;
        System.out.print(num[0][0]);
        System.out.println(num[0][1]);
        System.out.print(num[1][0]);
        System.out.print(num[1][1]);
        System.out.println(num[1][2]);
        System.out.print(num[2][0]);
        System.out.print(num[2][1]);
        System.out.print(num[2][2]);
        System.out.println(num[2][3]);*/


   /*String[][] num={{"t","e","f"},{"g","k","s"}};

        for (int i = 0; i <num.length ; i++) {

            for (int j = 0; j <num[0].length ; j++) {

                System.out.print(num[i][j]);
            }
            System.out.println();
        }*/

      one b=new one();
       int [] c= b.a(6);
        System.out.println(Arrays.toString(c));

    }
         public int[] a(int length ){
        int[] nums=new int[length];
             for (int i = 0; i <nums.length ; i++) {
                       nums [i]=(int)(Math.random()*100);
             }
             return nums;
           //System.out.println("aaaa");

          }







}
