/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.edx.test101;


import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author edx
 */
public class CodeTest101 {

    public int getBestProfit(int[] stockPrice) {

        int minValue = 0;
        int maxValue = 0;
        SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i = 0; i < stockPrice.length; i++) {
            map.put(stockPrice[i], i);
        }

        minValue = map.firstKey();
        maxValue = map.lastKey();

        //verify minValue occurred in time before MaxValue
        while (map.get(minValue) > map.lastKey()) {
            map.remove(minValue);
            minValue=map.firstKey();
        }
        return maxValue - minValue;

    }
}
