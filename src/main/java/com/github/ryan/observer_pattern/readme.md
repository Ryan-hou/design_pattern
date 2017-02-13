###观察者模式(出版者+订阅者)

###定义
观察者模式定义了对象之间的一对多依赖,这样一来,当一个对象改变状态时,他的所有依赖者
都会收到通知并自动更新

###设计原则
为了交互对象之间的松耦合设计而努力
* 关于观察者的一切,主题只知道观察者实现了某个接口
* 改变主题或者观察者其中一方,并不会影响另一方.因为两者是松耦合的(对象之间的依赖降到了最低),
所以只要它们之间的接口仍被遵守,我们就可以自由的改变它们

###在jdk中的应用
* Swing中大量使用观察者模式,许多GUI框架也是如此
* RMI,JavaBeans(PropertyChangeListener)中
* java.util.Observable与java.util.Observer
但是Observable是一个具体类,并且没有实现任何接口,限制了他的使用和复用:
1)因为Observable是一个具体类,所以必须设计另一个类继承他,这就是限制这个类继承别的超类,从而
限制了Observable的复用潜力
2)因为没有Observable接口,所以我们也无法建立自己的实现和Java内置的 Observer API搭配使用,
也无法将他的实现换成另一套做法(因为 Observable的关键方法如setChanged被用protected关键字保护了起来,不能
使用组合来使用,这就违背了"多用组合,少用继承"的原则);所以如果你不能扩展Observable接口来满足需求,最好自己
实现这个模式
3)代码不要依赖于观察者被通知的次序:因为Observable是一个具体类,一旦实现有变,通知次序也可能会变,这不是
一个松耦合的设计