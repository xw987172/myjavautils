package mymath;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

public class mymathclass {
    public static double oudistance(double[] arg1,double[] arg2){
        if(arg1.length!=arg2.length)
            throw new ValueException("两组向量长度不一致！");
        int len = arg1.length;
        double sum = 0.0;
        for (int i =0;i<len;i++){
            sum += Math.pow((arg2[i]-arg1[i]),2);
        }
        return Math.pow(sum,0.5);
    }
}
