package testone;

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

         /*int sum=0;//保存不能被3整除的数之和
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


       /*//把控制台输入的值获取存到“shuru"里
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


        int chengji = 53;
        int cishu = 0;
        System.out.println("加分前成绩"+chengji);
       while(chengji <60) {
           chengji++;
         cishu++;
        }
        System.out.println("加分后成绩"+chengji);
        System.out.println(cishu);

    }

    }


