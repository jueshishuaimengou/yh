package com;

import com.utils.HammingUtil;
import com.utils.simHashUtil;
import com.utils.txtIOUtil;
import org.junit.Test;

public class MainTest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = txtIOUtil.readTxt("C:\\Users\\阳昊\\Desktop\\测试文本\\orig.txt");
        str[1] = txtIOUtil.readTxt("C:\\Users\\阳昊\\Desktop\\测试文本\\orig_0.8_add.txt");
        String ansFileName = "C:\\Users\\阳昊\\Desktop\\测试文本\\answer.txt";
        double ans = HammingUtil.getSimilarity(simHashUtil.getSimHash(str[0]), simHashUtil.getSimHash(str[1]));
        txtIOUtil.writeTxt(ans, ansFileName);
    }

}
