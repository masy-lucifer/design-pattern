设计六大原则：开闭原则、单一原则、里氏替换原则、依赖倒置原则、接口隔离原则、迪米特法则  
*1、开闭原则（Open closed Principle OCP）*   
	对扩展开放，对修改关闭。  
含义：当应用的需求改变时，在不修改实体源代码的前提下，可以扩展模块的功能，使其满足新的需求。  

2、单一原则（Single Responsibility Principle SRP）
	一个类只负责一个职责，有且仅有一个引起它变化的原因。
核心：控制类的粒度大小、讲对象解耦、提高其内聚性。
优点：降低复杂度、提高可读性、提高可维护性、降低变更引起的风险。

3、里氏替换原则（Liskov Substitution Principle LSP）
	子类可以扩展父类的功能，但不能改变父类原有的功能。
	里氏替换原则主要阐述了有关继承的一些原则。
	里氏替换原则是实现开闭原则的重要方式之一。

4、依赖倒置原则（Dependece Inversion Principle DIP）
	高层模块不应该依赖底层模块，两者都应该依赖于抽象；抽象不应该依赖于细节，细节应该依赖于抽象。
	是开闭原则的基础。
核心：面向接口编程，依赖于抽象，不依赖具体。

5、接口隔离原则（Interface Segregation Principle ISP）
	每个接口中不存在子类用不到却必须实现的方法，如果不然就要将接口拆分。
	
6、迪米特法则（Law of Demeter LOD）
	一个类对于依赖的类知道的越少越好。
	只与直接朋友通讯。
	类之间只要有耦合关系，就叫朋友关系。
	耦合分为依赖、关联、聚合、组合等。
	我们称出现在成员变量、方法参数、方法返回值的类称为直接朋友，局部变量、临时变量则不是直接朋友。
	
23种设计原则分类
创建模式：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。
结构性模式：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享员模式。
行为模式：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介模式、解释器模式。

1、单例模式（Singleton） 
    只有一个实例对象、必须有单例类自己创建实例。 
    单例模式分类懒汉式和饿汉式。 
优点：只需创建一个实例，减少系统开销；省去new 操作，降低内存使用，减轻GC压力。 
缺点：没有接口，扩展困难；若要扩展，需要更改原来代码，违反开闭原则；单例模式功能通常写在一个类中，若涉及不合理，容易违反单一职责。

2、工厂模式（Factory） 
    工厂模式分类简单工厂模式、工厂方法模式、抽象工厂模式。 
    把被创建的对象称为“产品”，把创建产品的对象称为“工厂”。 
2.1、简单工厂 
    若创建的产品不多，只要一个工厂类，这就是简单工厂模式。 
    简单工厂创建实例的方法通常为静态方法，因此又叫做静态工厂方法。 
    简单工厂模式每增加一个产品就要增加一个对应的产品类并修改工厂类，违反了开闭原则。
2.2、工厂方法模式（Factory Method）
    工厂方法模式是对简单工厂模式的进一步抽象化，使其在不修改原来代码的情况下增加新产品，满足开闭原则。
主要角色：
    抽象工厂(Abstract Factory):提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法来创建产品;
    具体工厂(Concrete Factory):主要是实现抽象工厂中的抽象方法，完成具体的产品创建;
    抽象产品(Abstract Product):定义类产品的规范，描述了产品的主要特性和功能;
    具体产品(Concrete Product):实现了抽象产品角色定义的接口,由具体工厂来创建,它同具体工厂之间一一对应。
优点：灵活性增强，增加新的产品，只需增加一个对应的工厂类；高层模块只需知道产品的抽象类，无需知道具体实现类；满足迪米特法则、依赖倒置原则和历史替换原则。
缺点：类的个数容易过多，增加复杂度；抽象产品只能生产一种产品，此弊端可用抽象工厂模式解决。
2.3、抽象工厂模式（Abstract Factory）
    提供一个创建一系列相关或相互依赖的对象接口，而无需指定具体的类。
    抽象工厂模式与工厂方法模式拥有相同的角色，区别是：
    工厂方法只有一个抽象产品类，而抽象工厂模式有多个;工厂方法模式的具体工厂类只能创建一个具体产品类实例，而抽象工厂模式可以创建多个。
    当抽象工厂模式增加一个产品族时，只需增加其具体产品和该产品族的工厂;当要增加一个产品等级时，需要修改抽象工厂及其具体工厂，违反了开闭原则。
    
产品族和产品等级：
    海尔空调        海尔电视
    TCl空调        TCL电视
海尔空调及海尔电视  -------  称为产品族
海尔空调及TCL空调  -------  称为产品等级
    
工厂方法模式：
    一个抽象产品类，可以派生出多个具体产品类。   
    一个抽象工厂类，可以派生出多个具体工厂类。   
    每个具体工厂类只能创建一个具体产品类的实例。
抽象工厂模式：
    多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。   
    一个抽象工厂类，可以派生出多个具体工厂类。   
    每个具体工厂类可以创建多个具体产品类的实例，也就是创建的是一个产品线下的多个产品。   

3、建造者模式(Builder)
概念：将一个复杂对象的构建和它的表示分离，使得同样的构建过程可以创建不同的表示。
四个主要角色：
    产品(Product): 一般是一个复杂的对象，也就是说创建过程比较复杂；产品可以由一个抽象类与她的不同具体类组成，也可以是多个抽象类与她们的具体类组成。
    抽象建造者(Builder):抽象建造者的目的是为了将创建对象的具体过程交于她的子类来实现，更容易扩展；至少会有两个抽象方法，一个用来建造产品，一个用来返回产品。
    具体建造者(Concrete Builder):实现抽象建造者的抽象方法，具体是两项任务：组件产品和返回组建好的产品。
    指挥者/导演(Directon):它调用建造者来组建产品，不与产品类发生依赖关系。
优点:封装性好，构建和表现分离;扩展性好，各个具体建造者相互独立，利于系统解耦;客户端不必知道产品内部组成细节。
缺点:产品组成部分必须相同，限制其使用范围;若产品的内部变化复杂，当产品内部变化时，建造者也要同步修改，后期维护成本大。

4、原型模式(Prototype) 
    将一个对象作为原型，对其进行复制、克隆，产生一个与原对象类似的新对象。
浅复制:将一个对象复制后，基本数据类型变量会重新创建，而引用类型，还是指向原来对象所指向的地址；
深复制:将一个对象复制后，基本数据类型和引用类型，都会重新创建。
优点:java自带的原型模式基于内存二进制流的复制，在性能上比直接new一个对象更加优良。
缺点:需要为每个类配置复制的方法;当对已有对象进行改造时，需要修改代码，违反了开闭原则;深度复制时，每一层对象都要支持深度复制。
    




