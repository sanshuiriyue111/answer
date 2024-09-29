public class test { 
    public static void main(String[] args) { 
        class Person{
            public Person(String name,int age) { 
                this.name=name;//使用this 指向该对象避免因名重复引发问题
                this.age = age;
            }
            public Person(Person other) { 
                this.name=name;
                this.age = age;
            }
            private  static int count = 0;
            public Person () { 
                count++;
            }
            public static int getObjectCount() { 
                return count;
            }


            
    private String name;
    public int age;
    private int sex;

    public void eat() {
    	System.out.println(name+"正在吃东西");
    }

    private void sleep() {
       int age = 18;
        if (this.age <age) { 
            System.out.println("你必须睡八小时往上");
        } else { 
            System.out.println("好了熬你的吧");
        }
    
    }

    private void dadoudou() {
        System.out.println("我爱打电动");
    	
    }
    
}
Person p = new Person("张三",18);
Person q = new Person(p);//使用复制构造函数复制了p的对象
Person a = new Person();
Person b = new Person();
a.name = "小华";
p.age = 17;
p.sleep();
p.eat();
p.dadoudou();
System.out.println("对象的数量是：" + Person.getObjectCount());
}
    }
