package cn.zsk.basic.jvm.gc;

/**
 * 对象可以在被GC时自救
 * 这种自救机会只有一次，因为一个对象的finalize()方法最多只会被系统自动调用一次
 *
 * @Author : zsk
 * @CreateTime : 2021-08-04   21:17
 */
public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;

    public void isAlive(){
        System.out.println("欧耶，我还活着");
    }

    @Override
    protected void finalize () throws Throwable{
        super.finalize();
        System.out.println("finalize method executed:");
        FinalizeEscapeGC.SAVE_HOOK = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOOK = new FinalizeEscapeGC();
        //对象第一次拯救自己
        SAVE_HOOK = null;
        System.gc();
        //finalize方法优先级低，这里睡一会
        Thread.sleep(500);

        if (null != SAVE_HOOK){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("Oh,No,我已经死了");
        }

        //然后下面再一次拯救自己，失败了
        SAVE_HOOK = null;
        System.gc();
        //finalize方法优先级低，这里睡一会
        Thread.sleep(500);

        if (null != SAVE_HOOK){
            SAVE_HOOK.isAlive();
        }else {
            System.out.println("Oh,No,我已经死了");
        }
    }
}
