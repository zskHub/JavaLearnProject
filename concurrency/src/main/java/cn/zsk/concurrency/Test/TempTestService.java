package cn.zsk.concurrency.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author : zsk
 * @CreateTime : 2021-05-17   21:41
 */
@Slf4j
public class TempTestService {

    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                dog();
            }
        }.start();

        cat();
    }

    public static void dog(){
        for (; ;){
            try {
                log.info("I am a dog");
                Thread.sleep(1000);
            }catch (Exception e){
                log.error("dog error。e:{}", e);
            }

        }

    }

    public static void cat(){
        for (; ;){
            try {
                log.info("I am a cat");
                Thread.sleep(1000);
            }catch (Exception e){
                log.error("cat error。e:{}", e);
            }
        }

    }
}
