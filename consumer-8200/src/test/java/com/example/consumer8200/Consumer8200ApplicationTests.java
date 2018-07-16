package com.example.consumer8200;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Consumer8200ApplicationTests {

    @Test
    public void contextLoads(){
        Integer n = 10;
        System.out.println(recursionSum(n));
    }

    public static Integer recursionSum(Integer n ){
        if (n > 0){
            return n+recursionSum(n-1);
        } else{
            return 0;
        }
    }


}
