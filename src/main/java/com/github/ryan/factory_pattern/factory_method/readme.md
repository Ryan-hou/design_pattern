###工厂方法模式

###定义
工厂方法模式定义了一个创建对象的接口,但由子类决定要实例化的类是哪个.工厂方法让类把实例化推迟到子类

###注意
* 定义中的决定,并不是指模式允许子类本身在运行时做决定,而是指在编写创建者类时,不需要知道实际创建的产品是哪个,
选择了使用哪个子类,自然就决定了实际创建的产品是什么
* 所有的工厂模式都是用来封装对象的创建,工厂方法模式通过让子类决定该创建的对象是什么,来达到将对象创建的过程封装的目的
* 工厂方法将客户和实际创建具体产品的代码分隔开

###设计原则
* 封装变化
可以将创建对象的代码封装起来,实例化具体类的代码,很可能以后经常需要变化(当然像 String这种不会变化的类就不需要使用工厂了).
将创建对象的代码集中起来,方便维护,避免重复;这也意味着客户在实例化对象时,只会依赖接口而不是具体类
* 依赖倒置原则: Dependency Inversion Principle
在代码中减少对于具体类的依赖是件"好事"
依赖倒置原则是指:要依赖抽象,不要依赖具体类;不能让高层组件依赖低层组件,而是,不管高层组件还是低层组件,两者都应该依赖于抽象

###与简单工厂的区别
简单工厂是把所有的事情,在一个地方都处理完了,然而工厂方法却是创建一个框架,让子类决定要如何实现







