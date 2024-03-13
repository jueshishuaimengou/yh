package com.utilsTest;

import com.utils.simHashUtil;
import com.utils.txtIOUtil;
import org.junit.Test;

public class simHashUtilTest {

    @Test
    public void getHashTest(){
        String[] strings = {"内心", "永远", "真实", "真正", "写作", "作家"};
        for (String string : strings) {
            String stringHash = simHashUtil.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = txtIOUtil.readTxt("C:\\Users\\阳昊\\Desktop\\测试文本\\orig.txt");
        String str1 = txtIOUtil.readTxt("C:\\Users\\阳昊\\Desktop\\测试文本\\orig_0.8_add.txt");
        System.out.println(simHashUtil.getSimHash(str0));
        System.out.println(simHashUtil.getSimHash(str1));
    }
}
