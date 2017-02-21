###命令模式

###定义
命令模式将"请求"封装成对象,以便使用不同的请求,队列或者日志来参数化其他对象,命令模式也支持撤销操作

###实现思路
* 调用者持有命令对象(接口类型)
* 具体的命令对象持有接收者,由接收者来实现命令接口的方法
* 调用者与接收者之间通过命令对象接口实现解耦

###延伸
* 可使用宏命令整合多个命令
* 使用堆栈纪录每一步操作,可以实现多次撤销
* 结合多线程,可以用来实现线程池,工作队列等
* 也可以用来实现日记和事务系统
